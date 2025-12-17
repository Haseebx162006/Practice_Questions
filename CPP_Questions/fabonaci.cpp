#include<iostream>
using namespace std;
int main() {
    int x;
    cout<<"Enter the number";
    cin>>x;
    int num1=0;
    int num2=1;
    cout<<num1<<" "<<num2<<" ";
    for (int i = 0; i < x-2; i++)
    {
        int num3=num1+num2;
        cout<<num3<<" ";
        num1=num2;
        num2=num3;
    }

}
