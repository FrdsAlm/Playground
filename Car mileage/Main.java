#include<iostream>
using namespace std;
int main()
{
  float mileage;
  int LoP,dist;
  cin>>mileage>>LoP>>dist;
  if(mileage*LoP>=dist)
    cout<<"Can reach";
  else
    cout<<"Cannot reach";
}