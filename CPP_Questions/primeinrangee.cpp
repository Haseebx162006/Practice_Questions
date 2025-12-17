#include<iostream>
using namespace std;
bool prime(int x){
    bool found=false;
    if (x<2)
    {
        cout<<"Please enter a number greater than 1";
        return 0;
    }
    for (int i = 2; i <x/2; i++)
    {
        if (x%i==0)
        {
            found=true;
            break;
        }
    }
    if (!found)
    {
        return true;
    }
    else {
        return false;
    }
    
}
int main() {
    int start;
    cout<<"Please enter the starting range:";
    cin>>start;
    int end;
    cout<<"Please enter the ending range:";
    cin>>end;
    for (int i = start; i < end; i++)
    {
       if (prime(i))
       {
        cout<<i<<" ";
       }
       
    }
    
}
