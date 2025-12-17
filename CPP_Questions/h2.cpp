#include <iostream>
#include <iomanip>
using namespace std;

bool available[10][10] = {false}; // 10x10 seats

void draw();
void tick(int row, int column);
void showMenu();

int main() {
    int choice;
    do {
        showMenu();
        cin >> choice;
        switch (choice) {
            case 1:
                draw();
                break;
            case 2: {
                int row, column;
                cout << "Enter the row (1-10): ";
                cin >> row;
                cout << "Enter the column (1-10): ";
                cin >> column;
                tick(row, column);
                break;
            }
            case 5:
                cout << "Thank you for using the system!\n";
                break;
            default:
                cout << "Invalid choice. Try again.\n";
        }
    } while (choice != 5);
}

void showMenu() {
    cout << "\n************** Haseeb's Movie Theater **************" << endl;
    cout << "1. Show Tickets" << endl;
    cout << "2. Book Ticket" << endl;
    cout << "5. Exit" << endl;
    cout << "Enter your choice: ";
}

void draw() {
    cout << "\nSeat Layout (X = Booked):\n";
    for (int i = 0; i < 10; i++) {
        for (int j = 0; j < 10; j++) {
            if (available[i][j]) {
                cout << " X ";
            } else {
                cout << setw(2) << i + 1 << "," << j + 1 << " ";
            }
        }
        cout << endl;
    }
}

void tick(int row, int column) {
    // Convert to 0-based indexing
    row--; column--;

    if (row < 0 || row >= 10 || column < 0 || column >= 10) {
        cout << "Invalid row or column. Must be between 1 and 10.\n";
        return;
    }

    if (available[row][column]) {
        cout << "Seat already booked!\n";
    } else {
        available[row][column] = true;
        cout << "Seat booked successfully!\n";
        int price = 1000;
        cout << "Your total bill is: " << price << " $\n";
    }
}
