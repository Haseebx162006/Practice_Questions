#include <iostream>
using namespace std;
void reverse(string &str){
    int start=0;
    int end=str.length()-1;
    while (end>start)
    {
        char* p= &str[start];
        char* q=&str[end];
        char temp =*p;
        *p=*q;
        *q=temp;
        start++;
        end--;
    }
    
}
int main(){
    string name;
    cout<<"Please enter the name to be reversed:";
    getline(cin,name);
    reverse(name);
    cout<<"Name is:"<<name<<endl;
}