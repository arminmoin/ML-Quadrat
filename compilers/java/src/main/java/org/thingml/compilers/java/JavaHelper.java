/**
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 */
package org.thingml.compilers.java;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.Set;

import org.thingml.compilers.Context;
import org.thingml.xtext.helpers.AnnotatedElementHelper;
import org.thingml.xtext.helpers.ConfigurationHelper;
import org.thingml.xtext.helpers.ThingHelper;
import org.thingml.xtext.thingML.Configuration;
import org.thingml.xtext.thingML.Enumeration;
import org.thingml.xtext.thingML.Function;
import org.thingml.xtext.thingML.Message;
import org.thingml.xtext.thingML.ObjectType;
import org.thingml.xtext.thingML.Parameter;
import org.thingml.xtext.thingML.Thing;
import org.thingml.xtext.thingML.Type;

/**
 * Created by bmori on 09.12.2014.
 */
public class JavaHelper {

    public static String getDefaultValue(Type type) {
        if (AnnotatedElementHelper.isDefined(type, "java_type", "boolean"))
            return "false";
        else if (AnnotatedElementHelper.isDefined(type, "java_type", "int"))
            return "0";
        else if (AnnotatedElementHelper.isDefined(type, "java_type", "long"))
            return "0";
        else if (AnnotatedElementHelper.isDefined(type, "java_type", "float"))
            return "0.0f";
        else if (AnnotatedElementHelper.isDefined(type, "java_type", "double"))
            return "0.0d";
        else if (AnnotatedElementHelper.isDefined(type, "java_type", "byte"))
            return "0";
        else if (AnnotatedElementHelper.isDefined(type, "java_type", "short"))
            return "0";
        else if (AnnotatedElementHelper.isDefined(type, "java_type", "char"))
            return "'\u0000'";
        else
            return "null";
    }

    public static String getJavaType(Type type, boolean isArray, Context ctx) {
        StringBuilder builder = new StringBuilder();
        if (type == null) {//void
            builder.append("void");
        } else {
        	if (type instanceof Enumeration) {
        		final Enumeration e = (Enumeration) type;
        		if (e.getTypeRef() != null && e.getTypeRef().getType() != null) {
        			type = e.getTypeRef().getType();
        		}
        	}
            if (AnnotatedElementHelper.hasAnnotation(type, "java_type")) {
                builder.append(AnnotatedElementHelper.annotation(type, "java_type").toArray()[0]);
            } else {
                System.err.println("WARNING: no Java type defined for ThingML datatype " + type.getName());
                builder.append("/*No Java type was explicitly defined*/ Object");
            }
            if (isArray) {//array
                builder.append("[]");
            }
        }
        return builder.toString();
    }

    public static void generateHeader(String pack, String rootPack, StringBuilder builder, Context ctx, boolean isMain, boolean hasMessages) {
        builder.append("/**\n");
        builder.append(" * File generated by the ThingML IDE\n");
        builder.append(" * /!\\Do not edit this file/!\\\n");
        builder.append(" * In case of a bug in the generated code,\n");
        builder.append(" * please submit an issue on our GitHub\n");
        builder.append(" **/\n\n");

        builder.append("package " + pack + ";\n\n");

        builder.append("import no.sintef.jasm.*;\n");
        builder.append("import no.sintef.jasm.ext.*;\n\n");
        
        //ML2
        builder.append("import java.time.LocalDateTime;\n");
        builder.append("import java.time.format.DateTimeFormatter;\n");
        builder.append("import java.io.File;\n");
        builder.append("import java.io.FileWriter;\n");
        builder.append("import java.io.BufferedWriter;\n");
        builder.append("import java.io.BufferedReader;\n");
        builder.append("import java.io.InputStreamReader;\n");
        builder.append("import java.util.List;\n");
        builder.append("import java.util.ArrayList;\n");
        builder.append("import java.io.IOException;\n\n");
                
        if (hasMessages) {
            builder.append("import " + rootPack + ".api.*;\n");
            builder.append("import " + rootPack + ".messages.*;\n\n");
        }

        builder.append("import java.util.*;\n");
    }

    //FIXME: use the new builder by @jakhog
    public static void generateParameter(Message m, StringBuilder builder, Context ctx) {
        int i = 0;
        for (Parameter pa : m.getParameters()) {
            if (i > 0)
                builder.append(", ");
            builder.append(JavaHelper.getJavaType(pa.getTypeRef().getType(), pa.getTypeRef().isIsArray(), ctx) + " " + ctx.protectKeyword(ctx.getVariableName(pa)));
            i++;
        }
    }

    public static void generateParameter(Function m, StringBuilder builder, Context ctx) {
        int i = 0;
        for (Parameter pa : m.getParameters()) {
            if (i > 0)
                builder.append(", ");
            builder.append("final " + JavaHelper.getJavaType(pa.getTypeRef().getType(), pa.getTypeRef().isIsArray(), ctx) + " " + ctx.protectKeyword(ctx.getVariableName(pa)));
            i++;
        }
    }

    public static Set<String> allSrcFolders(Configuration cfg) {
        Set<String> result = new HashSet<String>();
        for (Thing t : ConfigurationHelper.allThings(cfg)) {
            for (String dep : AnnotatedElementHelper.allAnnotation(t, "src")) {
            	final Path p = Paths.get(new File(t.eResource().getURI().toFileString()).getParent()).resolve(Paths.get(dep)).toAbsolutePath();
            	result.add(p.toString());
            }
        }
        for (ObjectType t : ConfigurationHelper.allObjectTypes(cfg)) {
            for (String dep : AnnotatedElementHelper.annotation(t, "src")) {
            	final Path p = Paths.get(new File(t.eResource().getURI().toFileString()).getParent()).resolve(Paths.get(dep)).toAbsolutePath();
            	result.add(p.toString());
            }
        }
        return result;
    }
    
    public static Set<String> allMavenDep(Configuration cfg) {
        Set<String> result = new HashSet<String>();
        for (Thing t : ConfigurationHelper.allThings(cfg)) {
        	Set<String> deps = new HashSet();
    		deps.addAll(AnnotatedElementHelper.annotation(t, "maven_dep"));
    		for(Thing include : ThingHelper.allIncludedThings(t))
    			deps.addAll(AnnotatedElementHelper.annotation(include, "maven_dep"));        	        
            for (String dep : deps) {
                String cleanDep = dep.replace(" ", "").replace("\n", "").replace("\t", "");
                result.add(cleanDep);
            }
        }
        for (ObjectType t : ConfigurationHelper.allObjectTypes(cfg)) {
            for (String dep : AnnotatedElementHelper.annotation(t, "maven_dep")) {
                String cleanDep = dep.replace(" ", "").replace("\n", "").replace("\t", "");
                result.add(cleanDep);
            }
        }
        return result;
    }
    
   public static Set<String> allMavenRepo(Configuration cfg) {
       Set<String> result = new HashSet<String>();
       for (Thing t : ConfigurationHelper.allThings(cfg)) {
           for (String dep : AnnotatedElementHelper.annotation(t, "maven_repo")) {
               String cleanDep = dep.replace(" ", "").replace("\n", "").replace("\t", "");
               result.add(cleanDep);
           }
       }
       for (ObjectType t : ConfigurationHelper.allObjectTypes(cfg)) {
           for (String dep : AnnotatedElementHelper.annotation(t, "maven_repo")) {
               String cleanDep = dep.replace(" ", "").replace("\n", "").replace("\t", "");
               result.add(cleanDep);
           }
       }
       return result;
   }    
}
