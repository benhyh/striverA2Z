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

// LC palindrome
bool isPalindrome(int x) {
    string converted = std::to_string(x);
    string compare = std::to_string(x);

    int l = 0;
    int r = converted.length() - 1;

    while (l < r) {
        swap(converted[l], converted[r]);
            
        l++;

        r--;
    }

    return (compare == converted);
}

bool isPaplindromeInt(int x) {
    int dupe = x;
    int reversedValue = 0;

    while (0 < dupe) { 
        int digit = dupe % 10;
        dupe /= 10;
        reversedValue = reversedValue * 10 + digit;
    }

    return (x == reversedValue);
}