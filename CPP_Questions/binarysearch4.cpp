#include<iostream>
using namespace std;
void binary(int arr[], int size){
    int start=0;
    int end=size-1;
    bool found=false;
    int position=-1;
    int x;
    cout<<"Enter the number you want to search:";
    cin>>x;
    while (end>=start)
    {
        int mid=(start+end)/2;
        if (arr[mid]==x)
        {
            found=true;
            position=mid;
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
    if (found){
        cout<<"The number is found at "<<position<<" ";}
        else{
            cout<<"The number is not found in the list";
        }
}
int main() {
    int arr[5]={1,2,3,4,5};
    binary(arr,5);
}