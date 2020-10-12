#include <iostream>
using namespace std;

int reverseDigits(int num) 
{ 
    int rev_num = 0; 
    while (num > 0) { 
        rev_num = rev_num * 10 + num % 10; 
        num = num / 10; 
    } 
    return rev_num; 
} 
int isPalindrome(int n) 
{ 

    int rev_n = reverseDigits(n); 

    if (rev_n == n) 
        return 1; 
    else
        return 0; 
} 
int main() 
{
   int x,y;
  cin>>x>>y;
  for(int i=x;i<=y;i++)
  {
    if(isPalindrome(i)==1)
      cout<<i<<" ";
  }
}