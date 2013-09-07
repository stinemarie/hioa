CLASSPATH = .:/usr/share/java/junit4.jar
javac = javac -cp $(CLASSPATH)
java = java -cp $(CLASSPATH)

testclasses = $(patsubst %.java,%.class,$(wildcard *Test.java))
classes = $(filter-out $(testclasses),$(patsubst %.java,%.class,$(wildcard *.java)))
tests = $(patsubst %.class,%,$(testclasses))

%.class: %.java
	$(javac) $<

%Test: %Test.class $(classes)
	$(java) org.junit.runner.JUnitCore $@

default: $(classes)

test: $(tests)

clean:
	rm -f *.class

.PHONY: default test clean $tests
