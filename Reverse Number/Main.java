#include <iostream>
using namespace std;
int main() 
{
	int n, rev = 0, remainder;
    cin>>n;
    scanf("%d", &n);
    while (n != 0) {
        remainder = n % 10;
        rev = rev * 10 + remainder;
        n /= 10;
    }
    cout<<(rev);
	return 0;
}