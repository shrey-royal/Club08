#include<iostream>
using namespace std;

class Base {
public:
    void display() {
        cout << "Base class" << endl;
    }
};

class Derived1 : public Base {
public:
    void show() {
        cout << "Derived1 class" << endl;
    }
};


class Derived2 : public Base {
public:
    void print() {
        cout << "Derived2 class" << endl;
    }
};


class Derived3 : public Derived1, public Derived2 {
public:
    void output() {
        cout << "Derived3 class" << endl;
    }
};

int main() {
    Derived3 obj;

    obj.Derived1::display();  //Ambiguity Error: from which class display() will be called?
    obj.show();
    obj.print();
    obj.output();

    return 0;
}

/*
Scope Resolution Operator-> (::)
*/