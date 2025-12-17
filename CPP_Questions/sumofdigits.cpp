#include <iostream>
using namespace std;
int main(){
    int x;
    cout<<"Enter the number:";
    cin>>x;
    int sum=0;
    while (x!=0)
    {
        int ld=x%10;
        sum+=ld;
        x=x/10;
    }
    cout<<"The sum of the digits of the given number is:"<<sum;
}
