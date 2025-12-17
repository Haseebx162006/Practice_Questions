#include <iostream>
#include <cmath>
using namespace std;
int terms(int x){
    int no=0;
    while (x!=0)
    {
        x=x/10;
        no++;
    }
    return no;
    
}
int main(){
    int x;
    cout<<"Enter te value of x:";
    cin>>x;
    int original_x=x;
    int sum=0;
    int y=terms(x);
    while (x!=0)
    {
       int ld=x%10;
       sum+=pow(ld,y);
       x=x/10;
    }
    if (sum==original_x)
    {
        cout<<"It is an armstrong number.";
    }
    else{
        cout<<"It is not an armstrong number";
    }
    
    

}