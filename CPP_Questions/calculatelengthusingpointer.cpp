#include <iostream>
using namespace std;
void cal_length(string &str){
    int start=0;
    char* p= &str[start];
    int count=0;
    while (*p!='\0')
    {
        count++;
        p++;
    }
    cout<<"The length of the string is:"<<count;
    
}
int main(){
    string enter;
    cout<<"Enter the string:";
    getline(cin,enter);
    cal_length(enter);
}