#include <iostream>
using namespace std;
int main(){
    char choice;
    cout<<"Do you want to check for the prime number(y/n):";
    cin>>choice;
    if (choice=='n' || choice=='N')
    {
        cout<<"The program has ended";
       return 0;
    }
    while (choice=='y'||choice=='Y')
    {
    int x;
    cout<<"Enter the value of x:";
    cin>>x;
    if (x<2)
    {
        cout<<"Invalid attempt. Enter a number Greater than 1 to check for Prime number.";
        return 0;
    }
    
    bool y=true;
    for (int i = 2; i <=x/2; i++)
    {
       if (x%i==0)
       {
      y=false;
      break;
       }
    }
    if (y==false)
    {
        cout<<"It is not a prime number"<<endl;
    }
    else{
        cout<<"It is a prime number"<<endl;
        cout<<"The program ended!"<<endl;
        break;  
    }
    }
    

}