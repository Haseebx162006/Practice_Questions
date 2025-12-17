#include <iostream>
#include <climits>
using namespace std;
int main(){
    int max=INT_MIN;
    int min=INT_MAX;
    int arr[]={1,2,3,4,5};
    for (int i = 0; i <5; i++)
    {
        int *p=&arr[i];
        if (*p>max)
        {
            max=*p;
        }
        if (*p<min)
        {
            min=*p;
        }
    }
    cout<<"The largest number is:"<<max<<" "<<endl;
    cout<<"The smallest number in the array is:"<<min<<endl;
}