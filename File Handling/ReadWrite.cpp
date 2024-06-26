#include<iostream>
#include<fstream>   //fstream = ifstream(input file stream) + ofstream(output file stream)
using namespace std;

class FileHandler {
    string str;
public:
    string fileName;

    void writeFile() {
        ofstream file(fileName.append(".txt")); //writing data into the file

        // ofstream file;
        // file.open(fileName.append(".txt"), ios::out);

        if(file.is_open()) {
            cout << "Enter the data to store into " << fileName << ": ";
            getline(cin, str);

            file << str << endl;

            file.close();
        } else cout << "Error opening the file..." << endl;
    }

    void readFile() {
        ifstream file(fileName.append(".txt"));

        if(file.is_open()) {
            file.clear();
            while(getline(file, str)) {
                cout << str << endl;
            }

            file.close();
        } else cout << "Error opening the file..." << endl;
    }

    void updateFile() {
        ofstream file(fileName.append(".txt"), ios::app);

        if(file.is_open()) {
            cout << "Enter the data to store into " << fileName << ": ";
            getline(cin, str);
            
            file << endl;
            file << str << endl;
            
            file.close();
        } else cout << "Error opening the file..." << endl;
    }

    void findWord() {
        ifstream file(fileName.append(".txt"));
        string word, line;
        bool found = false;

        cout << "Enter the word in file: ";
        cin >> word;
        cin.ignore();

        if(file.is_open()) {
            while(getline(file, line)) {
                if(line.find(word) != string::npos) {
                    cout << "Found the word \"" << word << "\" in line: " << line << endl;
                    found = true;
                }
            }

            if(!found) {
                cout << "Word \"" << word << "\" not found in the file." << endl;
            }

            file.close();
        } else {
            cout << "Error opening the file..." << endl;
        }
    }

    void replaceWord() {
        ifstream file(fileName + ".txt");
        ofstream tempFile("temp.txt");
        string oldWord, newWord, line;
        bool replaced = false;

        cout << "\nEnter the word to be replaced: ";
        cin >> oldWord;
        cout << "\nEnter the new word: ";
        cin >> newWord;
        cin.ignore();

        if(file.is_open() && tempFile.is_open()) {
            while(getline(file, line)) {
                size_t pos;    //size_t => unsigned int
                while((pos = line.find(oldWord)) != string::npos) {
                    line.replace(pos, oldWord.length(), newWord);
                    replaced = true;
                }
                tempFile << line << endl;
            }

            file.close();
            tempFile.close();

            if(replaced) {
                remove((fileName + ".txt").c_str());
                rename("temp.txt", (fileName + ".txt").c_str());
                cout << "Word \"" << oldWord << "\" replaced with \"" << newWord << "\" successfully." << endl;
            } else {
                system("pause");
                cout << "Word \"" << oldWord << "\" not found in the life" << endl;
            }
        } else {
            cout << "Error opening the file..." << endl;
        }
    }
};

int main() {
    int choice;
    FileHandler fh;

    do {
        cout << "\n1. Write File\n2. Read File\n3. Update File\n4. Find Word\n5. Replace Word\n0. Exit" << endl;
        cout << "Enter your choice: ";
        cin >> choice;
        cin.ignore();

        if(choice == 0) {
            cout << "Exiting the program..." << endl;
            exit(0);
        }

        cout << "Enter fileName: ";
        getline(cin, fh.fileName);

        switch (choice) {
            case 1:
                fh.writeFile();
                break;

            case 2:
                fh.readFile();
                break;

            case 3:
                fh.updateFile();
                break;

            case 4:
                fh.findWord();
                break;

            case 5:
                fh.replaceWord();
                break;
            
            default:
                cout << "Invalid choice! Please try again...";
                break;
        }
    } while (choice != 0);

    return 0;
}
