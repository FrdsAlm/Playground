#include<iostream>
using namespace std;
int main()
{
  int items;
  float temp;
  cin>>items>>temp;
  if(items>3)
    cout<<"Number of items is more";
  else if(items==3)
    cout<<temp*2;
  else if(items==2)
    cout<<(temp*0.5)+temp;
  else
    cout<<temp;
}