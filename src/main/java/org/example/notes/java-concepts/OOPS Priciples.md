# Object Oriented Programming Principles

### Encapsulation
Encapsulation is wrapping data(variables) and functionality(methods) together as a single unit. Functionalities mean “methods” and data means “variables”. It’s all wrapped in is “class.” It is a blueprint or a set of instruction.

Class: A class is a blueprint or prototype that defines the variables and the methods. For example:
Class: Car
Data members or objects: color, type, model, etc.
* Methods: stop, accelerate, cruise.

* Object: Now, an object is a specimen of a class. Like in the above example my car is an object of the class Car.

* Variable: can be local, instance and static. Local variables are declared inside the body of a method. Instance variables are declared outside method. They are object specific. Static variables are initialized only once and at the start of program execution. Static variables are initialized first, we will discuss static in detail later.

* Package: A Package is a collection of related classes. It helps organize classes into a folder structure and make it easy to locate and reuse them.
* Method: methods are various functionalities, its nothing but set of code which is referred to by name and can be called (invoked) at any point in a program. You can pass multiple values to a method and it returns value(s).
#### Example of Objects
Continuing with the example of students, let's create some students as objects and print their details.
```
// create a Student class
public class Student {
   // Declaring private attributes
   private String name;
   private int rollNo;
   private String section;

   // initialize attributes
   Student(String name, int rollNo, String section){
      this.name= name;
      this.rollNo = rollNo;
      this.section = section;
   }
   // print details	  
   public void printDetails() {
      System.out.print("Student Details: ");
      System.out.println(this.name+ ", " + this.rollNo + ", " + section);
   }

   public static void main(String[] args) {
      // create student objects  
      Student student1 = new Student("Robert", 1, "IX Blue");
      Student student2 = new Student("Adam", 2, "IX Red");
      Student student3 = new Student("Julie", 3, "IX Blue");

      // print student details
      student1.printDetails();
      student2.printDetails();
      student3.printDetails();
   }
}
```
#### Output
Let us compile and run the above program, this will produce the following result −
```
Student Details: Robert, 1, IX Blue
Student Details: Adam, 2, IX Red
Student Details: Julie, 3, IX Blue
```

### Abstraction
In object-oriented programming, an abstraction is a technique of hiding internal details and showing functionalities. The abstract classes and interfaces are used to achieve abstraction in Java.

The real-world example of an abstraction is a Car, the internal details such as the engine, process of starting a car, process of shifting gears, etc. are hidden from the user, and features such as the start button, gears, display, break, etc are given to the user. When we perform any action on these features, the internal process works.
#### Example of Abstraction
Let's create an Abstract Vehicle class and Car extending the Vehicle class. Vehicle will abstract away internal functionalities.

```
abstract class Vehicle {
   public void startEngine() {
      System.out.println("Engine Started");
   }
}
public class Car extends Vehicle {
   private String color;

   public Car(String color) {
      this.color = color;
   }

   public void printDetails() {
      System.out.println("Car color: " + this.color);
   }

   public static void main(String[] args) {
      Car car = new Car("White");

      car.printDetails();
      car.startEngine();
   }
}
```
#### Output
Let us compile and run the above program, this will produce the following result −
```
Car color: White
Engine Started
```
### Inheritance
In object-oriented programming, inheritance is a process by which we can reuse the functionalities of existing classes to new classes. In the concept of inheritance, there are two terms base (parent) class and derived (child) class. When a class is inherited from another class (base class), it (derived class) obtains all the properties and behaviors of the base class.

#### Example of Inheritance :-
Continuing with the example of students, let's make student a derived class of person class. Person class will have a single field name and student class will inherit the same as shown below:
```
// base class for all students
class Person {
   String name;

   Person(String name){
      this.name = name;
   }
}

// create a Student class
public class Student extends Person {
   // Declaring attributes
   int rollNo;
   String section;

   // initialize attributes
   Student(String name, int rollNo, String section){
      super(name);
      this.rollNo = rollNo;
      this.section = section;
   }
   // print details	  
   public void printDetails() {
      System.out.print("Student Details: ");
      System.out.println(this.name+ ", " + this.rollNo + ", " + section);
   }

   public static void main(String[] args) {
      // create student objects  
      Student student1 = new Student("Robert", 1, "IX Blue");
      Student student2 = new Student("Adam", 2, "IX Red");
      Student student3 = new Student("Julie", 3, "IX Blue");

      // print student details
      student1.printDetails();
      student2.printDetails();
      student3.printDetails();
   }
}
```
### Output
Let us compile and run the above program, this will produce the following result −
```
Student Details: Robert, 1, IX Blue
Student Details: Adam, 2, IX Red
Student Details: Julie, 3, IX Blue
```
### Polymorphism
The term "polymorphism" means "many forms". In object-oriented programming, polymorphism is useful when you want to create multiple forms with the same name of a single entity. To implement polymorphism in Java, we use two concepts method overloading and method overriding.

The method overloading is performed in the same class where we have multiple methods with the same name but different parameters, whereas, the method overriding is performed by using the inheritance where we can have multiple methods with the same name in parent and child classes.
#### Example of Polymorphism :
Continuing with the example of students, let's add another method printDetails() with additional parameter to modify the behavior of the method.

```
// create a Student class
public class Student {
   // Declaring attributes
   String name;
   int rollNo;
   String section;

   // initialize attributes
   Student(String name, int rollNo, String section){
      this.name= name;
      this.rollNo = rollNo;
      this.section = section;
   }
   // print details	  
   public void printDetails() {
      System.out.print("Student Details: ");
      System.out.println(this.name+ ", " + this.rollNo + ", " + section);
   }

   // print details without section if required	  
   public void printDetails(boolean hideSection) {
      System.out.print("Student Details: ");
      System.out.println(this.name+ ", " + this.rollNo + ", " + (hideSection ? "" : section));
   }

   public static void main(String[] args) {
      // create student objects  
      Student student1 = new Student("Robert", 1, "IX Blue");
      Student student2 = new Student("Adam", 2, "IX Red");
      Student student3 = new Student("Julie", 3, "IX Blue");

      // print student details
      student1.printDetails();
      student2.printDetails(true);
      student3.printDetails(false);
   }
}
```
#### Output
Let us compile and run the above program, this will produce the following result −
```
Student Details: Robert, 1, IX Blue
Student Details: Adam, 2,
Student Details: Julie, 3, IX Blue
```