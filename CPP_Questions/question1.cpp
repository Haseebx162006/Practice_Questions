#include <iostream>
using namespace std;
int main(){
    int a;
    cout<<"Please Enter the value of a:";
    cin>>a;
    int b;
    cout<<"Please Enter the value of b:";
    cin>>b;
    cout<<"The value of a before swap:"+a;
    cout<<"The value of b before swap:"+b;
    a=a+b-a;
    b=a+b-b;
     cout<<"The value of a after swap:"+a;
    cout<<"The value of b after swap:"+b;
}