// 10. Social Media Platform:
    // Problem Statement: Create a social media platform where users can create profiles, connect with friends, and share posts. Implement classes for users, profiles, connections, and posts, with functionalities for adding friends, posting updates, and interacting with other users' content.

#include<iostream>
#include<string>
using namespace std;

class User {
    public:
    int uid;
    string name;
    string password;
    string email;
    string gender;
    long int phoneNumber;
    int friends[10] = {0};
    int friends_Counter = 0;

    void createProfile() {
        cout << "Creating Profile: " << endl;
        uid = 34876;
        
        cin.ignore();
        cout << "Name: ";
        // cin >> name;
        getline(cin, name);

        cout << "Enter Password: ";
        cin >> password;

        cout << "Enter Email: ";
        cin >> email;

        cout << "Enter Gender: ";
        cin >> gender;

        cout << "Enter ph-no.: ";
        cin >> phoneNumber;

        cout << "User Profile Created Successfully!" << endl;
    }

    void connectFriends(int uid) {
        friends[friends_Counter++] = uid;
        cout << "Friendship Accepted";
    }

    void sharePost() {
        cout << "Post shared..." <<  endl;
    }
};

int main() {
    User saumyya, krish;

    saumyya.createProfile();
    krish.createProfile();

    saumyya.connectFriends(krish.uid);
    krish.connectFriends(saumyya.uid);

    krish.sharePost();
}
