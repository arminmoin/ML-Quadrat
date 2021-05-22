**Watch our video (5 mins) on YouTube: https://youtu.be/YCNFfhmy_JY**

# ML-Quadrat (ML2)
ML2 is a Computer-Aided Software Engineering (CASE) tool, based on the Model-Driven Software Engineering (MDSE) paradigm, specifically the Domain-Specific Modeling (DSM) methodology with full code generation. ML2 is focused on creating smart services for the Internet of Things (IoT) and Cyber-Physical Systems (CPS). Moreover, it is based on the [ThingML](https://github.com/TelluIoT/ThingML) project. Similar to ThingML, ML2 is built using the Eclipse Modeling Framework (EMF), as well as Xtext, and is release under the terms of the Apache 2.0 permissive open source license. 

The name ML-Quadrat ("Quadrat" is the German word for "square" / ˆ2) refers to the fact that the project is about two MLs simultaneously: (i) ML for Modeling Language (as in ThingML); (ii) ML for Machine Learning, i.e., a sub-discipline of Artificial Intelligence (AI). However, in what follows, we refer to the project name as ML2 for simplicity.

## Why ML2?
ThingML and other Model-Driven Software Engineering (MDSE) tools for the IoT/CPS, that we are aware of, do not support Data Analytics and Machine Learning (DAML) at the modeling layer. However, DAML methods and techniques are crucial for developing smart IoT services and CPS applications. Therefore, we enable DAML at the modeling layer through our Domain-Specific Modeling Language (DSML) and tool. In other words, the practicioner has access to the APIs of ML libraries and frameworks, such as Scikit-Learn, Keras, TensorFlow, Pytorch and WEKA at the modeling layer. The model-to-code transformations generate the full source code of the entire software solution, including the ML part in a fully automated manner. 

Moreover, the generated code is capable of creating, training, deploying and possibly re-training the ML models as necessary. Further, one may bring a pre-trained ML model with any arbitrary architecture, which might have been trained using any learning algorithm, and simply "connect" or "plug" it into the software model. This is called the Blackbox-ML mode or the hybrid/mixed MDSE/Non-MDSE mode. This mode offers a lot of flexibility.

<a name="toc"></a>
# Table of Contents

1. [How to Cite ML2 in Your Publications](#citation)
2. [Reporting Issues/Bugs and Requests](#issues)
3. [Quick (15 mins) Tutorial](#user-doc-quick)
4. [Users' Documentation (Full Tutorial)](#user-doc)
5. [Maven Artifacts](#maven)
6. [Developers' Documentation (for Contributors)](#dev-doc)
7. [Exploitation & Industry Adoption](#exploitation)

<a name="citation"></a>
## 1. How to Cite ML2 in Your Publications
Please cite the following papers if you are using ML2 or referring to it in your papers:

1. **From Things’ Modeling Language (ThingML) to Things’ Machine Learning (ThingML2)**, Armin Moin, Stephan Rössler, Marouane Sayih, Stephan Günnemann, In Proceedings of the ACM / IEEE 23rd International Conference on Model Driven Engineering Languages and Systems (MODELS) Companion (Extended Abstract), 2020. Pre-print: https://arxiv.org/pdf/2009.10632
2. **ThingML+: Augmenting Model-Driven Software Engineering for the Internet of Things with Machine Learning**, Armin Moin, Stephan Rössler, Stephan Günnemann, In Proceedings of the ACM / IEEE International Conference on Model Driven Engineering Languages and Systems (MODELS) Workshops (MDE4IoT), 2018. Pre-print: https://arxiv.org/pdf/2009.10633.pdf

<a name="issues"></a>
## 2. Reporting Issues/Bugs and Requests
ML2 is a research prototype. If you find any issues/bugs or have any feature request, please kindly report that through our issue tracking system: https://github.com/arminmoin/ML-Quadrat/issues

<a name="user-doc-quick"></a>
## 3. Quick (15 mins) Tutorial
Here, we provide a quick tutorial to get familiar with ML2. However, in order to read the full documentation, please go to the section ML2 Users' Documentation (Full Tutorial) below.

### How to install ML2?
**System requirements and software prerequisites:**
We recommend a normal PC/laptop with at least 4GB of main memory (RAM) and at least 1GB of free disk space. In this tutorial, we use a x86_64 Linux system with the Ubuntu 20.04.2 LTS (focal) operating system. Please install the following software before proceeding with the installation of ML2:

1. Git (https://git-scm.com/): apt-get install git
2. The Java Runtime Environment (JRE) and the Java Development Kit (JDK): apt-get default-jre default-jdk
3. Apache Maven: https://maven.apache.org/: apt-get install maven 

**Now, please go to the Linux terminal / shell / command line and follow the steps below.**

1. Check out the source code from the Git repository:
```bash
git clone https://github.com/arminmoin/ML-Quadrat/
```

2. Install ML2 using the Apache Maven:
```bash
cd ML-Quadrat
mvn clean install -DskipTests
cd ML2/language
mvn clean install -DskipTests
cd ../..
```
### How to find a sample model instance?
There exist a number of sample model instances with the .thingml extension at this location: https://github.com/arminmoin/ML-Quadrat/tree/master/ML2/org.thingml.samples/src/main/thingml

Let's choose ML2_Demo_PingPong.thingml for this quick tutorial, and generate, e.g., the Python and Java source code out of it using the Python_Java model-to-code transformation (a.k.a. code generator or "compiler"). The details will be explained in the full tutorial below.

### How to generate code out of the sample model instance?
Run the following commands in the Linux terminal:
```bash
cd ML2/compilers/registry/target
java -jar mlquadrat.compilers.registry-2.0.0-SNAPSHOT-jar-with-dependencies.jar -c auto -s ../../../org.thingml.samples/src/main/thingml/ML2_Demo_PingPong.thingml -o ../../../../../Generated_ML2_Demo_PingPong
```
Note that the -c option specifies the model-to-code transformation (a.k.a. the code generator) or "**c**ompiler" that shall be deployed. Here, we choose "auto", since the model instance already includes this information in the configuration section of it. Also, the -s and the -o options let the user state the paths of the **s**ource model instance and the **o**utput directory for the target generated code, respectively. If the output directory does not exist, it will be created. 

The generated code will include the entire Java and Python source code that is needed, as well as the necessary build scripts. Thus, it can be easily built/installed using the Apache Maven with one command (mvn clean install). Also, the output of Maven will include an executable JAR file with all the dependencies as a bundle. Hence, running the generated IoT service will be also very easy with just one command (java -jar ...). Below, we illustrate how to install and run the generated code.

[Back to top](#toc)

<a name="user-doc"></a>
## 4. Users' Documentation (Full Tutorial)
Before reading the full tutorial below, you should first follow the quick (15 mins) tutorial above. In what follows, we first name the additional software packages that you should install. Then, we illustrate how the generated example in the quick tutorial can be installed and executed. Further, we show how the textual and the tree-based model editors can be used in the Eclipse IDE. Finally, we provide the full documentation of the Domain-Specific Modeling Langauge (DSML).

### Additional software prerequisites
I. Install the latest version of Anaconda for Python 3.x: https://docs.anaconda.com/anaconda/install/linux/

Then, please go to the Linux terminal and follow the steps below, in order to create a conda virtual environment and install the latest versions of the required Python libraries. They are necessary for running the generated code, if the generated code includes Python code for Data Analytics and Machine Learning (DAML).

1. conda create --name ml2 python=3.8
2. conda activate ml2
3. conda install networkx scipy tensorflow-gpu nb_conda jupyter scikit-learn seaborn matplotlib nomkl bokeh libiconv numpy pandas nltk gensim keras pytorch
4. conda install jupyter_contrib_nbextensions -c conda-forge
5. conda deactivate
6. conda activate ml2

II. Install the latest version of the Eclipse IDE, specifically the Eclipse Modeling Tools: https://projects.eclipse.org/projects/modeling

III. Install the Xtext ANTLR plugin from the following update site in the Eclipse IDE: https://download.itemis.de/updates/releases/2.1.1/

### How to install and execute the generated code?

Now, please go to the Linux terminal / shell / command line and follow the steps below.



TODO
Python 3 (Anaconda recommended: https://www.anaconda.com/), Scikit-learn, e.g., version 0.22.1 (https://scikit-learn.org), Tensorflow / TensorFlow-GPU, e.g., version 1.15.0 (https://www.tensorflow.org/), Keras, e.g., version 2.3.1 (https://keras.io/) and Pytorch, e.g., version 1.4.0 (https://pytorch.org/). They are all free open source software. 

In principle, it is possible to use any text editor, e.g., vi / vim to create a model instance, if you follow the syntax of our Domain-Specific Modeling Language (DSML) and save the text file with the **.thingml** extension. However, a major added value of our tool is provided through our customized model editors. ML2 and ThingML are built on top of the Eclipse Modeling Framework (EMF). Thus, in order to benefit from our model editors, you need to run the Eclipse Modeling Tools. You can download and install that IDE from https://www.eclipse.org/downloads/packages/.

Once installed, you shall create a new workspace and then import the ML2 project there. Perhaps there are different ways to accomplish that. However, we recommend the following method:

File -> import -> General -> Existing Projects into Workspace (you may also check the option **search for nested projects** in the wizard)

Make sure that you wait sufficiently long, so that the (sub-/nested) projects are built and you get a clean workspace without any errors. If that is not the case, sometimes cleaning the workspace (Project -> Clean... -> Clean all projects), updating the Maven projects (right click on a project -> Maven -> Update Project... -> Select All, you may also check the option **Force Update of Snapshots/Releases**) or restarting the Eclipse IDE (Eclipse Modeling Tools) might help.


### How to create new model instances using the model editors?
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

### Full documentation of the DSML

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
java -jar mlquadrat.compilers.registry-2.0.0-SNAPSHOT-jar-with-dependencies.jar
```
If you run the JAR file (e.g., with the -h or --help options), you will see the list of all options and commands.

For instance, if you want to generate source code in Java and Python for our samples (you can find our examples Smart Ping-Pong, Non-Intrusive Appliance Load Monitoring, and Energy Stock Exchange at https://github.com/arminmoin/ML-Quadrat/tree/master/ML2/org.thingml.samples/src/main/thingml), please use the commands below:

```bash
cd ML2/compilers/registry/target

java -jar mlquadrat.compilers.registry-2.0.0-SNAPSHOT-jar-with-dependencies.jar -c java -s ../../../org.thingml.samples/src/main/thingml/ML2_Demo1_PingPong.thingml -o GeneratedDemo1

java -jar mlquadrat.compilers.registry-2.0.0-SNAPSHOT-jar-with-dependencies.jar -c java -s ../../../org.thingml.samples/src/main/thingml/ML2_Demo2_NIALM_PSM_Java.thingml  -o GeneratedDemo2

java -jar mlquadrat.compilers.registry-2.0.0-SNAPSHOT-jar-with-dependencies.jar -c java -s ../../../org.thingml.samples/src/main/thingml/ML2_Demo3_EnergyStockMarket.thingml  -o GeneratedDemo3 	

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

Finally, since ML2 is based on ThingML, in order to get a deeper understanding, you might want to read the documentation of ThingML and take a look at their samples. See: https://github.com/TelluIoT/ThingML

[Back to top](#toc)

<a name="maven"></a>
## 5. Maven Artifacts
You can find the Maven artifacts of ML2 at https://oss.sonatype.org (e.g., search for the groupid: io.github.arminmoin). You may add the dependencies to your pom.xml file. For instance, add the following to your pom.xml:

```
<dependency>
  <groupId>io.github.arminmoin</groupId>
  <artifactId>mlquadrat</artifactId>
  <version>2.0.0-SNAPSHOT</version>
  <type>pom</type>
</dependency>
```

[Back to top](#toc)

<a name="dev-doc"></a>
## 6. Developers' Documentation (for Contributors)
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

[Back to top](#toc)

<a name="exploitation"></a>
## 7. Exploitation & Industry Adoption

[DriotData](https://www.driotdata.com), provides citizen data scientists and citizen / end-user software developers with a web-based low-code platform, so that they can create their desired IoT services without extensive knowledge and skills in Software Engineering or Artificial Intelligence (AI). 
