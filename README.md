### Краткое руководство о том, как работать с Java в командной строке Windows.

* Установить Java на пк.
* Настроить переменные окружения:
	* Переменную JAVA_HOME, которая должна указывать на директорию, в которую установлена Java. 
	* Переменную PATH добавить путь к директории %JAVA_HOME%\bin. Эта переменная указывает операционной системе список директорий, в которых нужно искать исполняемые файлы, и чтобы можно было запускать Java из консоли.

Как это сделать можно прочитать [ТУТ](https://developernotes.ru/java/ustanovka-java-jdk-v-windows-i-linux-peremennaya-path-i-java-home)

* открываем командную строку, и переходим в папку adderCalc
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
	* mkdir lib (создаем папку lib)
	* копируем из папки AdderCalc в папку библиотеку calculator.jar:
	copy AdderCalc\calculator.jar Helloworld\lib
	* Запускаем исполняемый jar - helloworld.jar :
 	`<java -jar helloworld.jar>`