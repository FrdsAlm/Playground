#include <iostream>
using namespace std;

int BalanceFruits(int a, int m, int rs){

  if(a==m)
    return rs;
  else{
  	if(a>m)
      return rs-(a-m);
    else if(a<m)
      return rs+(m-a);
  }
}

int main() 
{
   int a,m,rs;
  cin>>a>>m>>rs;
  cout<<BalanceFruits(a,m,rs);
  return 0;
}