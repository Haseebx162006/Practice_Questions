#include <iostream>
using namespace std;
int main(){
    int x;
    cout<<"enter the starting range:";
    cin>>x;
    int y;
    cout<<"Enter the ending range:";
    cin>>y;
    int o=1;
    cout<<"Table of "<<x<<endl;
    for (int i = x; i <=y; i++)
    {
        for (int i = x; i <=x*10; i+=x)
        {
            cout<<x<<"*"<<o<<"="<<i<<endl;
            o++;
        }
        cout<<endl;
        x++;
        if (x>y)
        {
            break;
        }
        
        cout<<"Table of "<<x<<endl;
        o=1;
    }
    
}