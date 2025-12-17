#include <iostream>
using namespace std;
void convo(string &str){
    int vowel=0;
    int consonent=0;
    for (int i = 0; i <str.length(); i++)
    {
        if (str[i]=='a'|| str[i]=='e'|| str[i]=='i'|| str[i]=='o'|| str[i]=='u')
        {
            vowel++;
        }
        else if (str[i]==' ')
        {
            vowel+=0;
            consonent+=0;
        }
        else{
            consonent++;
        }
    }
    cout<<"The total vowels in the word is:"<<vowel<<endl;
    cout<<"The total consonent in the word is:"<<consonent;
}
int main(){
    string h;
    cout<<"Enter the string:";
    cin>>h;
    convo(h);

}