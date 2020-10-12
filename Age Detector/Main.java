#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  int birth,current;
  cin>>birth>>current;
  if(birth>current)
      cout<<(current+2000)-(birth+1900);
  else
    cout<<current-birth;
}