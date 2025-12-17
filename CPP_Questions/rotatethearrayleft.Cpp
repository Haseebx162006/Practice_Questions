#include <iostream>
using namespace std;
void left(int arr[], int size, int k){
    int ary[100];
    int start=0;
    int end=size-1;
    int first;
    for (int j = 0; j < k; j++)
    {
        for (int i = 0; i < size-1 ; i++)
        {
            ary[i]=arr[i+1];
        }
        ary[end]=arr[start];
        for (int i = 0; i < size; i++)
        {
            arr[i] =ary[i];
        }
        
    }
    
    for (int i = 0; i < size; i++)
    {
        cout<<arr[i]<<" ";
    }
    
}
int main(){
    int arr[]={1,2,3,4,5};
    int k;
    cout<<"Enter the rotations to the left:";
    cin>>k;
    left(arr,5,k);
}