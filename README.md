A demonstration of various features of Java 8.
I'll talk about it at a [Coder's Breakfast](http://www.it-agile.de/codersbreakfast/) later this summer.

Some code written by [Sebastian Keller](http://github.com/se-keller/java8gymnastik).

Talking Points
==============
Lambda Expressions

Method references

Default methods enable new functionality to be added to the interfaces of libraries and ensure binary compatibility with code written for older versions of those interfaces.

java.util.stream

Lambdas use invokedynamic, byte code libs may fail
https://github.com/jboss-javassist/javassist/blob/master/src/main/javassist/bytecode/ClassFile.java
https://github.com/jboss-javassist/javassist/blob/master/src/main/javassist/bytecode/ConstPool.java

Javadoc now checks content of JavaDoc-commment, builds creating javadoc may fail
-Xdoclint:none
failOnError

Repeating Annotations

Method parameter reflection: javac -parameters

Method #1
public boolean ExampleMethods.simpleMethod(java.lang.String,int)
             Return type: boolean
     Generic return type: boolean
         Parameter class: class java.lang.String
          Parameter name: stringParam
               Modifiers: 0
            Is implicit?: false
        Is name present?: true
           Is synthetic?: false
         Parameter class: int
          Parameter name: intParam
               Modifiers: 0
            Is implicit?: false
        Is name present?: true
           Is synthetic?: false
