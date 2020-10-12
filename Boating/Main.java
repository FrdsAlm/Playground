#include<iostream>
using namespace std;
int main()
{
  int weight,adult,child;
  cin>>weight>>adult>>child;
  if((adult*75+child*30)>weight)
    cout<<"Boat will drow";
  else
    cout<<"Boat is stable";
  return 0;
}