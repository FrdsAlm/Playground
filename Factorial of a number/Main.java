#include<iostream>
using namespace std;
int main(){
  // Type your code here
int n, i;
    unsigned long long fact = 1;
    cin>>n;
    if (n < 0)
        cout<<"-1";//Error! Factorial of a negative number doesn't exist.");
    else {
        for (i = 1; i <= n; ++i) {
            fact *= i;
        }
        cout<<fact;//"Factorial of %d = %llu", n, fact);
    }
}