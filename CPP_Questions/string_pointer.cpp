#include <iostream>
using namespace std;
void stringswap(string str){
    int start=0;
    int end=str.length()-1;
    int count=0;
    while (end>start)
    {
        char*p=&str[start];
        char*q=&str[end];
        char temp=*p;
        *p=*q;
        *q=temp;
        start++;
        end--;
        count++;
    }
    cout<<str<<" "<<endl;
}
int main(){
    stringswap("haseeb");
}