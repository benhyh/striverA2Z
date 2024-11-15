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
    int dupe = x;
    int rv = 0;

    while (0 < dupe) { 
        int ld = dupe % 10;
        dupe /= 10;
        rv = rv * 10 + ld;
    }

    return (x == rv)
}

bool checkArmstrong(int n){
	int dupe = n; 
    int rv;
    int digits = to_string(n).length();
    int armstrong = 0;

    while (dupe != 0) {
        int ld = dupe % 10; 
        dupe /= 10;
        rv = 0 * 10 + ld;
        armstrong = armstrong + pow(rv, digits);
    }
    
    return (n == armstrong);
}

int sumOfAllDivisors(int n) {
    int sum = 0;
    
    // Loop through numbers from 1 to n
    for (int i = 1; i <= n; i++) {
        // Find all divisors of i and add them
        int divisorSum = 0;
        
        // Check all possible divisors from 1 to sqrt(i)
        for (int j = 1; j * j <= i; j++) {
            if (i % j == 0) {
                divisorSum += j;  // Add the smaller divisor
                
                // If j is not the square root, add the corresponding larger divisor
                if (j * j != i) {
                    divisorSum += (i / j);
                }
            }
        }
        sum += divisorSum;
    }
    
    return sum;
}