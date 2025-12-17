#include <iostream>
using namespace std;
void prime(int x){
    bool prim=true;
    if (x<=1)
    {
        cout<<"It is a neither a composite number nor prime number.";
       return;
    }    
    for (int i = 2; i <=x/2; i++)
    {
        if (x%i==0)
        {
           prim=false;
        }
        
    }
    if (prim==true)
    {
      cout<<"It is a prime number";
    }
    else{
        cout<<"It is a composite number";
    }
    
}
int main(){
    int n;
    cout<<"Enter the number:";
    cin>>n;
    prime(n);

}