#include <iostream>
using namespace std;
int roomSize[100];
bool isbooked[100]={false};
void bookroom();
string name[100];
int main(){
    bookroom();
}
void bookroom(){
    int number;
    cout<<"Please enter the roomnumber:";
    cin>>number;
    if (number<0 || number>10)
    {
        cout<<"Please enter the valid room number!"<<endl;
        return ;
    }
    if (isbooked[number])
    {
        cout<<"Please enter your name:";
        getline(cin,name[number]);
        cout<<"The room "<<number<<" is booked by "<<name[number]<<endl;
    }
    else{
        cout<<"The room is already booked by"<<name[number]<<endl;
    }
    
}