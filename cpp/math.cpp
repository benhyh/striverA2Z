#include<bits/stdc++.h>
using namespace std;

int countDigits(int n) {
   int cur = n;          // Store original number in cur
   int counter = 0;      // Initialize counter for valid divisible digits
   
   while (cur > 0) {     // Loop until all digits are processed
       int d_0 = cur % 10;   // Get rightmost digit using modulo
       if (d_0 != 0) {       // Only check non-zero digits
           counter += (n % d_0 == 0);  // Add 1 if digit divides n evenly, 0 if not
       }
       cur /= 10;        // Remove rightmost digit by integer division
   }
   
   return counter;           // Return count of digits that divide n evenly
}

// LC reverse integer
int reverse(int x) {
    int value = x;
    int reversed = 0;
    while (value != 0) {
        int digit = value % 10;
        value /= 10;
        if (reversed > INT_MAX / 10 || (reversed == INT_MAX / 10 && digit > 7)) return 0;
        if (reversed < INT_MIN / 10 || (reversed == INT_MIN / 10 && digit < -8)) return 0;
        reversed = reversed * 10 + digit;
    }
    return reversed;
}

