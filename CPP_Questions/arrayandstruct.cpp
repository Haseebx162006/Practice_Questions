#include <iostream>
using namespace std;
struct employee{
    string firstname;
    string lastname;
    double pay;
};
employee assign(){ 
    employee h2;
    h2.firstname="haseeb";
    h2.lastname="ali";
    return h2;
}
void print(employee e[]){
    for (int i = 0; i < 10; i++)
    {
        cout<<"name is:"<<e[i].firstname<<endl;
        cout<<"last name is:"<<e[i].lastname<<endl;

    }
    
}
employee e[100];
int main(){
    for (int i = 0; i < 10; i++)
    {
        e[i]=assign();
    }
    print(e);
}