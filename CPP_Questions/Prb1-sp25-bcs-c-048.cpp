#include <iostream>
#include <iomanip>
#include <fstream>
using namespace std;
void question2();
void shift_array(int arr[], int size);
fstream file1, file2;
string name[100];
int roll_number[100];
float quiz_1[100];
float quiz_2[100];
float quiz_3[100];
float quiz_average[100];
float attendence[100];
bool pass[100]={false};
bool pass_class[100]={false};
float pass_attendence[100];
void menu();
void quiz_search(int search);
void final_search(int search);
void process();
void read(){
    file1.open("sdata.txt",ios::in);
    for (int i = 0; i <10; i++)
    {
        file1>>name[i]>>roll_number[i]>>attendence[i]>>quiz_1[i]>>quiz_2[i]>>quiz_3[i];
    }
    file1.close();
}
void output(){
    file2.open("odata.txt",ios::out|ios::app);
   file2<<left<<setw(12)<<"Name"<<setw(15)<<"Roll.No"<<setw(12)<<"Attendance(%) "<<setw(12)<<" Avg Quiz"<<setw(15)<<"   Status"<<setw(15)<<endl;
   file2<<left<<"***************************************************************"<<endl;
   for (int i = 0; i < 10; i++)
   {
       file2<<left<<setw(12)<<name[i]<<setw(15)<<roll_number[i]<<setw(15)<<pass_attendence[i]<<setw(15)<<quiz_average[i]<<setw(15); if (pass_class[i] && pass[i]){file2<<"passed"<<endl;} else{
         file2<<"fail"<<endl;} };
 cout<<endl;
 file2.close();
}
void display();



int main(){
    read();
    process();
    output();
    //display();
    menu();
    cout<<endl;
    cout<<"Question 2:"<<endl;
    question2();
}



void process(){
      for (int i = 0; i < 10; i++)
    {
        quiz_average[i]=(quiz_1[i]+quiz_2[i]+quiz_3[i])/3;
        pass_attendence[i]=(attendence[i]/40.0*100);
        if (quiz_average[i]>=50)
        {
            pass[i]=true;
        }
        if (pass_attendence[i]>75)
        {
            pass_class[i]=true;
        }
    }
}
void display(){
    cout<<"********Student Quiz and Attendance Evaluation System***********"<<endl<<endl;
   cout<<left<<setw(12)<<"Name"<<setw(15)<<"Roll.No"<<setw(12)<<"Attendance(%) "<<setw(12)<<" Avg Quiz"<<setw(15)<<"   Status"<<setw(15)<<endl;
   cout<<left<<"***************************************************************"<<endl;
   for (int i = 0; i < 10; i++)
   {
       cout<<left<<setw(12)<<name[i]<<setw(15)<<roll_number[i]<<setw(15)<<pass_attendence[i]<<setw(15)<<quiz_average[i]<<setw(15); if (pass_class[i] && pass[i]){cout<<"passed"<<endl;} else{
         cout<<"fail"<<endl;} };
   }
   void menu(){
    int choice;
    int search;
    do{
        cout<<endl;
    cout<<"************Student Evaluator Program************"<<endl;
    cout<<"1.Display All results"<<endl;
    cout<<"2.Search By roll number and Display Stuedent Quiz marks"<<endl;
    cout<<"3.Search By roll number and Display Stuedent Final Results"<<endl;
    cout<<"4.Exiting the program"<<endl;
    cout<<endl;
    cout<<"Please enter your Choice:";
    cin>>choice;
    switch (choice)
    {
    case 1:
        display();
        break;
    case 2:
    cout<<"Please enter the roll number:";
    cin>>search;
    quiz_search(search);
    break;
    case 3:
    cout<<"Please enter the roll number:";
    cin>>search;
    final_search(search);
    break;
    case 4:cout<<"Exitng the program"<<endl;
    break;
    default:
    cout<<"invalid. try again"<<endl;
        break;
    }
    }while(choice!=4);
   }
   void quiz_search(int search){
    bool found=false;
    for (int i = 0; i < 10; i++)
    {
        if (search==roll_number[i])
        {
            found=true;
            cout<<"The quiz marks of "<<name[i]<<" is:"<<quiz_average[i]<<endl;
        }

    }
    if (!found)
    {
        cout<<"Student not found"<<endl;
    }
   }
   void final_search(int search){
    bool found=false;

    for (int i = 0; i < 10; i++)
    {
        if (search==roll_number[i])
        {
            found=true;
            cout<<"The final rwsult status of "<<name[i]<<" is:";if (pass_class[i] && pass[i]){cout<<"Passed"<<endl;} else{
         cout<<"fail"<<endl;}
        }

    }
    if (!found)
    {
        cout<<"Student not found"<<endl;
    }
   }

   // Question no 2
   void question2(){
       int arr[6];
       cout<<"Please enter ther elements of array:";
       for (int i = 5; i >=0; i--)
       {
           cin>>arr[i];
       }
       cout<<"Beforr shifting:";
       for (int i = 0; i < 6; i++)
       {
        cout<<arr[i]<<" ";
       }
       cout<<endl;
       shift_array(arr,6);
       cout<<"After shifting:";
       for (int i = 0; i < 6; i++)
       {
        cout<<arr[i]<<" ";
       }
       
}
void shift_array(int arr[], int size){
    int start=0; 
    int end=size-1;
    while (end>start)
    {
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        start++;
        end--;
    }
}
   