#include<iostream>
using namespace std;
int main()
{
  int x,y,ch;
  cout<<"Enter first number :";
  cin>>x;
  cout<<" Enter second number :";
  cin>>y;
  cout<<" Menu";
  cin>>ch;
  cout<<"\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Remainder\n";
  switch(ch){
    case 1: cout<<x+y; 
  break; 
  case 2: cout<<x-y;
  break;
  case 3: cout<<x*y;
  break;
  case 4: cout<<x/y;
  break;
  case 5: cout<<x%y;
  break;
  default: cout<<"Invalid operation";
  }
  return 0;
}