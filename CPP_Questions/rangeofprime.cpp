#include <iostream>
using namespace std;
bool prime(int x){
    for (int i = 2; i <=x/2; i++)
    {
        if (x%i==0)
        {
            return false;
            break;
        }
    }
    return true;
    
}
int main(){
    for (int i = 2; i <=20 ; i++)
    {
        if (prime(i))
        {
            cout<<i<<" ";
        }
        
    }
    
}