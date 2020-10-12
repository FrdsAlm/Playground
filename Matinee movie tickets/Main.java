#include<iostream>
using namespace std;
int main()
{
  int age;
  float showtime;
  cin>>age>>showtime;
  if(age<13){
    if(showtime>12.30)
      cout<<"$2.00";
  	else
      cout<<"$4.00";
  }
  else{
    if(showtime>12.30)
      cout<<"$5.00";
  	else
      cout<<"$8.00";
  }
}