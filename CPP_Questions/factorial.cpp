#include <iostream>
using namespace std;
int main(){
    int x;
    cout<<"Enter the number:";
    cin>>x;
    unsigned long long f=1;
    if (x==0)
    {
        cout<<"1";
    }
    else if (x<0)
    {
        cout<<"Factorial cannot be negative!";
        return 0;
    }
    else if (x>0)
    {
        for (int i = 1; i <=x; i++)
        {
            f*=i;
        }
    }
    cout<<"The factorial of the number is:"<<f;
}