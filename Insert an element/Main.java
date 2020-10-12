#include <iostream>
#include <vector>
using namespace std;

int main() 
{
   int n;
  cin>>n;
  vector <int> arr;
  for(int i=0;i<n;i++)
  {
    int x;
    cin>>x;
    arr.push_back(x);
  }
  int x,y,temp=0;
  cin>>x>>y;
for (int i = n; i >= x; i--) 
        arr[i] = arr[i - 1]; 
  arr[x - 1] = y; 
for(int i=0;i<=n;i++)
  {
	cout<<arr[i]<<" ";
  }
  
}