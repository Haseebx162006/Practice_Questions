#include <iostream>
using namespace std;
int main(){
    string hy;
    cout<<"Enter the string";
    cin>>hy;
    int count=0;// used for counting the {
    int right_count=0;//used for}
    int sount=0;// used for counting the (
    int right_sount=0;//used for count the )
    for (int i = 0; i < hy.length(); i++)
    {
     if (hy[i]=='{')
     {
        count++;
     }
     if (hy[i]=='}')
     {
       right_count++;
     }
        if (hy[i]=='(')
        {
           sount++;
        }
        if (hy[i]==')')
        {
            right_sount++;
        }
    }

    if ((count==right_count)&&(sount==right_sount))
    {
        cout<<"It is balanced";
    }
    else{
        cout<<"It is not balanced";
    }
    
}