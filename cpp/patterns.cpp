// 1. for the outer loop, count the # of lines
// 2. for the inner loop, focus on the columns & connect them somehow to the rows

// 3. print the "*" inside the inner for loop
// 4. observer symmetry in the pattern (option)

#include<bits/stdc++.h>
using namespace std;

// pattern 1

int pattern1(int n) {
    for (int i = 0; i<n; ++i) {
        for (int j = 0; j<n; ++j) {
            cout << "*" << "\n";
        }
        cout << endl;
    }
}

// pattern 2
int pattern2 (int n) {
    for (int i= 0; i<n; ++i) {
        for (int j=0; j<=i; ++j) {
            cout << "* ";
        }
        cout << endl;
    }
}

// pattern3
int pattern3 (int n) {
    for (int i=1; i<n; ++i) {
        for(int j=1; j<=i; ++j) {
            cout << j << " ";
        }
        cout << endl;
    }
}

// pattern 4
int pattern4 (int n) {
    for (int i = 1; i <= n; ++i) {
        for (int j = 1; j <=i; ++j) {
            cout << i << " ";
        }
        cout << endl;
    }
}

// 1
// 2 2
// 3 3 3
// 4 4 4 4
// 5 5 5 5 5

// outer loop: 1 to n
// inner loop: 1 to i
// print i (print the current iteration value)

// pattern 5
int pattern5(int n) {
    for (int i = 0; i<n; ++i) {
        for (int j = n; j>i; --j) {
            cout << "* ";
        }
        cout << endl;
    }
}

// *****
// ****
// ***
// **
// *


// outer loop; 1 to n
// inner loop: n to i
// print "*"

// pattern 6
int pattern6(int n) {
    for (int i = 0; i<n; ++i) {
        for (int j = n; j > i; --j) {
            cout << n-j+1 << " ";
        }
        cout << endl;
    }
}

// no. of columns =  (N - row index) for each line here
// (N - j) will give us the numbers in a row starting from 1 to N-i
// j = n => tells us how many cols to print
// n-j+1 => tells us the value to print. how? n-j returns the entire range of values and each time j decrements by 1, we get the next value in the range

int pattern7(int n) {
    for (int i = 0; i<n; ++i) {
        // space
        for (int j = 0; j<n-i+1; ++j) {
            cout << " ";
        }

        // star
        for (int j = j < 2*i+1; ++j) {
            cout << "*";
        }

        // space
        for (int j = 0; j<n-i+1; ++j) {
            cout << " ";
        }

        cout << endl;
    }
}

//      *
//     ***
//    *****
//   *******
//  *********

// sample input: 3
// first row contain two spaces (3-1)
// second row contain once space (3-2)
// third row contain no space (3-3)

