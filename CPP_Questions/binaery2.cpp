#include <iostream>
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
void left(int arr[],int size,int rotate){
    int ary[100];
    int start=0;
    int end=size-1;
    for (int i = 0; i < rotate; i++)
    {
    
        for (int i = 0; i < size-1; i++)
        {
            ary[i]=arr[i+1];
            ary[end]=arr[start];
        }
        end++;
        start++;
}
    for ( int i = 0; i < size; i++)
    {
        cout<<ary[i]<<" ";
    }
    
}
void binary(int arr[], int size){
    int x;
    cout<<"Enter the element you want to search:";
    cin>>x;
    int start=0;
    int end=size-1;
    bool found=false;
    int position=-1;
    while (end>=start)
    {
        int mid=(start+end)/2;
        if (arr[mid]==x)
        {
            position=mid;
            found=true;
            break;
        }
        else if (arr[mid]>x)
        {
            end=mid-1;
        }
        else{
            start=mid+1;
        }
    }
    if (found)
    {
        cout<<"The number is found at the position:"<<position<<" ";
    }
    else{
        cout<<"The number is not in the list"<<" ";
    }
    
}
int main(){
    int arr[]={3,2,1,4,5,6};
    sort(arr,6);
    left(arr,6,3);
}