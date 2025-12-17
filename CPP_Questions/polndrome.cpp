#include <iostream>
using namespace std;
void palin(string str){
    bool yes=true;
    int start=0; int end= str.length()-1;
    while (end>start)
    {
        if (str[start]!=str[end])
        {
        yes=false;
        break;
        }
        start++;
        end--;
    }
    if (yes==true)
    {
        cout<<"it is a palindrome";
    }
    else{
        cout<<"No it is not a palindrome";
    }
    
    
}
int main(){
    string h1="1234321";
    palin(h1);
}