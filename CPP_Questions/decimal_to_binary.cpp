#include <iostream>
#include <cmath>
using namespace std;
int countdigit(int x){
    int count =0;
    while (x!=0)
    {
        x=x/10;
        count++;
    }
    return count;
    
}
int binary(int x){
    int result=0;
    while (x!=0)
    {
        int rem=x%2;
        result*=10;
        result+=rem;
        x=x/2;
    }
    int rev=0;
    while (result!=0)
    {
        int ld= result%10;
        rev*=10;
        rev+=ld;
        result/=10;
    }
    return rev;
}
int decimal(int x){
    int size=countdigit(x);
    int result=0;
    int reverse=0;
    while (x!=0)
    {
        int ld=x%10;
        reverse*=10;
        reverse+=ld;
        x=x/10;
    }
    while (reverse!=0)
    {
        int ld=reverse%10;
        result+=ld*pow(2,size-1);
        size--;
        reverse=reverse/10;
    }
    return result;
}
int main(){
    cout<<binary(200)<<" ";
    //cout<<decimal(1011);
    cout<<decimal(11011);
}