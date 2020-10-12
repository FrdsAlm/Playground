#include<iostream>
using namespace std;
int main()
{
  int yr;
  cin>>yr;
if (yr%4 == 0) {

      if(yr%100 == 0) {
      
          if(yr%400 == 0)
             cout<<"Vicky can celebrate his birthday.";
          else
             cout<<"Vicky can't celebrate.";
      }

      else {
             cout<<"Vicky can celebrate his birthday.";
      }
  }
  else
    cout<<"Vicky can't celebrate.";

  return 0;
}