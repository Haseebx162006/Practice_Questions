#include <iostream>
#include <cmath>
using namespace std;
void mode(int arr[], int size){
    for (int i = 0; i < size; i++)
    {
        for (int j = 0; j < size; j++)
        {
            if (i!=j && arr[i]==arr[j])
            {
                cout<<arr[i]<<" ";
            }
            
        }
        
    }
    
}
int main(){
    
    int arr[6]={1,1,2,3,3,4};
    mode(arr,6);
}