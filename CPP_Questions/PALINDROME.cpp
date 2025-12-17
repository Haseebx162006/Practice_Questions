#include <iostream>
using namespace std;
void palin(string x){
    int start=0;
    int end=x.length()-1;
    bool yes=true;
    while (end>start)
    {
       if (x[start]!=x[end])
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
        cout<<"it is not a palindrome";
    }
    
    
}
int main(){
    string h1="1234321";
    palin(h1);

}