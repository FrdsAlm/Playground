#include<iostream>
using namespace std;
int main()
{
  int a, b,c, i, hcf;
  cin>>a>>b>>c;

   for(i = 1; i <= a || i <= b; i++) {
   if( a%i == 0 && b%i == 0 && c%i==0 )
      hcf = i;
   }
  if((a>b && a<c)||(a>b && a<c))
    cout<<"The treasure is in box which has number "<<a<<endl;
  else if((b>a && b<c)||(b>c && b<a))
    cout<<"The treasure is in box which has number "<<b<<endl;
  else
    cout<<"The treasure is in box which has number "<<c<<endl;

   cout<<"The code to open the box is "<< hcf;
}