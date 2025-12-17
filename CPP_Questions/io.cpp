#include <iostream>
using namespace std;
int main(){
    int n;
    cout<<"enter the size of the array:";
    cin>>n;
    int artt[n];
    int max=0;
    int min=
    INT_MAX;
    int arr[2][2]={{1,2},{3,4}};
    for (int i = 0; i < 2; i++)
    {
        for (int j = 0; j < 2; j++)
        {
            if (arr[i][j]>max)
            {
                max=arr[i][j];
            }
            if (arr[i][j]<min)
            {
                min=arr[i][j];
            }
            
        }
        
    }
    cout<<max<<" "<<min<<" ";
    char name[8] = "Shelly";
    cout<<name<<" ";
}