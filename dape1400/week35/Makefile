CLASSPATH = .:/usr/share/java/junit4.jar
javac = javac -cp $(CLASSPATH)
java = java -cp $(CLASSPATH)

%.class: %.java
	$(javac) $<

default: LawnMower.class

test: UnitTests.class LawnMower.class
	$(java) org.junit.runner.JUnitCore UnitTests

clean:
	rm -f *.class
