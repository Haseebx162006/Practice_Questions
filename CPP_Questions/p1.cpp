#include <iostream>
#include <fstream>
using namespace std;
fstream file, file1;
string id[100];
void read();
int main(){
    read();
}
void read(){
    file.open("data.txt",ios::in);
   cout<<"hello world";
   for (int i = 0; i < 3; i++)
   {
    cout<<"Hello world"<<endl;
   }
   
    
}