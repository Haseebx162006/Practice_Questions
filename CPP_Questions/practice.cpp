#include <iostream>
using namespace std;
struct book
{
    string name;
    int price;
};
struct plane
{
    string name;
    float price;
};
plane update_n(){
    plane h;
    h.name="Jf 17";
    h.price=121212;
    return h;
}
book update(){
    book b;
    b.name="Haseeb's book";
    b.price=1234;
    return b;
}
typedef struct data
{
    string name;
    int roll;
    string phone;
}ep;
 ep s1,s2;
 void print(struct data &h1){
    h1.name="ali";
    cout<<h1.name<<endl;
 cout<<h1.roll<<endl;
 cout<<h1.phone<<endl;
 }
 void print(struct book &h1){
    h1.name="ali";
    cout<<h1.name<<endl;
 cout<<h1.price<<endl;
// cout<<h1.phone<<endl;
 }
 
 int main(){
 s1={"Haseeb ahmad",56,"23233"};
 print(s1);
 cout<<s1.name;
 cout<<endl;
 book y;
 y=update();
 print(y);
 plane hy;
 hy=update_n();
 
  
    
}