// Input: nums = [0, 1, 0, 3, 12]
// Output: [1, 3, 12, 0, 0]
#include <iostream>
using namespace std;
void movezero(int arr[], int size){
    int n=1;
    int nzero=0;
    
    for (int i = 0; i < size; i++)
    {
        if (arr[i]!=0)
        {
            arr[nzero++]=arr[i];
        }
        
    }
    while (nzero<size)
    {
        arr[nzero++]=0;
    }
    for (int i = 0; i < size; i++)
    {
        cout<<arr[i]<<" ";
    }
    
    
}
int main(){
    int arr[5]={0, 1, 0, 3, 12};
    movezero(arr,5);

}