#include<iostream>
using namespace std;
int main()
{
  int w,x,y;
  cin>>w>>x>>y;
  int cost=w*y;
  int profit=w*x;
  int net=profit-(cost+100);
  cout<<net;
  return 0;
}