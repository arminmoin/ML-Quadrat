**Please watch our video here: https://www.youtube.com/watch?v=VAuz25w0a5k**

# ML-Quadrat (ML2)
ML2 is a Computer-Aided Software Engineering (CASE) tool, based on the Model-Driven Software Engineering (MDSE) paradigm, specifically the Domain-Specific Modeling (DSM) methodology with full code generation. ML2 is focused on creating smart services for the Internet of Things (IoT) and Cyber-Physical Systems (CPS). Moreover, it is based on the [ThingML](https://github.com/TelluIoT/ThingML) / [HEADS](https://github.com/HEADS-project) projects. Similar to ThingML/HEADS, ML2 is built using the [Eclipse Modeling Framework (EMF)](https://www.eclipse.org/modeling/emf/), as well as the [Xtext framework](https://www.eclipse.org/Xtext/), and is released under the terms of the Apache 2.0 permissive open source license. 

The name ML-Quadrat ("Quadrat" is the German word for "square" / ˆ2) refers to the fact that the project is about two MLs simultaneously: (i) ML for Modeling Language (as in ThingML); (ii) ML for Machine Learning, i.e., a sub-discipline of Artificial Intelligence (AI). However, in what follows, we refer to the project name as ML2 for simplicity.

## Why ML2?
ThingML/HEADS and other Model-Driven Software Engineering (MDSE) tools for the IoT/CPS, that we are aware of, do not support Data Analytics and Machine Learning (DAML) at the modeling layer. However, DAML methods and techniques are crucial for developing smart IoT services and CPS applications. Therefore, we enable DAML at the modeling layer through our Domain-Specific Modeling Language (DSML) and tool. In other words, the practitioner has access to the APIs of ML libraries and frameworks, such as [Scikit-Learn](https://scikit-learn.org/stable/), [Keras](https://keras.io)/[TensorFlow](https://www.tensorflow.org), [PyTorch](https://pytorch.org) and [WEKA](https://www.cs.waikato.ac.nz/~ml/weka/) at the modeling layer. The model-to-code transformations generate the full source code of the entire software solution, including the ML part in a fully automated manner. 

Moreover, the generated code is capable of creating, training, deploying and possibly re-training the ML models as necessary. Further, one may bring a pre-trained ML model with any arbitrary architecture, which might have been trained using any learning algorithm, and simply "connect" or "plug" it into the software model. This is called the blackbox-ML mode or the hybrid/mixed MDSE/Non-MDSE mode. This mode offers a lot of flexibility since the practitioner is not limited to the ML models/algorithms/methods/techniques that are already supported by the DSML of ML2. However, the drawback is that the software model instance does not include sufficient details about the ML model, so that it can re-train it in the future. Hence, it is called the blackbox-ML mode. 

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
Please cite the following journal paper if you are using ML2 or referring to it in your papers:

[**A model-driven approach to machine learning and software modeling for the IoT:** Generating full source code for smart Internet of Things (IoT) services and cyber-physical systems (CPS), Armin Moin, Moharram Challenger, Atta Badii and Stephan Günnemann, Software and Systems Modeling (SoSyM), January 2022.](https://link.springer.com/article/10.1007/s10270-021-00967-x)
BibTeX:
```
@article{Moin+2022-SoSyM,
	author = {Armin Moin and Moharram Challenger and Atta Badii and Stephan G{\"u}nnemann},
	date = {2022/01/19},
	doi = {10.1007/s10270-021-00967-x},
	isbn = {1619-1374},
	journal = {Software and Systems Modeling (SoSyM)},
	title = {A model-driven approach to machine learning and software modeling for the {IoT}},
	url = {https://doi.org/10.1007/s10270-021-00967-x},
	year = {2022},
}
```

<a name="issues"></a>
## 2. Reporting Issues/Bugs and Requests
ML2 is a research prototype. If you find any issues/bugs or have any feature request, please kindly report that through our issue tracking system: https://github.com/arminmoin/ML-Quadrat/issues

[Back to top](#toc)

<a name="user-doc-quick"></a>
## 3. Quick (15 mins) Tutorial
Here, we provide a quick tutorial to get familiar with ML2. However, in order to read the full documentation, please go to the section [ML2 Users' Documentation (Full Tutorial)](#user-doc) below.

### How to install ML2?
**System requirements and software prerequisites:**
We recommend a normal PC/laptop with at least 4GB of main memory (RAM) and at least 1GB of free disk space. In this tutorial, we use a x86_64 Linux system with the Ubuntu 20.04.2 LTS (focal) operating system. Please install the following software before proceeding with the installation of ML2 (use ```sudo su``` to run the commands as root and at the end ```exit``` in order to get back to the non-root user):

1. [Git](https://git-scm.com/): 
```
sudo su
apt-get install git
```
2. [The Java Runtime Environment (JRE) and the Java Development Kit (JDK)](https://www.java.com/en/download/): 
```
apt-get install default-jre default-jdk
```
3. [Apache Maven](https://maven.apache.org/): 
```
apt-get install maven
exit
```

**Now, please follow the steps below in the Linux terminal / shell / command line:**

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

Note that the -DskipTests option lets us skip running the tests, thus saving more time.

If you want to see a more detailed output to debug, use the option -X:

```bash
mvn clean install -DskipTests -X
```

Moreover, if you want to use Maven in the offline mode, e.g., in the case that your machine is behind a firewall that prohibits the Internet access, you should use the option -o, but, remember that you would need to first copy the .m2 directory, which includes the Maven cache from another computer behind the firewall (on which you have already cached ´the required dependencies) to this computer. The .m2 directory is usually stored in the user's home directory.

```bash
mvn clean install -DskipTests -o
```

### How to find a sample model instance?
There exist a number of sample model instances with the .thingml extension at this location: https://github.com/arminmoin/ML-Quadrat/tree/master/ML2/org.thingml.samples/src/main/thingml

Let's choose [ML2_Demo_PingPong.thingml](https://github.com/arminmoin/ML-Quadrat/blob/master/ML2/org.thingml.samples/src/main/thingml/ML2_Demo_PingPong.thingml) for this quick tutorial, and generate, e.g., the Python and Java source code out of it using the Python_Java model-to-code transformation (a.k.a. code generator or "compiler"). This example is about a simple client-server interaction, where a thing called "PingServer" simply waits for the ping messages of another thing, called "PingClient". In the original version from [ThingML](https://github.com/TelluIoT/ThingML) / [HEADS](https://github.com/HEADS-project), the server used to reply to every ping message of the client with a pong response. However, this was in general in a real-world scenario prone to the so-called "Distributed Denial of Service" (DDoS) attacks, where malicious clients may overload the server with their requests (ping messages). However, in ML2, this example is enhanced in order to make the server a bit "smarter"! Hence, the server will first consult a new thing, called PingPongDataAnalytics, which deploys ML, in order to see if a client is likely to be an attacker or not. If it is likely to be an attacker, then the ping message will simply be ignored (optionally, the IP address of the sender might be blacklisted for some time). Otherwise, the ping message will be responded with a pong message.

The details of the syntax of the sample model instance will be explained in the [full tutorial](#user-doc) below. Note that the software model instances in ML2 have the .thingml extension, similar to the ThingML/HEADS projects, although the meta-models/grammars of the DSMLs are different (ML2 is backward-compatible).  

### How to generate code out of the sample model instance?
Run the following commands in the Linux terminal:
```bash
cd ML2/compilers/registry/target
java -jar mlquadrat.compilers.registry-2.0.0-SNAPSHOT-jar-with-dependencies.jar -c auto -s ../../../org.thingml.samples/src/main/thingml/ML2_Demo_PingPong.thingml -o ../../../../../Generated_ML2_Demo_PingPong
```
The -c option specifies the model-to-code transformation (a.k.a. the code generator) or "**c**ompiler" that shall be deployed. Here, we choose "auto" since the model instance already includes this information in the configuration section of it (the optional @compiler annotation). Also, the -s and the -o options let the user state the paths of the **s**ource model instance and the **o**utput directory for the target generated code, respectively. If the output directory does not exist, it will be created. 

The generated code includes the entire source code that is needed, as well as the necessary build scripts. Thus, it can be easily built/installed. For instance, in this case, the generated code is in Java and Python. Hence, it can be easily built/installed using the Apache Maven with one command (mvn clean install). The Java and the Python parts are already seamlessly integrated. Also, the output of Maven will include an executable JAR file with all the dependencies as a bundle. Hence, running the generated IoT service will be also very easy with just one command (java -jar ...). Below, we illustrate how to install and run the generated code.

[Back to top](#toc)

<a name="user-doc"></a>
## 4. Users' Documentation (Full Tutorial)
Before reading the full tutorial below, you should first follow the [quick (15 mins) tutorial](#user-doc-quick) above. In what follows, we first name the additional software packages that you should install. Then, we illustrate how the generated example in the quick tutorial can be installed and executed. Further, we show how the textual and the tree-based model editors can be used in the Eclipse IDE. Finally, we provide the full documentation of the Domain-Specific Modeling Langauge (DSML).

### Additional software prerequisites
I. Install the latest version of [Anaconda for Python 3.x](https://docs.anaconda.com/anaconda/install/linux/), e.g., as follows (use ```sudo su``` to run the chmod command as root and then ```exit``` in order to get back to the non-root user):

```bash
wget https://repo.anaconda.com/archive/Anaconda3-2021.05-Linux-x86_64.sh
sudo su
chmod u+x ./Anaconda3-2021.05-Linux-x86_64.sh
exit
./Anaconda3-2021.05-Linux-x86_64.sh
```

Perhaps you need to add conda to the PATH environmental variable, if it is not there (you may check that with ```echo $PATH```). Assuming, you have downloaded and installed Anaconda in /home/user:

```bash 
export PATH=$PATH:/home/user/anaconda3/condabin/
```
To make it permanent, use a text editor, such as vim, append that to the .bashrc file (replace user with your username), and run source as follows:
```bash 
vim /home/user/.bashrc
source /home/user/.bashrc
```

Then, please follow the steps below, in order to create a conda virtual environment and install the latest versions of the required Python libraries. They are necessary for running the generated code, if the generated code includes Python code for Data Analytics and Machine Learning (DAML).

```bash
conda create --name ml2 python=3.8
conda activate ml2
conda install nb_conda jupyter numpy pandas matplotlib scikit-learn scikit-learn-intelex tensorflow-gpu gensim keras pytorch
conda install jupyter_contrib_nbextensions -c conda-forge
conda deactivate
conda activate ml2
```

II. Donwload the latest version of the [Eclipse IDE](https://www.eclipse.org/downloads) and install the latest version of the [Eclipse Modeling Tools](https://projects.eclipse.org/projects/modeling) through the wizard.

III. Install the [Xtext ANTLR plugin from this update site](https://download.itemis.de/updates/releases/2.1.1/) in the Eclipse IDE.

### How to install and execute the generated code?
The code that we generated for the sample model instance through the [quick (15 mins) tutorial](#user-doc-quick) above, namely [ML2_Demo_PingPong.thingml](https://github.com/arminmoin/ML-Quadrat/blob/master/ML2/org.thingml.samples/src/main/thingml/ML2_Demo_PingPong.thingml), can be built easily using the Apache Maven (the generated code resides in the /home/user/Generated_ML2_Demo_PingPong directory):

```bash
cd /home/user/Generated_ML2_Demo_PingPong
cd python_java/
mvn clean install
```
As mentioned, if you want to see a more detailed output to debug, use the option -X:

```bash
mvn clean install -X
```

Moreover, as stated before, if you want to use Maven in the offline mode, e.g., in the case that your machine is behind a firewall that prohibits the Internet access, you should use the option -o, but, remember that you would need to first copy the .m2 directory, which includes the Maven cache from another computer behind the firewall (on which you have already cached ´the required dependencies) to this computer. The .m2 directory is usually stored in the user's home directory.

```bash
mvn clean install -o
```

The target directory is created/updated. If the software model instance has a data analytics section with a dataset path, then we must provide the dataset in the target directory at the same path as specified in the data analytics section of the model instance, before running the application / IoT service. For now, we copy a dummy sample dataset that is available at: https://github.com/arminmoin/ML-Quadrat/tree/master/ML2/org.thingml.samples/src/main/thingml/ML2_Demos_SampleData

For the current example, we should choose the sample dataset [ip_dataset.csv](https://github.com/arminmoin/ML-Quadrat/blob/master/ML2/org.thingml.samples/src/main/thingml/ML2_Demos_SampleData/ip_dataset.csv). We should copy this Comma-Sparated Values (CSV) file into the correct path, in this case at target/data (the data sub-directory must be created):

```bash
cd target/
mkdir data
cp /home/user/ML-Quadrat/ML2/org.thingml.samples/src/main/thingml/ML2_Demos_SampleData/ip_dataset.csv data/
```
Now, in order to run the generated application / IoT service:

```bash
java -jar SmartPingPongCfg-1.0.0-jar-with-dependencies.jar
```
After running the service, you will see the output in the terminal. You may stop the service by pressing CTRL+C. If you check out the provided CSV file in the data directory, you'll see a new line appended there, as the result of the prediction of the deployed ML model in this sample smart IoT service. 

Congratulations! It worked!

**Note:** If you try to generate the code on one machine and run the generated code on another machine, you might experience troubles, due to the absolute paths, e.g., in the case of the python_java code generator, in the generated Python scripts under src/python-scripts. Please adjust them accordingly before running the code. Alternatively, you can generate the code on the new machine and then execute the generated code.

### How to create new software model instances?
In principle, it is possible to use any text editor, e.g., vi/vim, nano or Notepad to create a model instance as long as you follow the syntax of the Domain-Specific Modeling Language (DSML) of ML2 and save the text file with the **.thingml** extension. However, a major added value of the tool is delivered via the customized model editors. There exist a textual model editor in the Eclipse IDE, which offers syntax highlighting, auto-completion and warnings/errors/hints at the design-time. This is usually preferred by man advanced software developers. Moreover, there exist a graphical EMF tree-based model editor. Below, we explain how to use each choice. However, we first need to set up the workspace in the Eclipse IDE.

#### How to set up the workspace in the Eclipse IDE (Eclipse Modeling Tools)?
Once installed, you shall create a new workspace and then import the ML2 project there. Perhaps there are different ways to accomplish that. However, we recommend the following method:

File -> import -> General -> Existing Projects into Workspace / Projects from Folder or Archive (you should also check the option **search for nested projects** in the wizard)

Make sure that you wait sufficiently long, so that the (sub-/nested) projects are built and you get a clean workspace without any errors. If that is not the case, sometimes cleaning the workspace (Project -> Clean... -> Clean all projects), updating the Maven projects (right click on a project -> Maven -> Update Project... -> Select All, you may also check the option **Force Update of Snapshots/Releases**) or restarting the Eclipse IDE (Eclipse Modeling Tools) might help.

Once you import the projects into the workspace in the Eclipse IDE, you will get notified about a number of missing extensions, such as the Maven support in Eclipse (m2e) and the Eclipse Enterprise Java and Web Developers Tools, which can be installed through the Eclipse Marketplace. Please install them one by one. You will need to restart the Eclipse IDE after each installation. 

Finall, please go to Help -> Install New Software and install the following software through the default update site (e.g., http://download.eclipse.org/releases/2021-03): Under the Modeling category, select and install the MWE2 Language SDK, MWE2 Runtime SDK and Xtext Complete SDK.


#### Running the GenerateThingML.mwe2 workflow in the Eclipse IDE
One of the projects in the workspace, called thingml.ide might still have errors. Often, you need to do the following, in order to have a functioning textual model editor. 

Please run the [GenerateThingML.mwe2](https://github.com/arminmoin/ML-Quadrat/blob/master/ML2/language/thingml/src/org/thingml/xtext/GenerateThingML.mwe2) workflow, which resides in the thingml project in the workspace (under src -> org.thingml.xtext) from within the Eclipse IDE by right-clicking on it and choosing Run as -> MWE2 Workflow from the context menu. This shall deploy the [Xtext ANTLR plugin](https://download.itemis.de/updates/releases/2.1.1/) that we installed before, and fix the issues. This way, the customized textual model editor will work properly (see below).

#### Running a nested Eclipse instance to use the model editors
In order to use the textual or the EMF tree-based model editors, you must run a new/nested instance of the Eclipse IDE inside of the Eclipse IDE (the above-mentioned workspace). To this aim, click on one of the projects in the workspace, let's say, e.g., thingml or thingml.ide, and select "Run As" and then "Eclipse Application" from the context menu.

#### Using the Textual (Xtext-based) Model Editor
Create a new project in the new/nested Eclipse instance, say Demo_ML2 and then create a new file with the **.thingml** extension, such as Test.thingml. This is a model instance, which shall conform to the meta-model/grammar of the DSML of ML2. You may create this model instance by choosing File -> New -> Other -> Example EMF Model Creation Wizards -> ThingML Model, and then clicking on Next, then giving it the name Test.thingml, Clicking on Next, selecting **Model** as the **Model Object**, and finally clicking on Finish. 

By default, the customized, textual Xtext-based model editor will open for the files with the extension .thingml, i.e., for the ML2 model instances. You can write the following in the model editor and save the model instance:

```
thing my_thing {
	
}
```

If everything is configured properly so far, you should already see the syntax highlighting (e.g., the orange color for the keyword thing) and you should be also already able to experience the auto-completion, e.g., by pressing CTRL+SPACE simultaneously. Moreover, you will see warnings, errors and hints in the editor and also in the properties view/tab of the Eclipse IDE if applicable.

#### Using the Graphical EMF Tree-based Model Editor
In the new/nested Eclipse instance, if you right-click on a model instance, e.g., Test.thingml and select Open With -> **ThingML Model Editor**, the graphical EMF tree-based model editor of ML2 will open. In contrast, if you right-click on a model instance and select Open With -> **ThingML Editor**, not **ThingML Model Editor**, the **textual** Xtext-based model editor of ML2 will open.

#### Which Model Editor to Choose?
There is no universal answer to this question. Some practitioners/users, especially many advanced software developers prefer the textual model editor, whereas some other practitioners/users find the graphical tree-based model editor more convenient. Please give both a try if you are not sure about your own preference.

[Back to top](#toc)

### Full documentation of the DSML
As mentioned, ML2 is based on the [ThingML](https://github.com/TelluIoT/ThingML) / [HEADS](https://github.com/HEADS-project) projects. Therefore, in order to gain a deeper insight and a thorough understanding of the underlying concepts and technologies, you are invited to read the documentations of the said open source projects.

In principle, a DSML comprises three key components: (i) Abstract syntax. (ii) Concrete syntax. (iii) Semantics. The **abstract syntax** of the DSML of ML2 is implemented through the [Xtext grammar](https://github.com/arminmoin/ML-Quadrat/blob/master/ML2/language/thingml/src/org/thingml/xtext/ThingML.xtext). The Ecore meta-model is generated automatically out of the Xtext grammar. Moreover, the **concrete syntax** of the DSML is realized in the textual (Xtext-based) and graphical (EMF tree-based) forms, as explained above. Last but not least, the **semantics** are implemented both via the Xtext framework (in Java and Xtend) on the modeling langauge layer and also through the model-to-code transformations (i.e., code generators, also known as "compilers").

A typical software model instance that conforms to the meta-model/grammar of the DSML of ML2 consists of 4 main sections and various subsections in Section 3, i.e., "Things":

#### Section 1. Imports
One may import other model instances that conform to the meta-model/grammar of the DSML of ML2 here. For instance, a Platform-Specific Model (PSM) should import the corresponding Platform-Independent Model (PIM) in this section. The provided examples [ML2_Demo_NIALM_PSM_Java.thingml](https://github.com/arminmoin/ML-Quadrat/blob/master/ML2/org.thingml.samples/src/main/thingml/ML2_Demo_NIALM_PSM_Java.thingml) and [ML2_Demo_NIALM_PIM.thingml](https://github.com/arminmoin/ML-Quadrat/blob/master/ML2/org.thingml.samples/src/main/thingml/ML2_Demo_NIALM_PIM.thingml) illustrate this. However, this is not the only use-case for the imports.

#### Section 2. Annotations
One may specify the platform annotations in this section. For instance, the provided example [ML2_Demo_PingPong.thingml](https://github.com/arminmoin/ML-Quadrat/blob/master/ML2/org.thingml.samples/src/main/thingml/ML2_Demo_PingPong.thingml) demonstrates how the String, Boolean<1> and Int32<4> datatypes are supposed to be mapped to the "platform"-specific datatypes, such as String <-> char * for the C code generation, but String <-> String for the Java and the Javascript code generation. Note that the platform annotations might appear in other sections, e.g., for choosing the specific library/framework for DAML in Subsection 3.2 ("Data Analytics (and Machine Learning)"), or for selecting a particular model-to-code transformation (code generator, also known as "compiler") in Section 4 ("Configuration").

#### Section 3. Things
Things are somehow analogues to the "Classes" in the Object-Oriented Programming (OOP) paradigm.

#####  For each thing, say Thing_A:
###### Subsection 3.1: Messages, Ports and Properties
The keywords of this subsection of the model instance are highlighted in **orange** in the textual model editor of ML2. Following the semantics of [ThingML](https://github.com/TelluIoT/ThingML) / [HEADS](https://github.com/HEADS-project), the communication between the "things" in ML2 is carried out through asynchronous message-passing. A **message** must be sent from a **port** of the source thing to a **port** of the destination thing. Moreover, each message may have zero or more **parameters**. Further, each thing can have local variables, called **properties**.

###### Subsection 3.2: Data Analytics (and Machine Learning)
This is the main innovation of ML2 compared to [ThingML](https://github.com/TelluIoT/ThingML) / [HEADS](https://github.com/HEADS-project). It is this subsection that enables DAML at the modeling layer. However, this subsection is optional. In other words, only those things that are supposed to possess DAML capabilities should have this subsection. Note that a software model instance may contain several things. In fact, very often this is the case, since containing only one thing is trivial and no interaction can occur. However, usually only one or some of the things exhibit DAML capabilities, not all of them.

The keywords of this subsection of the model instance are highlighted in **blue** in the textual model editor of ML2. Since there is obviously no documentation for this subsection elsewehre, which is reasonable due to its innovative nature, we elaborate on the concepts, syntax and semantics of this subsection in more detail in what follows.

Let us consider two of the provided sample model instances [ML2_Demo_PingPong.thingml](https://github.com/arminmoin/ML-Quadrat/blob/master/ML2/org.thingml.samples/src/main/thingml/ML2_Demo_PingPong.thingml) and [ML2_Demo_PingPong_Blackbox.thingml](https://github.com/arminmoin/ML-Quadrat/blob/master/ML2/org.thingml.samples/src/main/thingml/ML2_Demo_PingPong_Blackbox.thingml). The former corresponds to the pure (full) MDSE mode, whereas the latter corresponds to the **blackbox-ML mode or the hybrid/mixed MDSE/Non-MDSE mode**, where the practitioner (i.e., the user of the tool) may bring any arbitrary **pre-trained** ML model and "connect" or "plug" it into the software model.

This is the data_analytics subsection of thing PingPongDataAnalytics in the former sample (namely ML2_Demo_PingPong.thingml):

```
	data_analytics da1 
	@dalib "scikit-learn" {
	//@dalib "keras-tensorflow" {
	//{
		labels ON
		features client_ip_address,client_code,prediction
		prediction_results prediction
		dataset "data/ip_dataset.csv"
		automl OFF
		sequential TRUE
		timestamps OFF	
		preprocess_feature_scaler StandardScaler
		model_algorithm nn_multilayer_perceptron my_nn_mlp(activation relu, optimizer adam, loss SparseCategoricalCrossentropy)
		training_results "data/training.txt"		
	}
```

In addition, this is the data_analytics subsection of thing PingPongDataAnalytics in the latter case (namely ML2_Demo_PingPong_Blackbox.thingml):

```
	data_analytics da1 
	@dalib "scikit-learn" {
		labels ON
		features client_ip_address,client_code,prediction
		prediction_results prediction
		blackbox_ml true	
		blackbox_ml_model "pre_trained/pre_trained_ml_model.pickle"
		blackbox_import_algorithm "from sklearn.neural_network import MLPClassifier"
		//blackbox_label_encoder "pre_trained/pre_trained_label_encoder.pickle"
	}
```

Below, we explain them line-by-line:

(i) **data_analytics:** The **data_analytics** keyword must be followed by the name of this data_analytics component/block/workflow/pipeline since each thing may possess even more than one component/block/workflow/pipeline. In this case, da1 is its name.

(ii) **@dalib:** The dalib annotation is optional. It specifies the particular DAML library/framework that must be deployed for the code generation. If it is not mentioned, or if it is set to auto (i.e., @dalib "auto"), then the MDSE tool will deploy its AutoML engine to find the best choice. In some cases the choice might be trivially limited to only one since not every DAML method/model/algorithm/technique is implemented in every DAML library/framework. In the shown example, [the Scikit-Learn library](https://scikit-learn.org/stable/) has been chosen. In any case, the APIs of the selected DAML library/framework will be used for the automated code generation. However, the choice of the DAML library/framework must be compatible with the choice of the ML model/algorithm and the choice of the model-to-code transformation for the code generation. If you are uncertain, it would be often better to not specify any particular DAML library/framework, thus relying on the default option.
**Note:** Currently, the @dalib annotation supports the following choices for the DAML library/framework out-of-the-box: ["scikit-learn" for the Scikit-Learn (Sklearn) library/framework]((https://scikit-learn.org/stable/)) and ["keras-tensorflow" for the Kears library/framework with the TensorFlow Backend](https://keras.io). Supporting more DAML libraries/frameworks, such as [PyTorch](https://pytorch.org) (Python) and [WEKA](https://www.cs.waikato.ac.nz/~ml/weka/) (Java) is currently in progress.

(iii) **{:** Open the braces (curly brackets) as shown above.

(iv) **//:** Similar to Java, in order to comment out a line (i.e., disable or inactivate it) or write any comment, a double slash can be added to the beginning of the line, e.g., see "//@dalib "keras-tensorflow" {" above.

(v) **labels:** This item specifies whether the data are labeled, unlabeled, or partially labeled. Thus, it implicitly determines the type of the ML task; its value can be ON for labeled data (supervised ML), OFF for unlabeled data (unsupervised ML), or SEMI for partially labeled data (semi-supervised ML). The "labels" parameter appears in both the pure (full) MDSE and the blackbox-ML modes.

(vi) **features:** This one specifies the ML features/attributes separated by commas. These are a subset of the properties (i.e., local variables) of the respective thing to which the data analytics block belongs. For instance, the properties might store the incoming messages or some of their specific parameters. The values of the features might be scalar or vector. If "labels" is set to ON, thus having supervised ML, the last feature is considered as the class label. Also in this case, the label can be a vector. Similar to "labels", the "features" parameter is also used in both the pure (full) MDSE and the blackbox-ML modes.

(vii) **prediction_results:** The predictions of the ML model, e.g., the predicted class label or target value in the case of supervised ML (classification/regression) or the cluster index in the case of unsupervised ML for a new data instance shall be stored in the property specified here. This parameter is also required in both the pure (full) MDSE and the blackbox-ML modes.

(viii) **dataset:** This provides the path to the Comma-Separated Values (CSV) file containing the input data that shall be used for training the ML model. It must always start with "data/". In other words, the dataset (CSV file) must always reside in the data directory. Currently, only batch processing, i.e., offline learning is supported. Thus, the datasets are bounded. In the future, stream processing, i.e., online learning through unbounded datasets shall be supported too.

(ix) **automl:** This parameter can turn the AutoML (Automated ML) engine on or off. The AutoML functionalities are still basic and under development.

(x) **sequential:** This Boolean parameter specifies whether the data are sequential, i.e., whether the order matters. For instance, time series or DNA data may not be shuffled or be involved in cross validation or similar practices.

(xi) **timestamps:** This binary (ON/OFF) parameter determines if the first column of the dataset includes the timestamps of the input data. The format for the timestamps should be dd-mm-yyyy HH:MM:SS, e.g., 11-07-2020 13:50:27 for July 11, 2020 at 1:50:27pm. If the timestamps parameter is set to ON, the predictions of the ML model will also be automatically timestamped, e.g., if they should be appended to the dataset.

(xii) **preprocess_feature_scaler:** Here, one could choose a scaler for the **standardization**, which works per ML feature (i.e., column-wise). Many ML methods, such as Neural Networks exhibit a poor performance on the data with ML features that have different scales. The available choices for standardization are the standard scaler (i.e., z-score, which removes the mean and scales to unit variance), the robust scaler (which uses the statistics that are robust to the outliers), and the min-max scaler (which scales each feature to a given range).

(xiii) **preprocess_sample_normalizer:** This is not shown in the above-mentioned examples. Here, one could choose a normalizer for the **normalization**, which works per sample (i.e., row-wise). Normalization transforms each sample with at least one non-zero feature to the unit norm, independently of the other samples. This is usually required for similarity metrics, e.g., in text classification/clustering. The supported norms are the L2 norm, the L1 norm and the Max norm.

(xiv) **model_algorithm:** The specific ML method that shall be deployed is set here. The method includes the architecture/type of the ML model, e.g., whether it is from the ANN family or from the linear family, and in each case, what the hyper-parameters are, e.g., for Deep ANNs, how many hidden layers, with which sizes, does the ML model possess, what is the learning algorithm that shall be used for training the ML model, e.g., Stochastic Gradient Descent (SGD), and so forth. The range of ML models/algorithms/methods/techniques is evolving. However, currently, the following ML methods are supported (check out the API documentations of the respective libraries for the list of possible parameters/arguments, their order and their default values):

**For supervised ML:**
1. Logistic Regression for linear classification, see the [Scikit-Learn API doc](https://scikit-learn.org/stable/modules/generated/sklearn.linear_model.LogisticRegression.html)
2. Linear Regression, see the [Scikit-Learn API doc](https://scikit-learn.org/stable/modules/generated/sklearn.linear_model.LinearRegression.html)
3. Gaussian Naive Bayes, see the [Scikit-Learn API doc](https://scikit-learn.org/stable/modules/generated/sklearn.naive_bayes.GaussianNB.html)
4. Multinomial Naive Bayes, see the [Scikit-Learn API doc](https://scikit-learn.org/stable/modules/generated/sklearn.naive_bayes.MultinomialNB.html)
5. Complement Naive Bayes, see the [Scikit-Learn API doc](https://scikit-learn.org/stable/modules/generated/sklearn.naive_bayes.ComplementNB.html)
6. Bernoulli Naive Bayes, see the [Scikit-Learn API doc](https://scikit-learn.org/stable/modules/generated/sklearn.naive_bayes.BernoulliNB.html)
7. Categorical Naive Bayes, see the [Scikit-Learn API doc](https://scikit-learn.org/stable/modules/generated/sklearn.naive_bayes.CategoricalNB.html)
8. Decision Tree Regressor and Decision Tree Classifier, see the [Scikit-Learn API doc (regression)](https://scikit-learn.org/stable/modules/generated/sklearn.tree.DecisionTreeRegressor.html) / [Scikit-Learn API doc (classification)](https://scikit-learn.org/stable/modules/generated/sklearn.tree.DecisionTreeClassifier.html)
9. The Random Forest Regressor and Random Forest Classifier ensemble methods, see the [Scikit-Learn API doc (regression)](https://scikit-learn.org/stable/modules/generated/sklearn.ensemble.RandomForestRegressor.html) / [Scikit-Learn API doc (classification)](https://scikit-learn.org/stable/modules/generated/sklearn.ensemble.RandomForestClassifier.html)
10. The Multi-Layer Perceptron (MLP) Artificial Neural Networks (ANN) for classification and regression, see the [Keras API doc (default)](https://keras.io/guides/sequential_model/) and the [Scikit-Learn API doc (regression)](https://scikit-learn.org/stable/modules/generated/sklearn.neural_network.MLPRegressor.html) / [Scikit-Learn API doc (classification)](https://scikit-learn.org/stable/modules/generated/sklearn.neural_network.MLPClassifier.html).

**For unsupervised ML:**
1. K-Means, see the [Scikit-Learn API doc](https://scikit-learn.org/stable/modules/generated/sklearn.cluster.KMeans.html)
2. Mini-Batch K-Means, see the [Scikit-Learn API doc](https://scikit-learn.org/stable/modules/generated/sklearn.cluster.MiniBatchKMeans.html)
3. DB-SCAN, see the [Scikit-Learn API doc](https://scikit-learn.org/stable/modules/generated/sklearn.cluster.DBSCAN.html)
4. Spectral Clustering, see the [Scikit-Learn API doc](https://scikit-learn.org/stable/modules/generated/sklearn.cluster.SpectralClustering.html)
5. Gaussian Mixture Model, see the [Scikit-Learn API doc](https://scikit-learn.org/stable/modules/generated/sklearn.mixture.GaussianMixture.html)

**For semi-supervised ML:**
1. Self-Training, see the [Scikit-Learn API doc](https://scikit-learn.org/stable/modules/generated/sklearn.semi_supervised.SelfTrainingClassifier.html)
2. Label Propagation, see the [Scikit-Learn API doc](https://scikit-learn.org/stable/modules/generated/sklearn.semi_supervised.LabelPropagation.html)
3. Label Spreading, see the [Scikit-Learn API doc](https://scikit-learn.org/stable/modules/generated/sklearn.semi_supervised.LabelSpreading.html)

Here is an example for the DAML model_algorithm (i.e., the DAML method):

model_algorithm k_means my_k_means(n_clusters 2, random_state 10)

**Note:** Obviously, not every ML method (model_algorithm) is implemented in every ML library/framework. The ML libraries/frameworks, which are supported for the code generation for each of the above-mentioned choices for the ML model_algorithm are mentioned in front of them as links (see above). Hence, you should either avoid mentioning the annotation @dalib, so that the default choice for the ML model_algorithm is set (see the default option for the ML library/framework marked as "(default)", e.g., for the Multi-Layer Perceptron (MLP) above), or you should set the annotation @dalib to the auto mode: @dalib "auto", or you should specify the correct choice, e.g., in the case of the Multi-Layer Perceptron (MLP) the annotation can be set to either @dalib "scikit-learn" or @dalib "keras-tensorflow". If you are not certain, please do not specify any library/framework manually.

(xv) **training_results:** This parameter sets the path to the text file that shall log the training and the possible re-trainings of the ML model. It is recommended to start the path with "data/", so that the training log text file is created in the data directory. Note that the serialized objects (e.g., the trained ML models) are stored in a directory, called "pickles" under src/python-scripts/ (in the case of the python_java code generator) or "objects" under src/ (in the case of the pure java code generator). The majority of them have the Python Pickle or the Java Byte Stream types, respectively. However, some of them are in other formats. For instance, the weights of the Keras ML model parameters are stored in the Hierarchical Data Format (HDF) version 5 (HDF5) with the .h5 file name extension. If you want to completely restart an IoT service and remove all its stored data and configurations, you must delete all the files in the pickles/objects directory, which resides in the **src** directory (not in the **target** directory) in the Maven root. Note that running "mvn clean" will not affect the contents of the src directory of Maven, but only the target directory.

(xvi) **blackbox_ml:** If this Boolean parameter is set to true, it means the practitioner is not willing to take a pure MDSE approach. Instead, the blackbox-ML mode, also known as the hybrid/mixed MDSE/Non-MDSE mode is desired. Therefore, a pre-trained ML model shall be provided (see below).

(xvii) **blackbox_ml_model:** This parameter is specific to the blackbox-ML mode, as its name suggests. It specifies the path to the pre-trained ML model that shall be deployed for the predictions.

(xviii): **blackbox_import_algorithm:** In order to use the stated pre-trained ML model (see above), the corresponding ML method/algorithm must be imported from the respective ML library. This shall be specified here. The syntax must match the syntax of the target programming language, e.g., Python. See "from sklearn.neural_network import MLPClassifier" in the example above.

(xix): **blackbox_label_encoder:** This is currently disabled in the above-mentioned sample. However, in the blackbox-ML mode, if there exist categorical labels that had been transformed to one-hot-encoding via the Label Encoder in Python (Scikit-Learn), the path to the serialized Label Encoder object must be provided here. This way, the predictions of the ML model can be transformed back into the original categorical format.

(xx): **}:** Finally, please do not forget to close the braces (curly brackets) as shown above.

###### Subsection 3.3: Statechart
The keywords of this subsection of the model instances are highlighted in **red** in the textual model editor of ML2. One statechart, i.e., state machine or more precisely Finite-State Machine (FSM), is required for each thing in order to model its behavior. Trivially, a statechart might only have one state, such as Active or Init and simply remain in that state forever. However, often the behavior of a thing is modeled through several states, e.g., in the case of our provided sample [ML2_Demo_PingPong.thingml](https://github.com/arminmoin/ML-Quadrat/blob/master/ML2/org.thingml.samples/src/main/thingml/ML2_Demo_PingPong.thingml), the behavior of thing PingPongDataAnalytics is modeled via the following states: Preprocess, Train, Ready and Predict.

A **platform-independent imperative action language** is adopted and adapted from the DSML of [ThingML](https://github.com/TelluIoT/ThingML) / [HEADS](https://github.com/HEADS-project). This action language enables the Event-Driven Programming (EDP) paradigm in the state machines. For instance, using this langauge the practitioner may specify which concrete action must be taken if a certain event occurs, e.g., if a particular message is received on a certain port. The action can be as simple as printing to the standard output or sending a new message to the sender or to another thing. However, another key innovation of ML2, compared to [ThingML](https://github.com/TelluIoT/ThingML) / [HEADS](https://github.com/HEADS-project) is the extension of this action language to support using the DAML components (explained above) in the state machines. For instance, in the case of the said example [ML2_Demo_PingPong.thingml](https://github.com/arminmoin/ML-Quadrat/blob/master/ML2/org.thingml.samples/src/main/thingml/ML2_Demo_PingPong.thingml), statechart PingPongDataAnalyticsBehavior has the "da_preprocess da1" action in its Preprocess state, the "da_train da1" action in its Train state, as well as the "da_predict da1(...)" and the "da_save da1" actions in its Predict state. 

Below, we briefly explain the new action types that are introduced in ML2, but did not exist in [ThingML](https://github.com/TelluIoT/ThingML) / [HEADS](https://github.com/HEADS-project):

1.  **da_save:** This optional "action" enables appending the predictions of the ML model to the provided dataset. Currently, it is only supported in the pure MDSE mode since in the blackbox-ML mode no CSV dataset needs to be provided. The "action" must be followed by the name of the respective data analytics block that contains the dataset path, e.g, da1 in the case of the above-mentioned example.
2. **da_preprocess:** This "action" executes an automated data preparation pipeline/workflow, which comprises the necessary data preprocessing tasks before training the ML model, such as standardization/normalization (see preprocess_feature_scaler and preprocess_sample_normalizer above), and one-hot-encoding for categorical labels. The prepared data will be serialized and saved as pickle (in the case of the python_java code generator) or byte stream (in the case of the pure java code generator) on the disk to be fed later to the training script (see below). This "action" must also be followed by the name of the respective data analytics block, e.g., da1 in the case of the shown example above.
3. **da_train:** This "action" deploys the specified ML method (see model_algorithm above) in order to train the respective ML model using the appropriate learning algorithm. The trained ML model will be serialized and saved. As stated before, the format is typically the Python Pickle or the Java Byte Stream. However, e.g., in the case of the Keras library/framework, in addition to the Pickles, the weights of the ML model parameters are saved in HDF5 (.h5). Also, this "action" must be followed by the name of the respective data analytics block, e.g., da1 in the case of the shown example above.
4. **da_predict:** This "action" triggers a query to the trained ML model for its predictions and storing the predictions in the specified local variable (i.e., property) of the thing (see prediction_results above). Further, this "action" must be followed by the name of the respective data analytics block, e.g., da1 in the case of the shown example above. Additionally, this "action" requires the local variables (i.e., properties) corresponding to the ML features/attributes as arguments (See "da_predict da1(client_ip_address, client_code)" in the provided example [ML2_Demo_PingPong.thingml](https://github.com/arminmoin/ML-Quadrat/blob/master/ML2/org.thingml.samples/src/main/thingml/ML2_Demo_PingPong.thingml)).
5. **da_pre_trained_predict:** In the blackbox-ML mode, none of the above-mentioned "actions" is useful. Instead, this "action" loads the provided pre-trained ML model into the main memory and asks it to make the predictions. Similarly, this "action" must be followed by the name of the respective data analytics block, e.g., da1 in the case of the shown blackbox-ML example above. Additionally, this "action" requires the local variables (i.e., properties) corresponding to the ML features/attributes as arguments (See "da_pre_trained_predict da1(client_ip_address, client_code)" in the provided blackbox-ML example [ML2_Demo_PingPong_Blackbox.thingml](https://github.com/arminmoin/ML-Quadrat/blob/master/ML2/org.thingml.samples/src/main/thingml/ML2_Demo_PingPong_Blackbox.thingml)).

#### Section 4. Configuration
The keywords of this subsection of the model instances are highlighted in **green** in the textual model editor of ML2. As long as a model instance is valid (i.e., conforms to the meta-model/grammar of the DSML of ML2), and is complete, we can use a model-to-code transformation (code generator/"compiler") of ML2 to gnerate the entire source code of the target (smart) IoT service out of it in a fully automated manner, provided that it has a configuration section at the end. If we have a PIM instance, such as the provided example [ML2_Demo_NIALM_PIM.thingml](https://github.com/arminmoin/ML-Quadrat/blob/master/ML2/org.thingml.samples/src/main/thingml/ML2_Demo_NIALM_PIM.thingml), it reasonably does not include any configuration. However, the PSM instances, e.g., [ML2_Demo_NIALM_PSM_Java.thingml](https://github.com/arminmoin/ML-Quadrat/blob/master/ML2/org.thingml.samples/src/main/thingml/ML2_Demo_NIALM_PSM_Java.thingml) must contain the configuration. Here is the sample configuration of the above-mentioned example [ML2_Demo_PingPong.thingml](https://github.com/arminmoin/ML-Quadrat/blob/master/ML2/org.thingml.samples/src/main/thingml/ML2_Demo_PingPong.thingml):

```
configuration ML2_Demo_PingPong_Cfg @compiler "python_java" {	
    	instance pingClient : PingClient
    	instance pingServer : PingServer
    	instance pingPongDataAnalytics : PingPongDataAnalytics
    	connector pingClient.ping_service => pingServer.ping_service
    	connector pingServer.da_service => pingPongDataAnalytics.da_service    
}
```

The configuration subsection has typically 3 parts:

1. Optionally, it has the annotation @compiler, determining the particular model-to-code transformation (code generator/"compiler") that needs to be deployed, e.g., @compiler "python_java" for the Python and Java code generator, or @compiler "java" for the pure Java code generator. This is required if the practitioner wants to later use the "-c auto" option for the code generation. Otherwise, if it is not specified in the configuration, the practitioner may later use the "-c" option in the code generation to determine the target model-to-code transformation (code generator/"compiler") that shall be deployed, e.g., "-c python_java" for the Python and Java code generator, or "-c java" for the pure Java code generator.
**Note 1:** Currently, the @compiler annotation supports in principle [every model-to-code transformation/code generator/"compiler" that is available in the compilers module/subproject](https://github.com/arminmoin/ML-Quadrat/tree/master/ML2/compilers). However, if you want to develop a **smart** IoT service, i.e., with AI, specifically DAML capabilities, you need to choose a model-to-code transformation/code generator/"compiler" that is capable of that. Currently, only the [Python and Java ("python_java") code generator](https://github.com/arminmoin/ML-Quadrat/tree/master/ML2/compilers/python_java) supports DAML out-of-the-box. This code generator generates Python and Java code. The Python code is responsible for the DAML functions, whereas the rest is implemented in Java. The Python and Java codes are already seamlessly integrated using the Java Process Builder API. However, enabling more code generators to support DAML out-of-the-box, such as the [pure Java ("java") code generator](https://github.com/arminmoin/ML-Quadrat/tree/master/ML2/compilers/java) is currently in progress.
**Note 2:** You should either avoid mentioning the annotation @dalib in the data analytics subsection (Subsection 3.2) or you should ensure that the selected ML library/framework is compatible with the choice of the model-to-code transformation here. For example, if you have already set @dalib "scikit-learn" or @dalib "keras-tensorflow", then you must choose the python_java code generator, not the pure Java code generator, as Scikit-learn/Keras are Python libraries. Similarly, if you have already set @dalib "weka", then you must choose the pure Java code generator here. If you are not certain, please do not specify any ML library/framework manually through @dalib.
2. As mentioned before, Things are analogues to the "Classes" in the Object-Oriented Programming (OOP) paradigm. Similarly, instances are analogues to the "Objects" in the OOP paradigm. Therefore, the concrete instances of the things defined above must be instantiated here. In the shown example above, we see the instances ("objects") pingClient, pingServer and pingPongDataAnalytics that are instaces of the things("classes") PingClient, PingServer and PingPongDataAnalytics, respectively.
3. The connections between the ports of the defined things must be specified here using the connector keyword as illustrated above. Without this, there will be no communication between the things' instances at the runtime!

### How to have the ML models re-trained automatically and periodically?
See, e.g., thing NIALMDataAnalytics in the provided sample model instance [ML2_Demo_NIALM_PIM.thingml](https://github.com/arminmoin/ML-Quadrat/blob/master/ML2/org.thingml.samples/src/main/thingml/ML2_Demo_NIALM_PIM.thingml). As we can see in the Ready state of the NIALMDataAnalyticsBehavior statechart, the last_training_timer port is used for this purpose. Note that the time is in milliseconds:

last_training_timer!timer_start(3600000)

Hence, in this case, every 60 mins the event timer_timeout occurs on the last_training_timer port, leading to the transition of the statechart from the Ready state to the Train state, thus re-training the ML model.

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
If you are going to contribute to this project, please read the developers' documentation below. Basically, there exist 4 main extensio points: (i) The abstract syntax of the modeling langauge, i.e., the [Xtext grammar](https://github.com/arminmoin/ML-Quadrat/blob/master/ML2/language/thingml/src/org/thingml/xtext/ThingML.xtext) (which also implicitly means the Ecore meta-model since the latter is generated automatically out of the former as stated before). (ii) The concrete syntax of the modeling language, e.g., the textual model editor. (iii) The semantics realized through the Xtext framework, e.g., in the Java/Xtend classes at [ML2/language/thingml/src/org/thingml](https://github.com/arminmoin/ML-Quadrat/tree/master/ML2/language/thingml/src/org/thingml). (iv) The semantics implemented in the model-to-code transformations (code generators/"compilers") at [ML2/compilers](https://github.com/arminmoin/ML-Quadrat/tree/master/ML2/compilers). Below, we briefly explain each of them.

### Contributing to the Grammar/Meta-model of the DSML

The Xtext grammar is the core of the DSML of ML2. If you are not already familiar with the Xtext framework for DSML/DSL/programming language creation, please read the documentation here: https://www.eclipse.org/Xtext/documentation/index.html

**Note:** In some cases, the enforced scoping rules might prevent you from making the desired modifications working. For instance, you might want to allow the practitioner to use a certain concept, such as the message parameters in a (sub)section of the model instances that was not possible so far. If that is the case, you might find the [ThingMLScopeProvider Xtend class](https://github.com/arminmoin/ML-Quadrat/blob/master/ML2/language/thingml/src/org/thingml/xtext/scoping/ThingMLScopeProvider.xtend) helpful.

After any modifications, please build the entire project again using Maven in the terminal as follows:

```bash
cd ML-Quadrat
mvn clean install -X
cd ML2/language
mvn clean install -X
```
The -X option is optional and enables the debugging mode, thus resulting in a more detailed output.

Now, we see that the Ecore meta-model is also automatically generated and resides in thingml -> model -> generated.

Moreover, you need to re-generate the graphical EMF tree-based model editor in the Eclipse IDE by following these steps:

1. Open ThingML.genmodel that resides in the project called "thingml" in the workspace at model -> generated. 
2. Right-click on ThingML and select the options **Generate Model Code**, **Generate Edit Code** and **Generate Editor Code** one after another.

Last but not least, as mentioned before, you must run the [GenerateThingML.mwe2](https://github.com/arminmoin/ML-Quadrat/blob/master/ML2/language/thingml/src/org/thingml/xtext/GenerateThingML.mwe2) workflow, which resides in the thingml project in the workspace (under src -> org.thingml.xtext) from within the Eclipse IDE by right-clicking on it and choosing Run as -> MWE2 Workflow from the context menu. This shall deploy the [Xtext ANTLR plugin](https://download.itemis.de/updates/releases/2.1.1/) that we installed before. This way, the customized textual model editor will also work properly.

### Contributing to the Concrete Syntax of the DSML
If you want to introduce new keywords and let the features of the textual model editor, such as syntax highlighting work for them, please add the keywords to the [ThingMLAntlrTokenToAttributeIdMapper Java class](https://github.com/arminmoin/ML-Quadrat/blob/master/ML2/language/thingml.ui/src/org/thingml/xtext/ui/ThingMLAntlrTokenToAttributeIdMapper.java).

### Contributing to the Semantics of the DSML at the Modeling Layer
If you want to adapt or extend the model checking constraints, validation rules, etc., please check out the Java/Xtend classes here: [ML2/language/thingml/src/org/thingml](https://github.com/arminmoin/ML-Quadrat/tree/master/ML2/language/thingml/src/org/thingml).

### Contributing to the Semantics of the DSML at the Model-to-Code Transformations Layer
Please check out the existing model-to-code transformations (code generators/"compilers") at [ML2/compilers](https://github.com/arminmoin/ML-Quadrat/tree/master/ML2/compilers). Let's say you want to adapt/extend the Python and Java code generator (python_java). For example, suppose that you want to enable a new ML method out-of-the-box, i.e., in the pure MDSE mode. To this aim, please adapt/extend the [PythonJavaThingActionCompiler Java class](https://github.com/arminmoin/ML-Quadrat/blob/master/ML2/compilers/python_java/src/main/java/org/thingml/compilers/python_java/PythonJavaThingActionCompiler.java).

**Note:** You may add any new Java packages that must be included among the imported Java packages in the generated Java code to the Helper Java class, e.g., in the case of the python_java code generator to the [PythonJavaHelper Java class](https://github.com/arminmoin/ML-Quadrat/blob/master/ML2/compilers/python_java/src/main/java/org/thingml/compilers/python_java/PythonJavaHelper.java).

After any modifications, please build the corresponding projects again using Maven in the terminal as follows (e.g., for the python_java case):

```bash
cd ML-Quadrat/ML2/compilers/python_java
mvn clean install -X
cd ML-Quadrat/ML2/compilers/registry
mvn clean install -X
```
The -X option is optional and enables the debugging mode, thus resulting in a more detailed output.

[Back to top](#toc)

<a name="exploitation"></a>
## 7. Exploitation & Industry Adoption

[DriotData](https://arxiv.org/abs/2107.02692) provides citizen data scientists and citizen / end-user software developers with a web-based "Low-Code" platform that has a graphical drag-and-drop dashboard, so that they can easily create their desired smart IoT services without extensive knowledge and skills in Software Engineering or Artificial Intelligence (AI).
