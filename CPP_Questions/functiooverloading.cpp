#include <iostream>
using namespace std;
int area(int a, int b){
return a*b;
}
int area(int a , int b , int c){
    return a*b*c;
}
double area(float a, float b , float c){
    return 4*a*b*c;
}

int main(){
    cout<<area(5,5,5)<<endl;
    cout<<area(5,5.3,5.5)<<endl;
} 

