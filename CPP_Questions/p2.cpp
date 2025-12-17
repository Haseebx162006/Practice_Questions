#include <iostream>
using namespace std;
struct timeType {
    int hr;
    double min;
    int sec;
};
struct tourType {
    string cityName;
    int distance;
    timeType travelTime;
};
tourType destination;
void input(){
    cout<<"Enter:";
    cin>>destination.cityName;
    cout<<"Enter:";
    cin>>destination.distance;
    cout<<"Enter:";
    cin>>destination.travelTime.hr;
    cout<<"Enter:";
    cin>>destination.travelTime.sec;
}
void output(){
   cout<< destination.cityName<<endl;
   cout<< destination.distance<<endl;
   cout<< destination.travelTime.hr<<endl;
   cout<< destination.travelTime.min<<endl;
   cout<< destination.travelTime.sec<<endl;
}
int main(){
    // destination.cityName="kasur";
    // destination.distance=233;
    // destination.travelTime.hr=4;
    // destination.travelTime.min=23;
    // destination.travelTime.sec=23;
    tourType h2;
    input();
    output();
}
