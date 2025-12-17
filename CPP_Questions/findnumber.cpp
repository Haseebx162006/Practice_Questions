#include <iostream>
using namespace std;
void miss(int arr[], int size , int maximum){
    bool found[size+1]={false};
    for (int i = 0; i <size; i++)
    {
        found[arr[i]]=true;
    }
    for (int i = 1; i < maximum; i++)
    {
        if (!found[i])
        {
            cout<<i<<" ";
        }
    }   
}
int main(){
    int arr[5]={1,4,5,6};
    miss(arr,5,6);
}