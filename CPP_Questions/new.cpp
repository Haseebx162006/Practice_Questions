#include <iostream>
using namespace std;
struct arrai
{
    string name[100];
    int price[100];
};
arrai assign(){
    arrai h2;
    h2.name[0]="hsaeeb";
    h2.price[0]=1222;
    return h2;
}
void print(arrai &hy){
    cout<<hy.name[0];
    cout<<hy.price[0];
}
// struct hy
// {
//     string name;
//     int price;
// };
// hy update(){
//     hy h;
//     h.name="ali";
//     h.price=1234;
//     return h;
// }
// void print(hy s){
//     cout<<"name is:"<<s.name;
// }
// void update_name(hy &s){
//     s.name="haseeb";
// }
int main(){
//     hy haseeb, h1,h2;
//     haseeb=update();
//   //  print(haseeb);
//     h1=update();
//     print(h1);
//     update_name(h1);
//     cout<<endl;
//     print(h1);
//     cout<<endl;
//     h2=update();
//     update_name(h2);
//     print(h2);
    arrai employee;
    employee=assign();
    print(employee);


}