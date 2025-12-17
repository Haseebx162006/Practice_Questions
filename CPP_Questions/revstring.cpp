#include <iostream>
using namespace std;
void rev(string &str){
    int start=0;
    int end=str.length()-1;
    while (end>start)
    {
        int temp=str[start];
        str[start]=str[end];
        str[end]=temp;
        start++;
        end--;
    }
}
void palin(string &arr){
    int start=0;
    int end=arr.length()-1;
    bool palin = true;
    while (end>start)
    {
        if (arr[start]!=arr[end])
        {
        palin=false;
        break;
        }
        start++;
        end--;
    }
    if (palin)
    {
        cout<<"It is a palindrome";
    }
    else{
        cout<<"It is not a palindrome";
    }
    
    
}
int main(){
    string str="haseeb";
    rev(str);
    cout<<str<<" ";
    string h="1234321";
    palin(h);
}