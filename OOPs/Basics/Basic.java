import java.util.Scanner;

class Employee {
    private int empID;
    private String name;
    private double salary;

    //default access specifier (folder/package level access)
    void scanDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter empID: ");
        empID = sc.nextInt();

        sc.nextLine();  //to clear the buffer
        System.out.print("Enter name: ");
        name = sc.nextLine();

        System.out.print("Enter salary: ");
        salary = sc.nextDouble();

        sc.close(); //to prevent resource leak
    }

    void printDetails() {
        System.out.println("Employee ID: " + empID);
        System.out.println("Name: " + name);
        // String str = "Salary: %.0f";
        // System.out.println(String.format(str, salary));
        System.out.printf("Salary: %0.f", salary);
    }
}

public class Basic {
    public static void main(String[] args) {
        // Employee e; //declaration of an object
        // e = new Employee(); //instantiation of an object

        Employee e = new Employee();    //both at same time
        // Employee e1[] = new Employee[10];

        // for (int i = 0; i < e1.length; i++) {
        //     e1[i] = new Employee();
        // }

        e.scanDetails();

        e.printDetails();
    }
}