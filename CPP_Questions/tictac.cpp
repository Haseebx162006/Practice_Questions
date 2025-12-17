#include <iostream>
using namespace std;
bool tick[100]={false};
bool tick2[100]={false};
bool win(bool player[]);
void draw(){
    int num=1;
    for (int i = 0; i < 3; i++)
    {
        for (int j = 0; j < 3; j++)
        {
            if (tick[num])
            {
               cout<<"X"<<" ";
            }
            else if (tick2[num])
            {
                cout<<"O"<<" ";
            }
            else{
                cout<<num<<" ";
            }
            num++;
        }
        cout<<endl;
    }
    
}
void placer(){
    int moves =0;
    int choice1;
    while (moves<9)
    {
        draw();
        cout<<"Player One turn(1-9):";
        cin>>choice1;
        while (choice1<1 || choice1 >9 || tick[choice1] || tick2[choice1])
        {
            cout<<"Try again!";
            cin>>choice1;
        }
        tick[choice1]=true;
        if (win(tick))
        {
            draw();
            cout<<"Player 1 has won";
            return;
        }
        
        moves++;

        draw();
        cout<<"Player two turn(1-9):";
        cin>>choice1;
        while (choice1<1 || choice1 >9 || tick[choice1] || tick2[choice1])
        {
            cout<<"Try again!";
            cin>>choice1;
        }
        tick2[choice1]=true;
        moves++; 
        
    }
    
}
int main(){
    placer();

}
bool win(bool player[]){ 
    // 1  2  3
    // 4  5  6  
    // 7  8  9
     int wins[8][3] = {
        {1,2,3}, {4,5,6}, {7,8,9}, // Rows
        {1,4,7}, {2,5,8}, {3,6,9}, // Columns
        {1,5,9}, {3,5,7}           // Diagonals
    };
    for (int i = 0; i < 8; i++)
    {       
            if (player[wins[i][0]] && player[wins[i][1]] && player[wins[i][2]])
            {
                return true;
            }
            else if(player[wins[0][0]] && player[wins[1][1]] && player[wins[2][2]]){
                return true;
                        }
                        else if (player[wins[0][2]]&& player[wins[1][1]] && player[wins[2][0]])
                        {
                            return true;
                        }
                        
    }
    return false;
}