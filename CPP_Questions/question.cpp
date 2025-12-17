#include <iostream>
using namespace std;
int main(){
    string h="haseeb good";
    int count=0;
    for (int i = h.length()-1; i>0 ; i--)
    {
        if (h[i]==' ')
        {
            break;
        }
        count++;
    }
    cout<<count;

}