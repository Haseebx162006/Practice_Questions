#include <iostream>
using namespace std;
void reverse(string h){
    int start=0;
    int end=h.length()-1;
    while (end>start)
    {
        char temp=h[start];
        h[start]=h[end];
        h[end]=temp;
        start++;
        end--;
    }
    cout<<h;
}
int main(){
    string x;
    cout<<"Enter the string:";
    getline(cin,x);
    reverse(x);
}