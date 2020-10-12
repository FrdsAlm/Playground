#include<iostream>
using namespace std;
int main()
{
  int radius,length;
  cin>>radius>>length;
  if(radius+radius<=length)
    cout<<"circle can be inside a square";
  else
    cout<<"circle cannot be inside a square";
  return 0;
}