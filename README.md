# ML-Quadrat (ML2)
ML2 is a free open source Model-Driven Software Engineering (MDSE) tool for creating smart services for the Internet of Things (IoT) and Cyber-Physical Systems (CPS). ML2 is based on [ThingML](https://github.com/TelluIoT/ThingML). Please read the accompanying license agreement (Apache License Version 2.0). 

# Table of Contents

1. [Reporting Issues/Bugs and Requests](#issues)
2. [ML2 Users' Documentation (Tutorial)](#user-doc)
3. [ML2 Maven Artifacts](#maven)
4. [ML2 Developers' Documentation (for Contributors)](#dev-doc)


Note: The name ML-Quadrat (German word for ML-Square / MLˆ2) refers to the fact that the project is about two MLs: (i) ML for Modeling Language; (ii) ML for Machine Learning. However, in the following documentation and also in the source code comments, we refer to the project name as ML2 for simplicity.

<a name="issues"></a>
## Reporting Issues/Bugs and Requests
Currently, ML2 is a research prototype. If you find any issues/bugs or have any feature request, please kindly report that through our issue tracking system: https://github.com/arminmoin/ML-Quadrat/issues

<a name="user-doc"></a>
## ML2 Users' Documentation (Tutorial)
If you are looking for a tutorial to learn how to use ML2, please read the users' documentation below. Our documentation focuses on Linux and mainly Java. However, a number of other platforms and programming languages may also be used similarly with minor modifications.

Since ML2 is based on ThingML, we highly encourage those users, who are not familiar with ThingML, to first read the documentation of ThingML and take a look at their samples: https://github.com/TelluIoT/ThingML

### Why ML2?
ThingML and other Model-Driven Software Engineering (MDSE) tools, that we are aware of, do not support Machine Learning and Data Analytics on the modeling level. However, those concepts are currently  crucial for developing smart IoT services. Therefore, we enable Machine Learning and Data Analytics through our Domain-Specific Modeling Language (DSML) and tool.

### How to install ML2?
**Prerequisites:**
You need Git (https://git-scm.com/), Maven (https://maven.apache.org/), the Java Development Kit (JDK) version 8+, Python 3 (Anaconda recommended: https://www.anaconda.com/), Scikit-learn, e.g., version 0.22.1 (https://scikit-learn.org), Tensorflow / TensorFlow-GPU, e.g., version 1.15.0 (https://www.tensorflow.org/), Keras, e.g., version 2.3.1 (https://keras.io/) and Pytorch, e.g., version 1.4.0 (https://pytorch.org/). They are all free open source software.

Go to the terminal / shell / command line and follow the steps below.

1. Check out the source code from our Git repository:
```bash
git clone https://github.com/arminmoin/ML-Quadrat/
```
2. In principle, it is possible to use any text editor, e.g., vi / vim to create a model instance, if you follow the syntax of our Domain-Specific Modeling Language (DSML) and save the text file with the **.thingml** extension. However, a major added value of our tool is provided through our customized model editors. ML2 and ThingML are built on top of the Eclipse Modeling Framework (EMF). Thus, in order to benefit from our model editors, you need to run the Eclipse Modeling Tools. You can download and install that IDE from https://www.eclipse.org/downloads/packages/.

Once installed, you shall create a new workspace and then import the ML2 project there. Perhaps there are different ways to accomplish that. However, we recommend the following method:

File -> import -> General -> Existing Projects into Workspace (you may also check the option **search for nested projects** in the wizard)

Make sure that you wait sufficiently long, so that the (sub-/nested) projects are built and you get a clean workspace without any errors. If that is not the case, sometimes cleaning the workspace (Project -> Clean... -> Clean all projects), updating the Maven projects (right click on a project -> Maven -> Update Project... -> Select All, you may also check the option **Force Update of Snapshots/Releases**) or restarting the Eclipse IDE (Eclipse Modeling Tools) might help.

3. Build the project using Maven:
```bash
mvn clean install
cd ML2/language
mvn clean install
cd ..
```

### How to create new model instances using ML2?
Before creating new model instances, you may want to take a look at our samples for 3 use cases: Smart Ping-Pong, Non-Intrusive Appliance Load Monitoring, and Energy Stock Exchange. Please check them out at https://github.com/arminmoin/ML-Quadrat/tree/master/ML2/org.thingml.samples/src/main/thingml.

As mentioned above, one may trivially use a text editor and follow the syntax of our DSML (Domain-Specific Modeling Language) to create new model instances with the **.thingml** extension. However, in order to exploit the power of our DSML and modeling tool, one may either employ our graphical tree model editor (EMF-based) or our customized textual model editor (Xtext-based). In what follows, we illustrate both options. Regardless of your choice, you will need to follow the steps below:

Step 1: Open the Eclipse IDE (Eclipse Modeling Tools) and choose the workspace, which contains ML2.

Step 2: Run a second (nested) instance of the Eclipse IDE by right-clicking on one of the (sub)projects, e.g., thingml, selecting "Run As" and then selecting "Eclipse Application". This way, a new (nested) instance of the Eclipse IDE will open, while the first (main) instance is still open. If you see any problems, e.g., concerning javax, ignore that and simply click on continue.

Step 3: Create a new project, say Demo_ML2 and then create a new file with the **.thingml** extension, say Test.thingml. This is a model instance, which shall conform to the ThingML meta-model (DSML). You may create this model instance by choosing File -> New -> Other -> Example EMF Model Creation Wizards -> ThingML Model, clicking on Next, then giving it the name Test.thingml, Clicking on Next, selecting **Model** as the **Model Object**, and finally clicking on Finish. 

By default, our textual Xtext-based model editor will open. You will need to write the following in that text editor and save the file:
```
thing my {
	
}
```

#### Using the Graphical EMF-based Model Editor

Now, if you right-click on the model instance and select Open With -> **ThingML Model Editor**, the **graphical** EMF-based tree model editor of ML2 will open.

#### Using the Textual Xtext-based Model Editor

However, if you right-click on the model instance and select Open With -> **ThingML Editor**, the **textual** Xtext-based model editor of ML2 will open.

#### Which Model Editor to Choose?
There is no universal answer to this question. Some users prefer the textual editor, whereas some other ones find the graphical one more convenient. Please give both a try if you are not sure about your own preference.

#### Understanding the data analytics block of ML2 model instances

This is a sample data analytics block in our demo, Smart Ping-Pong, which you may find at https://github.com/arminmoin/ML-Quadrat/tree/master/ML2/org.thingml.samples/src/main/thingml:

	data_analytics da1 {
		dataset "data/ip_dataset.csv"
		sequential TRUE
		timestamps ON
		labels ON
		features client_ip_address,prediction
		model_algorithm decision_tree my_dt()
		training_results "data/training.txt"		
		prediction_results prediction
	}
	
(i) dataset: This is the path to the Comma-Separated Values (CSV) file, which contains the dataset that should be used for data analytics.

(ii) sequential: This is a Boolean (TRUE/FLASE) value that indicates whether the dataset is a sequential / temporal one, i.e., whether the order of the data instances must be preserved or not. If this is true, then, e.g., cross validation shall not be practiced.

(iii) timestamps: This is a binary (ON/OFF) value, which indicates whether timestamps are present in the dataset or not. If this is on, it means we should assume that the first column in the CSV file contains the timestamps. Also, timestamps shall be added to new data instances through the da_save action of the action language used in the state charts.

(iv) labels: This is a binary (ON/OFF) value, which indicates whether the dataset is labeled or not. If the data instances are labeled, it means we can do supervised machine learning, i.e., classification or regression. In this case, the last feature in the CSV file is always the class label for each data instance (on each row).

(v) features: Here, we list the features in the machine learning sense. If labels (see above) is on, then the last item on this comma-separated list is the class label.

(vi) model_algorithm: This is the model/algorithm that must be used for conducting data analytics / machine learning. We support a number of them in ML2. Also, one may use the Predictive Model Markup Language (PMML) standard models.

(vii) training_results: This is the path to a text file, which contains the training log, i.e., the timestamps and names of the models/algorithms, which have been used for training.

(viii) prediction_results: Here we mention the property that shall contain the final result of the prediction of the data analytics model.

The auto-complete feature of our Xtext-based model editor or alternatively our EMF-based tree model editor can be quite useful for finding out all possible options to tune the data analytics models. For instance, depending on the configurations of your Eclipse IDE, by clicking on Control and Space buttons of your keyboard, you should be able to see all the suggestions of the model editor. Just as an example, if you click on those buttons at this point (at the end of the following line): 

model_algorithm nn_multilayer_perceptron my_nn_mlp(

you will see suggestions regarding the hyperparameters and configurations of the Neural Networks model, such as the choice of the ctivation function, optimizer, loss function and so forth. These choices are based on the APIs of the Keras library (see https://keras.io/guides) for the Deep Learning models, e.g., for the Multi-Layer Perceptron (MLP) Neural Network (NN), and based on the APIs of the Scikit-Learn library (see https://scikit-learn.org/stable/) for other models, e.g., Decision Trees and Random Forests.

Moreover, all keywords regarding data analytics are highlíghted in blue color in our textual xtext-based model editor.

#### The extended action language

If you are familiar with the action language of ThingML, you can notice that we introduced four new action types concerning data analytics:

(i) da_preprocess: This action leads to preprocessing the data, based on the data analytics block. The name of the corresponding data analytics block shall be mentioned after that, e.g., da_preprocess da1.

(ii) da_train: This action leads to training the data analytics model, based on the data analytics block. The name of the corresponding data analytics block shall be mentioned after that, e.g., da_train da1.

(iii) da_predict: This action leads to predictions using the data analytics model. The name of the corresponding data analytics block, as well as the values of the features, based on which the prediction shall occur, must be mentioned after that, e.g., da_predict da1(value).

(iv) da_save: This action leads to saving the prediction (new data) in the dataset. The name of the corresponding data analytics block shall be mentioned after that, e.g., da_save da1.

Please see our examples (ML2 Demos) at https://github.com/arminmoin/ML-Quadrat/tree/master/ML2/org.thingml.samples/src/main/thingml.

#### How to have the trained data analytics models retrained periodically
In our sample model instances, we show how to do this. For instance, see this line:

last_training_timer!timer_start(3600000)

in our examples here: https://github.com/arminmoin/ML-Quadrat/tree/master/ML2/org.thingml.samples/src/main/thingml. That is the time in milliseconds, thus in this case retraining the data analytics models in 1 hour periods always using the latest data in the CSV file (dataset). This way, we will take new data into account.

### How to generate the target software (IoT service / CPS application) using ML2?

If a model instance is incomplete or not valid according to the syntax and semantics of our DSML, you will not be able to generate source code out of that. In case your model instance is invalid with respect to the syntax, you will see errors already during the design time (modeling time) within the Eclipse IDE (i.e., in the second/nested Eclipse instance). However, in many cases, e.g., for semantic errors and most of the model incompleteness cases, one gets errors only after trying to generate the source code. Those errors will appear in the terminal / shell / command line.

The command-line interface JAR containing all you need to generate source code for the supported target platforms out of the model instances can be found here:

```bash
cd ML2/compilers/registry/target
java -jar compilers.registry-2.0.0-SNAPSHOT-jar-with-dependencies.jar
```
If you run the JAR file (e.g., with the -h or --help options), you will see the list of all options and commands.

For instance, if you want to generate source code in Java and Python for our samples (you can find our examples Smart Ping-Pong, Non-Intrusive Appliance Load Monitoring, and Energy Stock Exchange at https://github.com/arminmoin/ML-Quadrat/tree/master/ML2/org.thingml.samples/src/main/thingml), please use the commands below:

```bash
cd ML2/compilers/registry/target

java -jar compilers.registry-2.0.0-SNAPSHOT-jar-with-dependencies.jar -c java -s org.thingml.samples/src/main/thingml/ML2_Demo1_PingPong.thingml -o GeneratedDemo1

java -jar compilers.registry-2.0.0-SNAPSHOT-jar-with-dependencies.jar -c java -s org.thingml.samples/src/main/thingml/ML2_Demo2_NIALM_PSM_Java.thingml  -o GeneratedDemo2

java -jar compilers.registry-2.0.0-SNAPSHOT-jar-with-dependencies.jar -c java -s org.thingml.samples/src/main/thingml/ML2_Demo3_EnergyStockMarket.thingml  -o GeneratedDemo3 	

```
Note that we choose the Java "code generator" (also known as "model-to-code transformation" or "compiler") with the option **-c java** above. However, the framework will generate the Data Analytics part of the source code in Python. The generated Python code will seamlessly integrate with the generated Java code using the Process Builder API in Java.

### How to build and run the generated code?
The generated code is fully ready to be built using Maven. Please go to the directory, which contains the generated code. A pom.xml file, as well as a src directory are there. Please use Maven to build the generated code. For example, for our above example, GeneratedDemo1:

```bash
cd GeneratedDemo1
mvn clean install
```

Then, please create a data directory in target and a CSV (Comma Separated Values) data file to start with to avoid cold-start. For instance:
```bash
cd target
mkdir data
```

Please copy a sample CSV file from https://github.com/arminmoin/ML-Quadrat/tree/master/ML2/org.thingml.samples/src/main/thingml/ML2_Demos_SampleData into the data directory. For instance, in case of GeneratedDemo1, please use the CSV file called ip_dataset.csv. For GeneratedDemo2 and GeneratedDemo3, please use nialm.csv and esm.csv, respectively.

Now, you should be able to run the generated program easily. Please use java -jar to run the generated executable JAR file with all of the required dependencies. For instance, for GeneratedDemo1:
```bash
cd target
java -jar SmartPingPongCfg-1.0.0-jar-with-dependencies.jar
```
<a name="maven"></a>
## ML2 Maven Artifacts
You can find the Maven artifacts of ML2 at https://oss.sonatype.org (e.g., search for the groupid: io.github.arminmoin). You may add the dependencies to your pom.xml file. For instance, add the following to your pom.xml:

```
<dependency>
  <groupId>io.github.arminmoin</groupId>
  <artifactId>mlquadrat</artifactId>
  <version>2.0.0-SNAPSHOT</version>
  <type>pom</type>
</dependency>
```

<a name="dev-doc"></a>
## ML2 Developers' Documentation (for Contributors)
If you are going to contribute to this project, please read the developers' documentation below. Our documentation focuses on Linux and mainly Java. However, a number of other platforms and programming languages may also be used similarly with minor modifications.

Our focus is on the Java code generator (model-to-text transformation), which also generates Python code. However, the same strategy shall apply to the other supported target platforms and programming languages for code generation. 

### Contribution to the Modeling Language

Below, we explain the key sections for making changes to the modeling language. After any modifications, please build the project again using Maven:

```bash
mvn clean install
cd ML2/language
mvn clean install
cd ..
```
Also, generate the graphical EMF-based model editor by opening ThingML.genmodel at thingml -> model -> generated, then right-clicking on ThingML and generating the **Model Code**, the **Edit Code** and the **Editor Code**.

#### The Main Part: the Xtext Grammar

This is the core of the Domain-Specific Modeling Language (DSML). Even the Ecore meta-model is generated out of this grammar. You may find the grammar in the following path:

ML2/language/thingml/src/org/thingml/xtext/ThingML.xtext

If you are not already familiar with Xtext, please read the tutorial here:

https://www.eclipse.org/Xtext/documentation/index.html

#### Token To AttributeId Mapper

You may find this Java class (ThingMLAntlrTokenToAttributeIdMapper) in the following path:

ML2/language/thingml.ui/src/org/thingml/xtext/ui/ThingMLAntlrTokenToAttributeIdMapper.java

You can add any new keywords to the corresponding section of that.

#### Scope Provider

You may find this Xtend class (ThingMLScopeProvider) in the following path:

ML2/language/thingml/src/org/thingml/xtext/scoping/ThingMLScopeProvider.xtend

This shall be used for any possible adjustments of the scoping of the modeling language.

### Contribution to the Code Generation Framework

Below, we explain the key sections for making changes to the code generation framework (specifically for Java and Python). As mentioned, the code generator for Java also generates the required Python code for covering the Data Analytics and Machine Learning aspects. After any modifications, please build the project again using Maven:

```bash
cd ML2/compilers/java
mvn clean install
cd ..
mvn clean install
cd ..
mvn clean install
```
Also, generate the graphical EMF-based model editor by opening ThingML.genmodel at thingml -> model -> generated, then right-clicking on ThingML and generating the **Model Code**, the **Edit Code** and the **Editor Code**.

#### Java Helper

This Java class is located at ML2/compilers/java/src/main/java/org/thingml/compilers/java/JavaHelper.java

There, you can add any new Java packages that must be included among the imported packages in the generated Java code.

#### Java Thing Action Compiler

This Java class is located at ML2/compilers/java/src/main/java/org/thingml/compilers/java/JavaThingActionCompiler.java

This is the core of the code generation mechanism, based on the imperative action language. This is where you can instruct the code generation framework how to generate code for each "action" in a model instance, e.g., da_preprocess, da_train, etc.
