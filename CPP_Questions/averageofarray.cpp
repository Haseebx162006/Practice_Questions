#include <iostream>
using namespace std;
int main(){
    int arr[6]={1,2,3,4,5,6};
    float sum=0;
    for (int i = 0; i < 6; i++)
    {
       sum+=arr[i];
    }
    cout<<"The average of the array is:"<<sum/6.0;
    
}