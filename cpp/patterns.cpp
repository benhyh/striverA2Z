// 1. for the outer loop, count the # of lines
// 2. for the inner loop, focus on the columns & connect them somehow to the rows

// 3. print the "*" inside the inner for loop
// 4. observer symmetry in the pattern (option)

#include<bits/stdc++.h>
using namespace std;

// pattern 1
void pattern1(int n) {
        for (int i = 0; i<n; ++i) {
        for (int j = 0; j<n; ++j) {
            cout << "*" << "\n";
        }
        cout << endl;
    }
}

// pattern 2
void pattern2 (int n) {
    for (int i= 0; i<n; ++i) {
        for (int j=0; j<=i; ++j) {
            cout << "* ";
        }
        cout << endl;
    }
}

// pattern3
void pattern3 (int n) {
    for (int i=1; i<n; ++i) {
        for(int j=1; j<=i; ++j) {
            cout << j << " ";
        }
        cout << endl;
    }
}

// pattern 4
void pattern4 (int n) {
    for (int i = 1; i <= n; ++i) {
        for (int j = 1; j <=i; ++j) {
            cout << i << " ";
        }
        cout << endl;
    }

// 1
// 2 2
// 3 3 3
// 4 4 4 4
// 5 5 5 5 5

// outer loop: 1 to n
// inner loop: 1 to i
// print i (print the current iteration value)

}

// pattern 5
void pattern5(int n) {
    for (int i = 0; i<n; ++i) {
        for (int j = n; j>i; --j) {
            cout << "* ";
        }
        cout << endl;
    }

// *****
// ****
// ***
// **
// *


// outer loop; 1 to n
// inner loop: n to i
// print "*"

}

// pattern 6
void pattern6(int n) {
    for (int i = 0; i<n; ++i) {
        for (int j = n; j > i; --j) {
            cout << n-j+1 << " ";
        }
        cout << endl;
    }

// no. of columns =  (N - row index) for each line here
// (N - j) will give us the numbers in a row starting from 1 to N-i
// j = n => tells us how many cols to print
// n-j+1 => tells us the value to print. how? n-j returns the entire range of values and each time j decrements by 1, we get the next value in the range

}

// pattern 7
void pattern7(int n) {
    for (int i = 0; i<n; ++i) {
        // space
        for (int j = 0; j<n-i+1; ++j) {
            cout << " ";
        }

        // star
        for (int j = 0; j < 2*i+1; ++j) {
            cout << "*";
        }

        // space
        for (int j = 0; j<n-i+1; ++j) {
            cout << " ";
        }

        cout << endl;
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

}

// pattern 8
void pattern8 (int n) {
    for (int i = 0; i < n; ++i) {
        
        // Print spaces (increasing with each row)
        for (int j = 0; j < i; ++j) {
            cout << " ";
        }

        // Print stars (decreasing with each row)
        for (int j = 0; j < 2 * (n - i) - 1; ++j) {
            cout << "*";
        }

        // Move to the next line after each row
        cout << endl;
    }

// *********
//  *******
//   *****
//    ***
//     *    

}

void pattern9 (int n) {
    // pattern 9 (combination of pattern 7 and 8)
}

// pattern 10
void pattern10 (int n) {
    for (int i = 0; i < n; i++) {
        for (int j=0; j<=i; j++) {
            cout << "*";
        }
        cout << endl;
    }
    for (int i = 0; i < n; i++) {
        for (int j=n-1; j>i; j--) {
            cout << "*";
        }
        cout << endl;
    }
}

// pattern 11
void pattern11 (int n) {
    int start = 1;
   
    for (int i = 0; i < n; i++) {
        if (i%2 == 0) start = 1;
        else start =0;
        for (int j = 0; j<=i; j++) {
            cout<< start;
            start = 1-start;
        }

        cout << endl;
    }
}

// pattern 12
void pattern12 (int n) {
    for (int i = 0; i < n; i++) {  // n is 3
        // numbers (1, 2, 3)             
        for (int j = 1; j < i+2; j++) {
            cout << j << " ";
        }

        // whitespace (8, 4, 0)  
        for (int j = 0; j < (2*(n-i)-2)*2; j++) {
            cout << " "; 
        } 

        // numbers (1, 2, 3) 
        for (int j = i+1; j > 0; j--) {
            cout << j << " ";
        }

        cout << endl;
    }
}

// pattern 13
void pattern13 (int n) {
    for (int i = 0; i < n; i++) {
        int start = i*(i+1)/2 + 1;
        // 0*(0+1)/2 + 1 = 1
        for (int j = 0; j <= i; j++) {
            cout << start << " ";
            start++;
        }
        cout << endl;
    }
}

// pattern 14
void pattern14 (int n) {}

// pattern 15
void pattern15 (int n) {}

int main() {
    int t;
    cin >> t;
    for (int i = 0; i < t; i++) {
        int n;
        cin >> n;
        pattern8(n);
    }
}