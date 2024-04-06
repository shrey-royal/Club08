#include<iostream>
using namespace std;

class Book {
    int ISBN;
    string title, author;
    float price;

public:
    Book() {}

    Book(int isbn, string t, string a, float p) {
        ISBN = isbn;
        title = t;
        author = a;
        price = p;
    }

    Book (Book &book) {
        ISBN = book.ISBN;
        title = book.title;
        author = book.author;
        price = book.price;
    }

    void display() {
        cout << "ISBN: " << ISBN << endl;
        cout << "Title: " << title << endl;
        cout << "Author: " << author << endl;
        cout << "Price: " << price << endl;
    }
};

int main() {
    Book b(1244, "Life's a Lie", "Dhruv Sharma", 499);

    // b.ISBN = 1234;
    // b.title = "Life's a Lie";
    // b.author = "Dhruv Sharma";
    // b.price = 499;

    b.display();
    cout << endl;

    Book b1(b);
    b1.display();

    return 0;
}

/* copy constructor
Tasks:

1. Create a class representing a musical playlist with a dynamic array of song objects. Implement a copy constructor to ensure a deep copy of the playlist, including all song details.

2. Design a class to model a shopping cart for an online store with dynamic storage for product items. Implement a copy constructor to support duplicating the shopping cart contents for different user sessions.

3. Develop a class representing a maze solver algorithm with a stack of traversal steps. Implement a copy constructor to enable creating a copy of the solver state for backtracking purposes.

4. Build a class to simulate a graph data structure with vertices and edges. Include a copy constructor to support duplication of the graph structure while maintaining proper connections between vertices.

5. Design a class representing a social media post with dynamic storage for comments and likes. Implement a copy constructor to facilitate sharing posts across multiple user profiles.

6. Create a class to model a calendar event with attributes like title, date, and attendees. Implement a copy constructor to enable duplicating calendar events for scheduling conflicts resolution.

7. Develop a class representing a scientific experiment setup with dynamic storage for equipment objects. Implement a copy constructor to support replicating the experiment setup for comparative analysis.

8. Build a class to simulate a digital image with a matrix of pixel values. Implement a copy constructor to ensure proper copying of the image data for image processing operations.

9. Design a class representing a crossword puzzle with dynamic storage for word entries. Implement a copy constructor to enable creating variations of the puzzle for different difficulty levels.

10. Create a class to model a student enrollment system with dynamic storage for course registrations. Implement a copy constructor to support duplicating student enrollment records for academic audits and analysis.

*/