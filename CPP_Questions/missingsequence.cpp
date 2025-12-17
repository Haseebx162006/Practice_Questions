#include <iostream>
using namespace std;

// Function to generate a spiral matrix
void generateSpiralMatrix(int n, int matrix[][100]) {
    int num = 1; // Starting number
    int top = 0, bottom = n - 1, left = 0, right = n - 1;
                                                                                                                    
    // Loop to fill the matrix in a spiral order
    while (num <= n * n) {
        // Fill the top row from left to right
        for (int i = left; i <= right; i++) matrix[top][i] = num++;
        top++;
        // Fill the right column from top to bottom
        for (int i = top; i <= bottom; i++) matrix[i][right] = num++;
        right--;
        
        // Fill the bottom row from right to left
        for (int i = right; i >= left; i--) matrix[bottom][i] = num++;
        bottom--;
        
        // Fill the left column from bottom to top
        for (int i = bottom; i >= top; i--) matrix[i][left] = num++;
        left++;
    }
}

// Function to print the matrix
void printMatrix(int n, int matrix[][100]) {
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            cout << matrix[i][j] << " "; // Print each element
        }
        cout << endl; // Move to the next line
    }
}

int main() {
    int n;
    cout << "Enter matrix size: ";
    cin >> n;
    
    int matrix[100][100]; // Declare a large enough matrix
    generateSpiralMatrix(n, matrix); // Generate the spiral matrix
    printMatrix(n, matrix); // Print the generated matrix
    
    return 0; // Exit the program
}
