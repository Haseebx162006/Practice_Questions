#include <iostream>
using namespace std;
 struct nameType 
{ 
    string first; 
    string last; 
}; 
struct courseType 
{ 
    string name; 
    int callNum; 
    int credits; 
    char grade;
}; 
struct studentType
 {
 nameType name;
 double gpa;
 courseType course;
 };
studentType student;
 studentType classList[100];
 courseType course;
 nameType name;

 void new_change(){
    classList->course.callNum=8340;
    classList->course.name="haseeb";
 }
 void n_assign(studentType &s1){
    s1.course.callNum=classList[0].course.callNum;
    s1.course.name=classList[0].course.name;
 }
struct oldhouse
{
    string h;
    string l;
    string w;
    int b;
};
struct nhouse{
    string nh;
    string nl;
    string wl;
    int a;
};
struct house
{
  nhouse new_house;
  oldhouse old_house;
};
house assign(){
    house h1;
    h1.new_house.nh="12";
    h1.new_house.nl="11";
    h1.new_house.wl="12";
    h1.old_house.h="111";
    h1.old_house.l="12";
    h1.old_house.w="45";
    h1.new_house.a=23;
    h1.old_house.b=12;
    return h1;
}
void print(house &h1){
    cout<<"The value is:"<<h1.new_house.nh<<endl;
    cout<<"The value is:"<<h1.new_house.nl<<endl;
    cout<<"The value is:"<<h1.new_house.wl<<endl;
    cout<<"The value is:"<<h1.old_house.h<<endl;
    cout<<"The value is:"<<h1.old_house.l<<endl;
    cout<<"The value is:"<<h1.old_house.w<<endl;

}
void update(house *c){
;    c->new_house.wl="haseeb";
}
void compare(house *c){
    cout<<"The difference between the width is:"<<c->new_house.a-c->old_house.b<<endl;
    if (c->new_house.a<c->old_house.b)
    {
        cout<<"The value is greater"<<endl;
    }else{
        cout<<"bhag jaa"<<endl;
    }
    
}
int main(){
    // house n_o_house;
    // house *ptr=&n_o_house;
    // n_o_house=assign();
    // update(ptr);
    // print(n_o_house);
    // compare(ptr);
    // print(n_o_house);
    new_change();
    n_assign(student);
    cout<<student.course.name;

}