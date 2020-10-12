#include <iostream>
#include<vector>
using namespace std;

int main() 
{
   int n;
  cin>>n;
  vector<int> myvector; 
  for(int i=0;i<n;i++)
  {
    int x;
    cin>>x;
    myvector.push_back(x);
  }
  int pos;
  cin>>pos;
myvector.erase(myvector.begin() + pos-1);
for(int i=0;i<myvector.size();i++)
{
	cout<<myvector[i]<<" ";
}
  
}