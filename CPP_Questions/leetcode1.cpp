// Input: nums = [2, 7, 11, 15], target = 9  
// Output: [0, 1]  
// // Because nums[0] + nums[1] == 9
#include <iostream>
using namespace std;
void target(int arr[], int size, int tar){
    for (int i = 0; i < size; i++)
    {
        for (int j = 0; j < size; j++)
        {
           if (arr[i]+arr[j]==tar)
           {
            cout<<"["<<i<<","<<j<<"]"<<endl;
           }
        }
    }
    
}
int main(){
    int n,  tar;
    cout<<"Enter the size of array:";
    cin>>n;
    int arr[5];
    cout<<"Enter the elements of array:";
    for (int i = 0; i < n; i++)
    {
        cin>>arr[i];
    }
    cout<<"Please enter the Target sum:";
    cin>>tar;
    target(arr,n,tar);
}