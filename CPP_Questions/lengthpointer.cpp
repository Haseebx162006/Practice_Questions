#include <iostream>
using namespace  std;
void length_of_string(string s){
    int start=0;
    int end=s.length()-1;
    int count=0;
    char* g= &s[0];
    while (*g!='\0')
    {
        count++;
        g++;
    } 
    cout<<"The length of the string is:"<<count;
}
int main()
{
 length_of_string("haseeb ahmad");   
} 
