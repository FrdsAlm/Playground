#include<iostream>
using namespace std;
int main()
{
  int rail;
  string side;
  cin>>side>>rail;
  
  if(side[0]=='f'){
    if(rail==1)
      cout<<"Left Handed";
  	else
      cout<<"Right Handed";
  }
  else{
    if(rail==1)
      cout<<"Right Handed";
  	else
      cout<<"Left Handed";
  }
}