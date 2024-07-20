class Address {
    private String city;
    private String state;

    Address(String city, String state) {
        this.city = city;
        this.state = state;
    }

    void getAddress() {
        System.out.println("City: " + city);
        System.out.println("State: " + state);
    }
}

class Employee {
    private int id;
    private String name;
    private Address address;    //Aggregation
    private double salary;
    private String designation;

    public Employee(int id, String name, Address address, double salary, String designation) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.designation = designation;
    }

    void displayEmployeeDetails() {
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
        address.getAddress();
        System.out.println("Salary: " + String.format("%.0f", salary));
        System.out.println("Designation: " + designation);
    }
}

public class Aggregation {
    public static void main(String[] args) {
        Address address = new Address("Gandhinagar", "Gujarat");
        Employee pratham = new Employee(123, "Pratham Patel", address, 10000000, "Senior Manager");

        pratham.displayEmployeeDetails();
    }
}

/*
Tasks:

--> Problem Statement 1: Sales Data Aggregation

Context:
You are working for a retail company that has multiple stores. Each store records its sales data, which includes the sales amount and the date of the sale. Your task is to write a Java program that aggregates the sales data to provide insights such as total sales, average sales per day, and total sales for each store.

Requirements:
1. Create a `Store` class that contains a list of `Sale` objects. Each `Sale` object should have attributes such as `date` (of type `LocalDate`) and `amount` (of type `double`).
2. Write methods in the `Store` class to:
   - Calculate the total sales for the store.
   - Calculate the average sales per day for the store.
   - Group sales data by month and calculate the total sales for each month.
3. Write a `RetailCompany` class that contains a list of `Store` objects.
4. Write methods in the `RetailCompany` class to:
   - Calculate the total sales for the company.
   - Calculate the average sales per store.
   - Find the store with the highest total sales.

Example Usage:

Store store1 = new Store();
store1.addSale(new Sale(LocalDate.of(2023, 1, 1), 100.0));
store1.addSale(new Sale(LocalDate.of(2023, 1, 2), 150.0));

Store store2 = new Store();
store2.addSale(new Sale(LocalDate.of(2023, 1, 1), 200.0));
store2.addSale(new Sale(LocalDate.of(2023, 1, 2), 250.0));

RetailCompany company = new RetailCompany();
company.addStore(store1);
company.addStore(store2);

System.out.println("Total sales for the company: " + company.getTotalSales());
System.out.println("Average sales per store: " + company.getAverageSalesPerStore());
System.out.println("Store with the highest sales: " + company.getTopStore().getTotalSales());


--> Problem Statement 2: Student Grades Aggregation

Context:
You are developing a system for a school to manage students' grades. Each student can be enrolled in multiple courses, and each course has multiple grades recorded for the student. Your task is to write a Java program that aggregates the grades data to provide insights such as total grades, average grade, and highest grade for each student.

Requirements:
1. Create a `Course` class that contains a list of `Grade` objects. Each `Grade` object should have attributes such as `date` (of type `LocalDate`) and `score` (of type `double`).
2. Write methods in the `Course` class to:
   - Calculate the total grades for the course.
   - Calculate the average grade for the course.
   - Find the highest grade for the course.
3. Create a `Student` class that contains a list of `Course` objects.
4. Write methods in the `Student` class to:
   - Calculate the total grades for the student across all courses.
   - Calculate the average grade for the student across all courses.
   - Find the course with the highest average grade.

Example Usage:

Course math = new Course();
math.addGrade(new Grade(LocalDate.of(2023, 1, 1), 90.0));
math.addGrade(new Grade(LocalDate.of(2023, 1, 2), 85.0));

Course science = new Course();
science.addGrade(new Grade(LocalDate.of(2023, 1, 1), 95.0));
science.addGrade(new Grade(LocalDate.of(2023, 1, 2), 80.0));

Student student = new Student();
student.addCourse(math);
student.addCourse(science);

System.out.println("Total grades for the student: " + student.getTotalGrades());
System.out.println("Average grade for the student: " + student.getAverageGrade());
System.out.println("Course with the highest average grade: " + student.getTopCourse().getAverageGrade());



*/