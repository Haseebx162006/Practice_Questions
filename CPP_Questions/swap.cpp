#include <iostream>
using namespace std;
void swap(int &a, int &b){
    int temp=a;
    a=b;
    b=temp;
}
int main(){
    int a=5;
    int b=10;
    cout<<"Before Swaping a="<<a<<" "<<"b="<<b<<endl;
    swap(a,b);
    cout<<"After Swaping a="<<a<<" "<<"b="<<b<<endl;
}