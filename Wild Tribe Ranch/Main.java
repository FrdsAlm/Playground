#include<iostream>
using namespace std;
int main()
{
  int max,act;
  cin>>max>>act;
  if(act<max)
    cout<<"Yes, you can enter.";
  else if(act==max)
     cout<<"Yes, you can enter. Kindly use a rope.";
  else
    cout<<"Sorry, you can't enter";
  return 0;
}