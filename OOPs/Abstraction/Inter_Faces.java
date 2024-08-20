/*
Interface: Interface in Java is a blueprint of a class. It has static constants and abstract methods only.

> 100% abstraction is possible in interface.


Points to remember:

1. Interface in Java is a blueprint of a class. It has static constants and abstract methods only.
2. the data members of interface are public, static and final by default.
3. no need to use abstract keyword with methods.
4. it cannot be instantiated.
5. it can only be implemented by those classes which inherit it.
6. it cannot have constructors.

*/

interface Person {
    // String name = "";   //public static final
    // int age = 23;

    void display();
}

class Student implements Person {
    private String name;
    private int age;
    private int rollNo;

    Student(String name, int age, int rollNo) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
    }

    @Override
    public void display() {
        System.out.println("Name: " + name + "\nAge: " + age + "\nRoll No: " + rollNo);
    }
}

public class Inter_Faces {
    public static void main(String[] args) {
        Student s = new Student("Kathan", 19, 29);
        s.display();
    }
}
