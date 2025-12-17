#include <iostream>
using namespace std;

void removeDuplicates(int arr[], int size) {
    int unique[100];
    int count = 0;

    for (int i = 0; i < size; i++) {
        bool alreadyExists = false;
        for (int j = 0; j < size-1; j++) { 
            if (arr[i] == unique[j] && i!=j) {
                alreadyExists = true;
                break;
            }
        }
        if (!alreadyExists) {
            unique[count] = arr[i];
            count++;
        }
    }

    for (int i = 0; i < count; i++) {
        cout << unique[i] << " ";
    }
}

int main() {
    int arr[] = {1, 2, 2, 3, 3, 4,5,5};
    removeDuplicates(arr, 8);
    return 0;
}
