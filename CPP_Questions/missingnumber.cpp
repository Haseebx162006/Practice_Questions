#include <iostream>
using namespace std;                  
void miss(int arr[], int size , int n){
    bool found[size+1]={false};
    for (int i = 0; i < size; i++)
    {
        found[arr[i]]=true;
    }
    for (int i = 1; i <=n; i++)
    {
       if (!found[i])
       {
        cout<<"The missing value is:"<<i<<endl;
       }
    }
}
int main(){
    int arr[5]={1,2,5,6};
    miss(arr,5,6);
}