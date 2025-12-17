#include <iostream>
using namespace std;
void maxmin(int arr[],int size){
    int max=INT_MAX;
    int min=INT_MIN;
    for (int i = 0; i < size; i++)
    {
        if (arr[i]>min)
        {
            min=arr[i];
        }
    }
    for (int i = 0; i <size; i++)
    {
       if (arr[i]<max)
       {
        max=arr[i];
       }
       
    }
    cout<<"The largest element in the array is:"<<min<<endl;
    cout<<"The smallest element in the array is:"<<max<<endl;
}
int main(){
    int arr[5]={1,-2,3,99,5};
    maxmin(arr,5);
}
