JC=javac
CFLAGS=-g
SOURCES= \
	InsertionSorter.java \
	InsertionSorterTest.java
CLASSES=$(subst .java,.class,$(SOURCES))

all:
	javac -g $(SOURCES)

clean:
	rm -rf $(CLASSES)

run: all
	java InsertionSorterTest

.PHONY: all clean run
