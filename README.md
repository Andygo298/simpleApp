- открываем командную строку, и переходим в папку adderCalc
- компилируем :
	 javac -sourcepath src -d bin src/com/github/andygo298/calculator/AdderCalculator.java
- создаем jar :
	 jar -cvf calculator.jar -C bin .
- перемещаемся на папку ниже :
	cd..
- компилируем :
	javac -sourcepath src -d HelloWorld/bin -classpath AdderCalc/calculator.jar HelloWorld/src/com/github/andygo298/helloworld/HelloWorld.java
- переходим в HelloWorld :
	cd HelloWorld
- Собираем программу :
1. echo main-class: com.github.andygo298.helloworld.HelloWorld>manifest.mf
2. echo class-path: lib/calculator.jar >>manifest.mf
3. mkdir lib (создаем папку lib)
4. копируем из папки AdderCalc в папку библиотеку calculator.jar:
	copy AdderCalc\calculator.jar Helloworld\lib
- Запускаем исполняемый jar - helloworld.jar :
 java -jar helloworld.jar