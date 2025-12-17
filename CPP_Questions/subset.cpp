// //inding All Subsets of a Set
// Difficulty: Medium
// Topics: Combinatorics
// Description: Write a program to generate all possible subsets of a given set of numbers.
// Example:
// Input: set = [1, 2]
// Output: [[], [1], [2], [1, 2]]
// Explanation: The subsets of [1, 2] are the empty set, [1], [2], and [1, 2].
#include <iostream>
using namespace std;
void subset(int arr[], int size){
    for (int i = 0; i < size; i++)
    {
        for (int j=0 ; j <size ; j++)
        {
            cout<<arr[j];
        }
        
    }
    
}
int main(){
    int arr[2]={1,2};
    subset(arr,2);
}