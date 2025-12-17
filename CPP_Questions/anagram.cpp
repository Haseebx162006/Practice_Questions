#include <iostream>
#include <string>
using namespace std;
string sort(string arr){
     for (int i = 0; i <arr.length()-1; i++)
    {
        for (int j = 0; j <arr.length()-1; j++)
        {
            if (arr[j]>arr[j+1])
            {
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
            }
    }
    return arr;
}
bool ana(string arr,string ary){
    if (arr.length()!=ary.length()){
        system("Exit");
    }
    string h1=sort(arr);
    string h2=sort(ary);
    return h1==h2;
}
int main(){
    string h1="123456";
    string h2="123465";
    if (ana(h1,h2))
    {
        cout<<"They are anagram of each other.";
    }
    else{
        cout<<"They are not";
    }
    

}