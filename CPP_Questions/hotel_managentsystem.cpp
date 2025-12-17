#include <iostream>
#include <string>
using namespace std;
bool bookroom[100]={false};
string customername[100];
void Bookroom();
void viewroom(int room);
void all_view();
void showMenu() {
    cout << "***************Haseeb's Inn***************"<<endl;
    cout << "1. View Room Status (Specific Room)"<<endl;
    cout << "2. Book a room"<<endl;
    cout << "3. Checkout"<<endl;
    cout<<"4. Status of All rooms!"<<endl;
    cout << "5. Search Booking Information"<<endl;
    cout << "6. Exit"<<endl;
    cout << "Enter your choice: ";
}
void checkout();
int main(){
   int choice;
   do{
       showMenu();
       cin>>choice;
       switch (choice)
       {
       case 1: 
       int room;
       cout<<"Please enter the room number:";
       cin>>room;
       viewroom(room);
        break;
        case 2: Bookroom();
        break;
        case 3:
        checkout();
        break;
        case 4:
        all_view();
        break;
       default:
        break;
       }
    } while(choice!=6);
}
void Bookroom(){
    int room;
    cout<<"Please enter the room";
    cin>>room;
    int index=room-1;
    if (bookroom[index])
    {
        cout<<"room is Already booked!";
    }
    else{
        cout<<"Please enter your name:";
        cin.ignore();
        getline(cin,customername[index]);
        cout<<"room is booked for you"<<endl;
        bookroom[index]=true;
}
}
void viewroom(int room){
    int index=room-1;
    if (bookroom[index])
    {
        cout<<"THe room is alrady booked by "<<customername[index]<<endl;
    }
    else{
        cout<<"The room is avalible for booking!"<<endl;
    }

}
void checkout(){
    int room;
    cout<<"Please enter the room number:";
    cin>>room;
    int index=room-1;
    if (bookroom[index])
    {
       cout<<"Checkout siccessful"<<endl;
       bookroom[index]=false;
    }
    else{
        cout<<"The room is already avaliable"<<endl;
    }
    int day_rate=1000;
    int day;
    cout<<"Please Enter the number of days you stayed:";
    cin>>day;
    int total_bill=day*day_rate;
    cout<<"Your total bill is:"<<total_bill<<endl;
}
void all_view(){
    int room=1;
int index=room-1;
    for (int i = 1; i <=10; i++)
    {
       if (bookroom[index])
       {
        cout<<"The room "<<i<<" is booked by: "<<customername[index]<<endl;
       }
       else{
        cout<<"The Room "<<i<<" is avaliable for booking"<<endl;
       }
       index++;
    }
    
}