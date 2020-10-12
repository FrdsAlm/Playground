#include <bits/stdc++.h>
using namespace std;

int main() 
{
   int n;
  cin>>n;
  int arr[n-1];
  int temp=0;
  for(int i=0;i<n;i++)
    cin>>arr[i];
	sort(arr, arr+n/2); 
    sort(arr+n/2, arr+n, greater<int>()); 
  for(int i=0;i<n;i++)
    cout<<arr[i]<<" "; 
}