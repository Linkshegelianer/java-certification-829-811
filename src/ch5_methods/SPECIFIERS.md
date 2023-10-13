# Method Specifiers

## Access modifiers

**Method access modifiers for classes**:
- `private` - only within the same class
- package - from any class in the same package (default access)
- `protected` - from class in the package or subclass
- `public` - can be called from anywhere

**Optional Specifiers**:
- `static` - the method is a member of the shared class object 
- `abstract` - abstract class or interface when the method body is excluded
- `final` - method may not be overridden in a subclass
- `default` - used in an interface to provide a default implementation of a method for classes that implement the interface
- `synchonized` - with the multithreaded code
- `native` - for code written in another language, such as C++
- `strictfp` - for making floating-point calculations portable


**Important**:
- Access modifiers and optional specifiers can be listed in any order, but after the return type the rest is: name, parameter list, exception list, body

- `final` && `abstract` in one method signature won't compile
- Two methods can have same name, but different order of parameters