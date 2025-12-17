#include <iostream>
using namespace std;
bool prime(int x){
    for (int i = 2; i <=x/2; i++)
    {
        if (x%i==0)
        {
          return false;
        }
    }
    return true;
    
}
int main(){
    int max=0;
    int x;
    cout<<"Enter the number:";
    cin>>x;
    for (int i = 2; i <=x; i++)
    {
        if (x%i==0)
        {
           if (prime(i))
           {
           if (i>max)
           {
           max=i;
           }
           }
        }
    }
    cout<<"The largest prime factor is:"<<max;
}