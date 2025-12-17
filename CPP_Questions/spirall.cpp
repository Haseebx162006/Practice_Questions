#include <iostream>
using namespace std;
void generatespiral(int n, int arr[][100]){
    int num=1,up=0,left=0,right=n-1,down=n-1;
    // 1 2 3
    // 8 9 4
    // 7 6 5 
    while(num<=n*n){
    for(int i=left ; i<=right ; i++)
    arr[up][i]=num++;
    up++;
    for(int i=up ; i<=down ; i++)
    arr[i][right]=num++;
    right--;
    for(int i=right ; i>= left ; i--)
    arr[down][i]=num++;
    down--;
    for(int i=down ; i>=up ; i--)
    arr[i][left]=num++;
    left++;
    }
}
void display(int n, int arr[][100]){
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n; j++)
        {
            cout<<arr[i][j]<<" ";
        }
       cout<<endl;
    }
    
}
int main(){
    int arr[100][100];
    int n;
    cout<<"Enter the value of rows:";
    cin>>n;
    generatespiral(n,arr);
    display(n,arr);   
}