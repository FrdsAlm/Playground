#include <iostream>
using namespace std;

int main() 
{
   int n;
  cin>>n;
  int arr[n];
  for(int i=0;i<n;i++)
  {
    cin>>arr[i];
  }
  int x,y;
  cin>>x>>y;
  for(int i=0;i<n;i++)
  {
    if((arr[i]-x)<y)
      arr[i]++;
    cout<<arr[i]<<" ";
  }
  
  
}