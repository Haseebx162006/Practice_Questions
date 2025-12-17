#include<iostream>
using namespace std;
void sort(int arr[], int count){
    for (int i = 0; i < count-1; i++)
    {
        for (int j = 0; j < count-1 ; j++)
        {
          if (arr[j]>arr[j+1])
          {
            int temp=arr[j];
            arr[j]=arr[j+1];
            arr[j+1]=temp;
          }
          
        }
        
    }
}
void sorttwo(int arr[], int ary[], int size , int size1){
    sort(arr,size);
    sort(ary,size1);
}
int main() {
    int arr[100]={6,5,3,4,2,1};
    int arr2[100]={7,8,9,10,11,12};
    int count=6;
    sorttwo(arr,arr2,6,6);
    for (int i = 0; i <6; i++)
    {
        arr[count]=arr2[i];
        count++;
    }
    for (int i = 0; i < 12; i++)
    {
        cout<<arr[i]<<" ";
    }
    
    
}