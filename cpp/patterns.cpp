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

// int pattern3
int pattern (int n) {
    for (int i=1; i<n; ++i) {
        for (int j=1; j<=i; ++j) {
            cout << j << ""
        }
    }
    cout << endl;
}   