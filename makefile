SOURCE_FILE=MarkdownParse
TEST_FILE=MarkdownParseTest
CLASSPATH="lib/junit-4.12.jar:lib/hamcrest-core-1.3.jar:."

MarkdownParse.class: MarkdownParse.java
	javac MarkdownParse.java


MarkdownParseTest.class: MarkdownParseTest.java MarkdownParse.class
	javac -cp .:lib/junit-4.12.jar:lib/hamcrest-core-1.3.jar MarkdownParseTest.java
	java -cp .:lib/junit-4.12.jar:lib/hamcrest-core-1.3.jar org.junit.runner.JUnitCore MarkdownParseTest

