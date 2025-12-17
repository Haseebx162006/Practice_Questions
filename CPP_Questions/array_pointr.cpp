#include <iostream>
using namespace std;
int main(){
    int x;
    cout<<"Enter the size of the array:";
    cin>>x;
    int** p= new int*[x];
    for (int i = 0; i < x; i++)
    {
        p[i]=new int;
        *p[i]=i;
    }
    for (int i = 0; i < x; i++)
    {
        cout<<*p[i]<<" "; 
    }
    for (int i = 0; i < x; i++)
    {
        delete p[i];
    }
    delete[] p;
}