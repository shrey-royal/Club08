#include<iostream>
using namespace std;

class Student {
private:
    int rollNo;
    string name;
    float marks;

public:
    // Student() {
    //     rollNo = 0;
    //     name = "";
    //     marks = 0.0;
    //     cout << "Default constructor called..." << endl;
    // }

    Student() {
        cout << "\nEnter your rollNo.: ";
        cin >> rollNo;

        cout << "\nEnter your name: ";
        cin.ignore();
        getline(cin, name);

        cout << "\nEnter your marks: ";
        cin >> marks;
    }

    // Student(int r, string n, float m) {
    //     rollNo = r;
    //     name = n;
    //     marks = m;
    //     cout << "Parameterized constructor called..." << endl;
    // }

    void display() {
        cout << "RollNo.: " << rollNo << endl;
        cout << "Name: " << name << endl;
        cout << "Marks: " << marks << endl;
    }
};


int main() {
    // int rno;
    // string n;
    // float m;
    // Student s(101, "Dhruv", 90.9), s1(102, "Saumyya", 99.9);

    // s.display();
    // cout << endl;
    // s1.display();

    // cout << "\nEnter your rollNo.: ";
    // cin >> rno;

    // cout << "\nEnter your name: ";
    // cin.ignore();
    // getline(cin, n);

    // cout << "\nEnter your marks: ";
    // cin >> m;

    // Student s2(rno, n, m);

    // s2.display();

    Student s;
    s.display();


    return 0;
}

/*
Constructor: it is a special method which invokes automatically upon creation of the object.
constructors are used to initialize the data members

3 types of constructors: 
1) Default Constructor (Non-parameterized Constructor)
2) Parameterized Constructor (Parameterized Constructor)
3) Copy Constructor

Rules: 
> the name of the constructor should be the same as the class name
> it cannot have return type
> it must be public

> CPP will create a default constructor everytime we create an object.

Tasks:

1. Create a class representing a car with member variables for make, model, and year. Write a default constructor that initializes these variables to default values.
   
2. Implement a class for a geometric shape with member variables representing its dimensions. Write a parameterized constructor that initializes these dimensions when an object is created.

3. Design a class to model a bank account with member variables for account number, balance, and account holder name. Write a constructor that takes initial values for these variables.

4. Develop a class for a book with member variables for title, author, and publication year. Write a constructor that initializes these variables when an object of the class is instantiated.

5. Create a class representing a student with member variables for name, roll number, and age. Write a constructor that accepts these details as parameters during object creation.

6. Design a class to represent a point in a 2D coordinate system. Write a constructor that initializes the x and y coordinates to specific values.

7. Implement a class for a bank transaction with member variables for transaction ID, amount, and transaction type. Write a constructor that initializes these variables.

8. Develop a class to model a circle with member variables for radius and center coordinates. Write a constructor that initializes these variables when an object is created.

9. Design a class representing a calendar event with member variables for event name, date, and time. Write a constructor that takes these details as parameters.

10. Create a class to represent a computer with member variables for brand, model, and price. Write a constructor that initializes these variables when an object of the class is instantiated.



*/