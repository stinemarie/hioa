CLASSPATH = .:/usr/share/java/junit4.jar
javac = javac -cp $(CLASSPATH)
java = java -cp $(CLASSPATH)

testclasses = $(patsubst %.java,%.class,$(wildcard *Test.java))
classes = $(filter-out $(testclasses),$(patsubst %.java,%.class,$(wildcard *.java)))
tests = $(basename $(testclasses))
tarfile = $(shell basename $(shell pwd)).tar.gz

%.class: %.java
	$(javac) $<

%Test: %Test.class $(classes)
	$(java) org.junit.runner.JUnitCore $@

default: $(classes)

test: $(tests)

clean:
	rm -f $(classes) $(tests) $(tarfile)

tarfile:
	find -iname '*.java' -print0 | xargs --null tar -cvzf $(tarfile) Makefile

.PHONY: default test clean $tests
