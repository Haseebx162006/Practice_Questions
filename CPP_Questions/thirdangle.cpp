#include <iostream>
using namespace std;
int stringtointeger(string str){
    long int num=0; long int sum=0;
    for(char ch: str){
        if (isdigit(ch))
        {
           num=num*10+(ch-'0');
        }
        else{
            sum+=num;
            num=0;
        }
    }
    sum+=num;
        return sum;
}
int main(){
    string sh="add 2 and 2";
    cout<<stringtointeger(sh);
}