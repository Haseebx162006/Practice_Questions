#include <iostream>
using namespace std;
int factorial(int x){
    int f=1;
    for (int i = 1; i <=x ; i++)
    {
       f*=i;
    }
    return f;
    
}
int combination(int n , int r){
    int a=factorial(n);
    int b=factorial(r);
    int c=factorial(n-r);
    return a/(b*c);
}
int main(){
    int x;
    cout<<"Enter the number of rows:";
    cin>>x;
    for (int i = 0; i < x; i++)
    {
        for (int k = 0; k < x-i;k++)
        {
            cout<<" ";
        }
        
        for (int j = 0; j<=i; j++)
        {
            cout<<combination(i,j)<<" ";
        }
        cout<<endl;
    }
    

}