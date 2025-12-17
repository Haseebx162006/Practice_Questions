#include<iostream>
using namespace std;
int main() {
    int rows;
    cout<<"Enter the number of rows:";
    cin>>rows;
    int col;
    cout<<"Enter the number of columns:";
    cin>>col;
    int num=1;
    int** p= new int*[rows];
    for (int i = 0; i < rows; i++)
    {
        p[i]= new int[col];
    }
    for (int i = 0; i < rows; i++)
    {
        for (int j = 0; j < col; j++)
        {
            p[i][j]=num;
            num++;
            if (num==10)
            {
                num=0;
            }
            
        }
        cout<<endl;
    }
    for (int i = 0; i < rows; i++)
    {
        for (int j = 0; j < col; j++)
        {
           cout<<p[i][j]<<"  ";
        }
        cout<<endl;
    }
    for (int i = 0; i < rows; i++)
    {
        delete p[i];
    }
    delete [] p;
}