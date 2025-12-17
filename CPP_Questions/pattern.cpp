#include <iostream>
using namespace std;
int main(){
    int x;
    cout<<"Enter the value:";
    cin>>x;
    int a=1;
    for (int i = 0; i < x; i++)
    {
        for (int k = 0; k <x-i; k++)
        {
           cout<<"  ";
        }
        
        for (int j = 0; j < i; j++)
        {
            cout<<a<<" ";
            a++;
        }
        cout<<endl;
    }
    
}
