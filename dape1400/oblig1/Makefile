CLASSPATH = .:/usr/share/java/junit4.jar
javac = javac -cp $(CLASSPATH)
java = java -cp $(CLASSPATH)

%.class: %.java
	$(javac) $<

default: IntSplit.class

test: IntSplit.class IntSplitTest.class
	$(java) org.junit.runner.JUnitCore IntSplitTest

clean:
	rm -f *.class
