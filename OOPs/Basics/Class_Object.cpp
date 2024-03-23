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