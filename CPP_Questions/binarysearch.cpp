#include<iostream>
using namespace std;
int main() {
    int arr[]={1,2,3,4,5,6};
    int x;
    cout<<"Enter the number to search:";
    cin>>x;
    int start=0;
    int size=6;
    int end=size-1;
    bool found=false;
    int position=0;
    while (end>=start)
    {
        int mid=(start+end)/2;
        if (arr[mid]==x)
        {
            found=true;
            position=mid;
            break;
        }
        else if (arr[mid]<x)
        {
            start=mid+1;
        }
        else{
            end=mid-1;
        }
    }
    if (found)
    {
        cout<<"found"<<endl;
    }
    else{
        cout<<"not found"<<endl;
    }
}