class Animal {
    void makeSound() {
        System.out.println("Generic animal sound");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Woof! Woof!");
    }
}

public class InstanceOf {
    public static void main(String[] args) {
        // Upcasting
        Animal myDog = new Dog();   //upcasting
        // System.out.println(myDog instanceof Animal);
        // myDog.makeSound();

        //Downcasting
        Dog d = (Dog) myDog;    //downcasting
        System.out.println(d instanceof Animal);
        d.makeSound();
        d.bark();
    }
}
/*
instanceof is a keyword that is used for checking if a reference variable is containing a given type of object reference or not.

Upcasting and downcasting

Upcasting: Converting a subclass reference to a superclass reference is called upcasting.

Downcasting: Converting a superclass reference to a subclass reference is called downcasting.


Tasks:

Scenario 1: Online Course Platform
In an online course platform, create classes like "Course," "VideoLesson," and "Quiz" representing different course components. Use the instanceof operator to determine the type of course component and perform specific actions or display relevant information.

Scenario 2: Animal Shelter
In an animal shelter application, have classes like "Animal," "Cat," and "Dog" representing different types of animals. Use the instanceof operator to identify the type of animal and apply specific operations like feeding or grooming based on the animal's type.

Scenario 3: University Course Registration
In a university course registration system, have classes like "Course," "Lecture," and "Lab" representing different types of courses. Use the instanceof operator to determine the type of course and perform specific registration operations based on the course type.

Scenario 4: Vehicle Service Center
In a vehicle service center application, create classes like "Vehicle," "Car," and "Motorcycle" representing different types of vehicles. Use the instanceof operator to identify the type of vehicle and perform specific service operations based on the vehicle's type.

*/