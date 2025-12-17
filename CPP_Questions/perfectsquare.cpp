#include <iostream>
#include <cmath>
using namespace std;
int main(){
    int x;
    int y=x;
    int original_x=x;
    cout<<"Enter the number:";
    cin>>x;
    if (sqrt(x)*sqrt(y)==original_x)
    {
     cout<<"It is a perfect square";
    }
    else{
        cout<<"It is not";
    }
    
}