#include<iostream>
using namespace std;
int main()
{
  int fp,fds,fdl,sp,sds,sdl,ap,ads,adl,rf,rs,ra;
  cin>>fp>>fds>>fdl>>sp>>sds>>sdl>>ap>>ads>>adl;
  rf=fp-((fp*fds)/100)+fdl;
  rs=sp-((sp*sds)/100)+sdl;
  ra=ap-((ap*ads)/100)+adl;
  cout<<"In Flipkart Rs."<<rf<<endl;
  cout<<"In Snapdeal Rs."<<rs<<endl;
  cout<<"In Amazon Rs."<<ra<<endl;
  if (rf<rs && rf<ra)
    cout<<"He will prefer Flipkart";
   else if(rs<rf && rs<ra)
     cout<<"He will prefer Snapdeal";
  else if(ra<rf && ra<rs)
    cout<<"He will prefer Amazon";
  else if((rf==rs)||(rf<rs && rf<ra))
    cout<<"He will prefer Flipkart";
}