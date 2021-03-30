### This is the short manual how you can work with Java in Windows cmd.

* Install Java on the PC.
* Set environment variables:
	* Variable JAVA_HOME, which must point to directory where java was installed.
	* Variable PATH . You should add path to the directory %JAVA_HOME%\bin. This variable indicates to the operating system a list of directories in which to search for executable files and you can run Java into cmd.

How you can do it read [HERE](https://docs.oracle.com/en/java/javase/11/install/installation-jdk-microsoft-windows-platforms.html#GUID-A7E27B90-A28D-4237-9383-A58B416071CA)

* Download this project and unzip it on your PC.
* Open cmd and move to the directory - AdderCalc.
	* there's contain some java classes from which you need to make the JAR archive. This JAR can be used in the another projects in a further.

	* Compile Java classes:
		* Execute in cmd:
		```
		javac -sourcepath src -d bin src/com/github/andygo298/calculator/AdderCalculator.java
		```
		* where: following```-sourcepath``` indicate to "javac" the directory with source files (src)
			* ```-d bin``` - the destination directory to which these files will be compiled.
			* ```src/com/github/andygo298/calculator/AdderCalculator.java``` - path to the file you want to compile.

	* Create jar:
		* ```jar -cvf calculator.jar -C bin .```
			* where:
				* ```jar -cvf calculator.jar``` - Creating JAR with name "calculator" and outputing info to the CMD
				* ```-С``` - flag after which you should indicate the path to compiled classes.
				* ```.``` - path where "JAR archive" will be created. ```.``` - This is the main directory.
	* Move back to the directory above: ```cd..```
	* You should compile Java class HelloWorld, indicating after ```-classpath``` path to your lib and path to the file for compilating:
	```
	javac -sourcepath src -d HelloWorld/bin -classpath AdderCalc/calculator.jar HelloWorld/src/com/github/andygo298/helloworld/HelloWorld.java
	```
	* Move to the directory -  HelloWorld: ```cd HelloWorld```
	* Build the programm as executable JAR archive:
		* Create file ```manifest.mf```:
			* ```echo main-class: com.github.andygo298.helloworld.HelloWorld>manifest.mf```
			* ```echo class-path: lib/calculator.jar >>manifest.mf```
		* Create directory - lib:
		```
		mkdir lib
		```
		* Create JAR : ```jar -cmf manifest.mf helloworld.jar  -C bin .``` - indicating the path to file ```manifest.mf``` and archive name.
		* Move back to the directory above: ```cd..```
		* Copy from directory "AdderCalc" to directory "lib" your calculator.jar:
		```
		copy AdderCalc\calculator.jar Helloworld\lib
		```
		* Move to the directory "HelloWorld" again: ```cd HelloWorld```
		* Run execurable JAR - ```helloworld.jar``` :
 		```
		java -jar helloworld.jar
		```
* Done!