#include <iostream>
using namespace std;
int main(){
    int x;
    cout<<"Enter the starting range:";
    cin>>x;
    int y;
    cout<<"Enter the ending range:";
    cin>>y;
    int o=1;
    for (int i = x; i <=y; i++)
    {
        for (int i = x; i <=x*10; i=x+i)
        {
            cout<<x<<"*"<<o<<"="<<i<<endl;
            o++;
        }
        cout<<endl;
         x++;
         o=1;
    }
    
}