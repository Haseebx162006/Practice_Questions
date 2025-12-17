#include <iostream>
using namespace std;
int main(){
    int x;
    int arr[x][x];
    cout<<"Enter the size:";
    cin>>x;
    int num1=0;
    int num2=1;
int num3;
    for (int i = 0; i <x; i++)
    {
        for (int j = 0; j <x; j++)
        {
            cout<<(num3=num2+num1)<<" ";
            num1=num2;
            num2=num3;
        }
        cout<<endl;
    }
    
}