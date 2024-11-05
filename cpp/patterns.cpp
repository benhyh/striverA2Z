// 1. for the outer loop, count the # of lines
// 2. for the inner loop, focus on the columns & connect them somehow to the rows

// 3. print the "*" inside the inner for loop
// 4. observer symmetry in the pattern (option)

#include<bits/stdc++.h>
using namespace std;

void pattern1(int n) {
        for (int i = 0; i<n; ++i) {
        for (int j = 0; j<n; ++j) {
            cout << "*" << "\n";
        }
        cout << endl;
    }
}
void pattern2 (int n) {
    for (int i= 0; i<n; ++i) {
        for (int j=0; j<=i; ++j) {
            cout << "* ";
        }
        cout << endl;
    }
}
void pattern3 (int n) {
    for (int i=1; i<n; ++i) {
        for(int j=1; j<=i; ++j) {
            cout << j << " ";
        }
        cout << endl;
    }
}
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
void pattern13 (int n) {
    int num = 1;
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j<=i; j++)  {
            cout << num << " ";
            num = num + 1;
        }
    }
}
void pattern14 (int n) {
    for (int i = 1; i <= n; i++) {
        char c = 'A'; // stores as an 8 bit integer (ASCII value)
        for (int j = c; j < c+i; j++) { // 65 (ASCII value of 'A') or int j = 65; j < 65+i; j++
            cout << char(j) << " "; // convert ASCII value to character 
        }
        cout << endl;
    }
}
void pattern15 (int n) {  
    for (int i = 1; i <= n; i++) {
        char c = 'A'; // 65      

        for (int j = c; j <= (c+n)-i; j++) {
            cout << char(j) << " "; 
        }

        cout << endl;
    }
}
void pattern16 (int n) {}
void pattern17 (int n) {}
void pattern18 (int n) {}
void pattern19 (int n) {}
void pattern20 (int n) {}
void pattern21 (int n) {}
void pattern22 (int n) {}
void pattern23 (int n) {}

int main() {
    int t;
    cin >> t;
    for (int i = 0; i < t; i++) {
        int n;
        cin >> n;
        pattern8(n);
    }
}