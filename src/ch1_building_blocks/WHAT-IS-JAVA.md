# What is Java

**JDK (Java Development Kit)** = JRE + Development Tools  
**JRE (Java Runtime Environment)** = JVM + Java Standard Class Library

JDK provides:
* JRE
* API for Java SE Standard
* Database engine (before JDK 11)
* Integration libraries (JDBC API)
* Networking protocols (TCP, UDP, HTTP, HTTPS)

JRE contains:
* Java Application Launcher
* Virtual Machine
* Java standard class library (not Java API)

**JVM (Java Virtual Machine)** is a software which mimics a computer and runs on top of a physical computer.   
JVM translates the bytecode instructions and translates them into the machine code.

Java Class Library == Java APIs = code in the standard library which is organized in various packages
- JVM + Java standard class library (Java API) => JRE (makes WORA possible)

*Executing Java program on a machine requires JRE*  
*Developing Java programs requires JDK*

Important:
- There is no JVM for iOS and Android-based computers: Android uses the programming language aspect of Java and provides its own tools and libraries to translate Java code into the machine code that Android understands
- JVM has no dependency on the Java programming language: we can write programs on different languages and compile them into Java byte code
- JVM is like any other application program running on the computer which takes help from the Operating System to use the resources of the physical computer
- .class files are not executable, JVM is executable program

**Java Web Start (Java WS, JAWS)** framework allows users to start application from browser  
FYI: It was deprecated by Oracle in Java SE 9 and removed in Java SE 11.

**Java source files**:
- must have zero or more import statements
- All the classes that belong to the same package as the package of this class are automatically imported
- It can only have zero or one package statement

**JavaBeans naming conventions**:
1. There must be a public Y getXxx() method for a property named xxx of type Y.
2. The setter method, if it exists, must be public void setXxx(Y y)
3. There is no rule for the variable xxx but making it private is a good practice.
4. A boolean property xxx should have getXxx() or isXxx() method. The setter, if it exists, should be setXxx().

**Trues about Java**:
- It provides automatic memory management
- It provides automatic exception handling. - wrong, it's manual
- It provides database connectivity.

Java ME can be used to develop applications for: Embedded applications for Raspberry Pi.

**Garbage collection**:
- Garbage collection allows the JVM to reclaim memory for other objects.
- An object may be eligible for garbage collection but never removed from the heap.
- An object is eligible for garbage collection once no references to it are accessible in the program.
