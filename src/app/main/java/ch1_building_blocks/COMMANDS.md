# Command line commands
Stages of writing a Java program:
1. Compile source .java files with `javac`:
   `javac [Class].java`
2. Launch file with `java` command:
   `java [Class].java [argument list]`

`java` command allows launching single-file source-code programs without compilation.

The Java interpreter will print the version information and then exit without running the java class:
`java -version TestClass`

**Compiling and Running Code with Packages**:

`javac [package]/[Class].java`

By default, the `javac` command places the compiled classes in the same directory as the source code. The `-d` option specifies the target directory.

`javac -d [target directory] [package]/[Class].java`

You can use commands to specify location of classes needed to compile the program:
`javac -cp [classpath] [package]/[Class].java`
`javac -classpath [classpath] [package]/[Class].java`
`javac --class-path [classpath] [package]/[Class].java`

To run the program, you could need to specify the classpath:
`java -cp [target directory] [package]/[Class]`
`java -classpath [target directory] [package]/[Class]`
`java --class-path [target directory] [package]/[Class]`

**Working with JAR files**:
`- c`, `-- create` - creates a new JAR file
`- v`, `-- verbose` - prints details when working with JAR files
`- f <fileName>`, `-- file <fileName>` - JAR filename
`- C <directory>` - directory containing files to be used to create the JAR

`jar -cvf myNewFile.jar .`
`jar --create --verbose --file myNewFile.jar .`


