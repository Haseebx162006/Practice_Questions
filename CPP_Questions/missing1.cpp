#include <iostream>
using namespace std;
void miss(int arr[], int size,int start, int n){
    bool found[size+1]={false};
    for (int i = 0; i < size; i++)
    {
        found[arr[i]]=true;
    }
    for (int i =start; i <=n; i++)
    {
        if (!found[i])
        {
            cout<<i<<" ";
        }
        
    }
    
    
}
int main(){
    int n;
    cout<<"Enter the size of array:";
    cin>>n;
    int arr[n];
    int x;
    cout<<"Enter the starting value of series";
    cin>>x;
    int y;
    cout<<"Enter the ending value of series:";
    cin>>y;
    cout<<"Enter the series:";
    for (int i = 0; i < n; i++)
    {
        cin>>arr[i];
    }
    cout<<"The missing values are:";
    miss(arr,n,x,y);

}