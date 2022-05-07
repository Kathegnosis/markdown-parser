SOURCE_FILE=MarkdownParse
TEST_FILE=MarkdownParseTest
CLASSPATH="lib/junit-4.12.jar:lib/hamcrest-core-1.3.jar:."

MarkdownParse.class: MarkdownParse.java
	/software/CSE/oracle-java-17/jdk-17.0.1/bin/javac MarkdownParse.java
	/software/CSE/oracle-java-17/jdk-17.0.1/bin/java -cp .:lib/junit-4.12.jar:lib/hamcrest-core-1.3.jar org.junit.runner.JUnitCore MarkdownParseTest


MarkdownParseTest.class: MarkdownParseTest.java MarkdownParse.class
	/software/CSE/oracle-java-17/jdk-17.0.1/bin/javac -cp .:lib/junit-4.12.jar:lib/hamcrest-core-1.3.jar MarkdownParseTest.java
	/software/CSE/oracle-java-17/jdk-17.0.1/bin/java -cp .:lib/junit-4.12.jar:lib/hamcrest-core-1.3.jar org.junit.runner.JUnitCore MarkdownParseTest

