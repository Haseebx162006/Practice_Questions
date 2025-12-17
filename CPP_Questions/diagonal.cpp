#include <iostream>
using namespace std;
int main(){
    int arr[3][3]={{1,2,3},{4,5,6},{7,8,9}};
     int temp=arr[0][0];
            arr[0][0]=arr[2][2];
            arr[2][2]=temp;
    for (int i = 0; i < 3; i++)
    {
        for (int j = 0; j < 3; j++)
        {
            cout<<arr[i][j]<<" ";
        }
       cout<<endl; 
    }
    
}