# What is Java

.class files are not executable, JVM is executable program
JAR - archive of Java class files

JRE interprets bytecode

JRE contains:
- Java Application Launcher
- Virtual Machine
- Java standard class library (not Java API)

In order to run bytecode on any OS and architecture, you only need JRE available for them.

Bytecode is platform independent!!

Java compiler converts the source code into binary code, which is run by an interpreter




JDK itself provides the Java development environment. It includes the tools such as compiler, JVM, and debugger.

IDEs add features on top of the JDK. They provide a code editor, a compiler or interpreter. and a debugger that the developer accesses through a unified graphical user interface (GUI). Java IDEs also include language-specific elements such as Ant and Maven build tools and TestNG and JUnit testing.

JRE is just the run time environment that is required to run a java program. It does not include any development tools. In earlier versions of Java, JDK used to come with a JRE but from Java 11, due to modularization, there is no separate JRE.

JDK provides:
* JRE
* API for Java SE Standard
* Database engine (before JDK 11)
* Integration libraries (JDBC API)
* Networking protocols (TCP, UDP, HTTP, HTTPS)

Java Web Start (Java WS, JAWS) framework allows users to start application from browser

Java source files:
- must have zero or more import statements
- All the classes that belong to the same package as the package of this class are automatically imported
- It can only have zero or one package statement

You are developing a Java rich client application that is to be installed on a lot of workstations used by the employees of your company. The users are located in various office locations across the globe. Which of the following Java technologies will be useful in delivering the application to the users over the internet?
Java Web Start (also known as JavaWS, javaws or JAWS) framework allows users to start application software for the Java Platform directly from the Internet using a web browser. Some key benefits of this technology include seamless version updating for globally distributed applications and greater control of memory allocation to the Java virtual machine.

Java Web Start was distributed as part of the Java Platform, and included in downloads of the JRE and JDK.

FYI: It was deprecated by Oracle in Java SE 9 and removed in Java SE 11.

JavaBeans naming conventions:
1. There must be a public Y getXxx() method for a property named xxx of type Y.
   Conversly, if a class has a method public Y getXxx(), it is said to have a property named xxx of type Y. (A setter is not necessary, in which case it will be a readonly property.)

2. The setter method, if it exists, must be public void setXxx(Y y){ }

3. There is no rule for the variable xxx but making it private is a good practice.
   It is ok even if a class does not have any variable xxx in the class, as shown by getMaturity() method in the question.

4. A boolean property xxx should have getXxx() or isXxx() method. The setter, if it exists, should be setXxx().


Trues about Java:
- It provides automatic memory management
- It provides automatic exception handling. - wrong, it's manual
- It provides database connectivity.


Java ME can be used to develop applications for: Embedded applications for Raspberry Pi.

