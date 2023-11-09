# SOLID-Principles-Java


## S-Single Responsibility Principle
A class should have one and only one reason to change, meaning that a class should have only one job.

## O-Open Close Principle
The open–closed principle states "software entities should be open for extension, but closed for modification";
Objects or entities should be open for extension but closed for modification.

## L-Liskov substitution principle
The Liskov Substitution Principle (LSP) is a fundamental principle in object-oriented programming that states that objects of a superclass should be able to be replaced with objects of a subclass without affecting the correctness of the program.
Substitute the object without breaking the code.
we swap thw parent object with child object the program should not break
class c have three child classes c1 c2 c3 if replace with parent object with child object either c1,c2 or c3 program should not break
we can not down sizing the subclass
    1. Put only very generic method to all 

## I-Interface Segregation Principle
Interface segregation principle states:
A client should never be forced to implement an interface that it doesn’t use, or clients shouldn’t be forced to depend on methods they do not use.

## D-Dependency Inversion Principle
Dependency inversion principle states:
Entities must depend on abstractions, not on concretions. It states that the high-level module must not depend on the low-level module, but they should depend on abstractions.
### Class should depend on interface rather than concrete class 
