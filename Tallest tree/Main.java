#include <iostream>
#include<algorithm>
using namespace std;

int main() 
{
   int n;
  cin>>n;
  int arr[n];
  for(int i=0;i<n;i++)
  {
  	int f,i2;
    cin>>f>>i2;
    arr[i]=f*12+i2;
  }
  cout<<*max_element(arr, arr + n);
}