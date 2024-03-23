#include<iostream>
using namespace std;

class Student {
        int id;
        string name;
        float marks;
    
    public:
    void scan() {
        cout << "Enter id: ";
        cin >> id;

        cout << "Enter name: ";
        // cin >> name;
        cin.ignore();   //clear buffer memory
        getline(cin, name);

        cout << "Enter marks: ";
        cin >> marks;
    }

    void display() {
        cout << "Id: " << id << endl;
        cout << "Name: " << name << endl;
        cout << "Marks: " << marks << endl;
    }
};

int main() {
    Student student;

    // student.id = 23;
    // student.name = "Vedant Uchiha";
    // student.marks = 78.34876;

    student.scan();

    cout << "Displaying Stduent Details: " << endl;
    // cout << "Id: " << student.id << endl;
    // cout << "Name: " << student.name << endl;
    // cout << "Marks: " << setprecision(4) << fixed << student.marks << endl;

    student.display();

    return 0;
}

/*
tasks:

1. Library Management System:
   Problem Statement: Design a system to manage library resources such as books, journals, and DVDs. Implement classes for library items, patrons, and a system to handle checkouts, returns, and overdue fines.

2. Online Shopping System:
   Problem Statement: Create a platform for online shopping where customers can browse products, add them to their cart, and proceed to checkout. Implement classes for products, customers, and shopping carts, with features for adding/removing items and calculating totals.

3. Bank Account Management:
   Problem Statement: Develop a system to manage bank accounts with features like deposits, withdrawals, and balance inquiries. Implement classes for different account types such as savings and checking accounts, each with appropriate functionalities.

4. Student Information System:
   Problem Statement: Build a system to store and manage student information including details like name, ID, courses enrolled, and grades. Design classes to represent students, courses, and grades, with methods for adding new students, enrolling them in courses, and calculating GPA.

5. Hospital Management System:
   Problem Statement: Design a software solution to manage hospital operations including patient records, appointments, and medical histories. Implement classes for patients, doctors, appointments, and medical records, with functionalities for scheduling appointments, updating records, and managing billing.

6. Inventory Management System:
   Problem Statement: Create a system to track inventory for a retail store, including products, quantities, and sales. Design classes for products, inventory items, and sales transactions, with methods for updating inventory levels and generating sales reports.

7. Car Rental System:
   Problem Statement: Develop a platform for renting cars to customers, handling reservations, and tracking vehicle availability. Implement classes for cars, customers, reservations, and rental transactions, with features for checking availability, making reservations, and processing payments.

8. Employee Payroll System:
   Problem Statement: Build a system to manage employee payroll, including tracking hours worked, calculating salaries, and generating pay stubs. Design classes for employees, timecards, and pay periods, with functionalities for recording hours, calculating wages, and generating reports.

9. Hotel Booking System:
   Problem Statement: Design a software solution for managing hotel reservations, room assignments, and guest check-ins. Implement classes for rooms, guests, reservations, and bookings, with features for checking availability, making reservations, and processing payments.

10. Social Media Platform:
    Problem Statement: Create a social media platform where users can create profiles, connect with friends, and share posts. Implement classes for users, profiles, connections, and posts, with functionalities for adding friends, posting updates, and interacting with other users' content.

*/