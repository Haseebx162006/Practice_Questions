#include <iostream>
using namespace std;
int main(){
    int x;
    cout<<"Enter the number:";
    cin>>x;
    int y;
    cout<<"Enter the number you want to find:";
    cin>>y;
    int r=0;
    int count=0;
    while (x!=0)
    {
        int ld=x%10;
        if (ld==y)
        {
            r=r*10;
            r+=ld;
        }
        x=x/10;
    }
    while (r!=0)
    {
        r=r/10;
        count++;
    }
    cout<<"The number of times the digit appear is:"<<count;

    
    
}