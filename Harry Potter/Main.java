#include <iostream>
#include<stdlib.h>
using namespace std;
int firstDigit(int n)
{
    while (n >= 10)
        n /= 10;
    return n;
}
int lastDigit(int n)
{
    return (n % 10);
}

int main()
{
    int n;
    cin>>n;
    if(n>9999)
    {
        cout<<"-1";
    }
    else if(n<999)
    {
        cout <<lastDigit(n);
        exit(0);
    }
    else
        cout<<firstDigit(n)+lastDigit(n);
    return 0;
}
