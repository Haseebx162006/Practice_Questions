#include <iostream>
using namespace std;
int stringtosum(string str){
    int num=0,sum=0;
    for(char ch:str){
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
    string str;
    cout<<"Enter the string:";
    getline(cin,str);
    cout<<"The sum of the numbers in the string is:"<<stringtosum(str);
}