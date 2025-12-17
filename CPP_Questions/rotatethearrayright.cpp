#include <iostream>
using namespace std;
void right(int arr[], int size, int k){
    int z[1000];
    int start=0;
    int end=size-1;
    for (int i = 0; i < k; i++)
    {
        int last= arr[end];
        for (int i = 0; i < size-1; i++)
        {
            z[i+1]=arr[i];
        }
        z[start]=arr[end];
        for (int i = 0; i < size; i++)
        {
            arr[i]=z[i];
        }
        
    }
    
    for (int i = 0; i < size; i++)
    {
        cout<<arr[i]<<" ";
    }
}
int main(){
    int k;
    cout<<"Enter the number of rotations of k to right:";
    cin>>k;
    int arr[]={1,2,3,4,5};
    right(arr,5,k);
}