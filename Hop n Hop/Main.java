#include<iostream>
#include<math.h>
using namespace std;
int main()
{
 int x,y;
  cin>>x>>y;
  int hops=0;
  if(x>3 && y>4)
  {
    x-=3;
    y-=4;
    hops=sqrt(x*x+y*y);
    cout<<hops;
  }
  else
  {
    x=3-x;
    y=4-y;
    hops=sqrt(x*x+y*y);
    cout<<hops;
  }
  return 0;
}