#include <iostream>
#include <string>
using namespace std;

int main() 
{
   string a,b;
  cin>>a>>b;
  int count=0;
  if(a.length()!=b.length())
  {
  	cout<<"Not Anagram";
  }
  else{
    for(int i=0;i<a.length();i++)
    {
      for(int j=0;j<b.length();j++)
      {
        if(a[i]==b[j])
          count++;
      }
    }
    if(count==a.length())
      cout<<"Anagram";
    else
      cout<<"Not Anagram";
  }
}