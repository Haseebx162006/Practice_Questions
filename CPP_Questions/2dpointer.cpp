#include <iostream>
using namespace std;
int main(){
    int num=1;
    int** p= new int*[3];
    for (int i = 0; i < 3; i++)
    {
        p[i]= new int[3];
    }
    for (int i = 0; i < 3; i++)
    {
        for (int j = 0; j< 3; j++)
        {
            p[i][j]=num;
            num++;
        } 
    }
    for (int i = 0; i < 3; i++)
    {
        for (int j = 0; j< 3; j++)
        {
            cout<<p[i][j]<<" ";
        }
        cout<<endl;
    }
    for (int i = 0; i < 3; i++) {
        delete[] p[i]; 
    }
    delete[] p;
     
}