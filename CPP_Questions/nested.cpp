#include <iostream>
using namespace std;
struct address{
    string city;
    string address_1;
};
struct employee
{
    string name;
    address add;
};
employee assign(){
    employee h2;
    h2.name="haseeb";
    h2.add.address_1="furniturr";
    h2.add.city="kasur";
    return h2;
}
void print(employee &s2){
    cout<<"name is:"<<s2.name<<endl;
    cout<<"name is:"<<s2.add.address_1<<endl;
    cout<<"name is:"<<s2.add.city<<endl;
}
void new_update(employee *b2){
    b2->add.address_1="alhamra";
    b2->name="Musfirah";
}
int main(){
    employee h1;
    // h1.add.city="kasur";
    // h1.add.address_1="furniture market";
    h1=assign();
    employee *h=&h1;
    new_update(h);
    print(h1);

}