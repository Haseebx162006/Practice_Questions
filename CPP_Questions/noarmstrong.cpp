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
bool arms(int x){
    int original_x=x;
    int y=terms(x);
    int sum=0;
    while (x!=0)
    {
       int ld=x%10;
       sum+=pow(ld,y);
       x=x/10;
    }
    return sum==original_x;
}
int main(){
    int x;
    cout<<"Enter the starting range:";
    cin>>x;
    int y;
    cout<<"Enter the ending range:";
    cin>>y;
    int num=0;
    int count=0;
    for (int i = x; i <=y; i++)
    {
        if (arms(i))
        {
        cout<<i<<" ";
        }
}
}