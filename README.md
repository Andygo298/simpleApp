### Краткое руководство о том, как работать с Java в командной строке Windows.

* Установить Java на пк.
* Настроить переменные окружения:
	* Переменную JAVA_HOME, которая должна указывать на директорию, в которую установлена Java. 
	* Переменную PATH добавить путь к директории %JAVA_HOME%\bin. Эта переменная указывает операционной системе список директорий, в которых нужно искать исполняемые файлы, и чтобы можно было запускать Java из консоли.

Как это сделать можно прочитать [ТУТ](https://developernotes.ru/java/ustanovka-java-jdk-v-windows-i-linux-peremennaya-path-i-java-home)

* Скачать проект и разархивировать у себя на ПК.
* В консоли перейти в папку проекта - AdderCalc.
	* В папке содержатся несколько java классов из которых нужно создать библиотеку в виде jar архива, которую можно будет использовать в любом проекте, для этого необходимо:
	* Скомпилировать java классы:
		* в командной строке выполнить 
		```
		javac -sourcepath src -d bin src/com/github/andygo298/calculator/AdderCalculator.java
		```
		где: в -sourcepath нужно указать компилятору каталог с исходными кодами классов (src)
		       ```-d bin``` - папка куда будут определены скомпилированные файлы. 
		       ```src/com/github/andygo298/calculator/AdderCalculator.java``` - путь к файлу(-лам) который необходимо скомпилировать
* компилируем :
	 javac -sourcepath src -d bin src/com/github/andygo298/calculator/AdderCalculator.java
* создаем jar :
	 jar -cvf calculator.jar -C bin .
* перемещаемся на папку ниже :
	cd..
* компилируем :
	javac -sourcepath src -d HelloWorld/bin -classpath AdderCalc/calculator.jar HelloWorld/src/com/github/andygo298/helloworld/HelloWorld.java
* переходим в HelloWorld :
	cd HelloWorld
* Собираем программу :
	* echo main-class: com.github.andygo298.helloworld.HelloWorld>manifest.mf
	* echo class-path: lib/calculator.jar >>manifest.mf
	* создаем папку lib:
	```
	mkdir lib
	```
	* копируем из папки AdderCalc в папку библиотеку calculator.jar:
	```
	copy AdderCalc\calculator.jar Helloworld\lib
	```
	* Запускаем исполняемый jar - ```helloworld.jar``` :
 	```
	java -jar helloworld.jar
	```