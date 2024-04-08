#include<iostream>
using namespace std;

//static keyword
class Student {
private:
    int rollNo;
    string name;
    float marks;
    string college;
public:
    void display() {
        cout << "RollNo.: " << rollNo << endl;
        cout << "Name: " << name << endl;
        cout << "Marks: " << marks << endl;
        cout << "College: " << college << endl;
    }
}*s=NULL;


int main() {
    // Student student();
    // s = (Student *)&student;
    // Student student;
    // s = &student;

    s = new Student[5]();
    s[0].display();


    return 0;
}