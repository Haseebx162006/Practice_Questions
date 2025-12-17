#include <iostream>
#include <iomanip>
using namespace std;
int arr[10][10];
bool avaliable[10][10]={false};
void tick(int &row, int &column);
void cancel(int &row, int &column);
void draw();
void show(){
    cout<<"**************Haseeb's Movie Theater**************"<<endl;
    cout<<"1. Show Tickets"<<endl;
    cout<<"2. Book ticket"<<endl;
    cout<<"3. Cancel Ticket"<<endl;
    cout<<"4. Exit"<<endl;
    cout<<"Enter your choice:"<<endl;
}
int main(){
int choice;
do{
    show();
    cin>>choice;
    switch (choice)
    {
        case 1:
        draw();
        break;
        case 2:
int row;
cout<<"Enter the row:";
cin>>row;
row=row-1;
int column;
cout<<"Enter the column:";
cin>>column;
column=column-1;
tick(row,column);
break;
case 3:
cancel(row,column);
break;
case 4:
cout<<"Thanks for experincing our Cinema"<<endl;
break;
default:
    break;
}
} while (choice!=4);
}
void draw() {
    int num = 1;
    for (int i = 0; i < 10; i++) {
        for (int j = 0; j < 10; j++) {
            if (avaliable[i][j]) {
                cout << " X  ";
            } else {
                cout << setw(2) << num << "  ";
            }
            num++;
        }
        cout << endl;
    }
}
void tick(int &row, int &column){
    int num=1;
    if (row>10 && column >10)
    {
        do
        {
            if(row>10){

                cout<<"please enter the correcr row:";
                cin>>row;
            }
            if (column>10)
            {
                cout<<"Please enter the correct column:";
                cin>>column;
            }
        } while (row>10 || column >10);
    }
            if (avaliable[row][column])
            {
              cout<<"Seat has already booked!"<<endl<<endl;
            }
            else
            {
                avaliable[row][column]=true;
                cout<<"Seats has been booked for you"<<endl;
                int price=1000;
                cout<<"Your total bill is:"<<price<<" $"<<endl<<endl;
            }

}
void cancel(int &row, int &column){
    if (avaliable[row][column])
    {
        avaliable[row][column]=false;
        cout<<"Ticket has been canceled!.Get your amount from the counter"<<endl;
    }
    else{
        cout<<"You have not booked this ticket!"<<endl;
    }
}