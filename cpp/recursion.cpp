#include<bits/stdc++.h>
using namespace std;

void printArray1(int ans[], int n) {
    cout << "The reversed array is: " << endl;
    for (int i = 0; i < n; i++) {
        cout << ans[i] << " ";
    }
} 

// first approach (using extra array) 
void reverseArray1(int arr[], int n) {
   int ans[n];
   for (int i = n - 1; i >= 0; i--) {
      ans[n - i - 1] = arr[i];
   }
   printArray1(ans, n);
}

// two pointers (swap array)
void reverseArray2(int arr[], int n) {
    int p1 = 0, p2 = n - 1;
    while (p1 < p2) {
        swap(arr[p1], arr[p2]);
        p1++; p2--;
    }
}

/*
* recursive method
* @param arr[]
* @param start - start index of the array 
* @param end - end index of the array
*/
void reverseArray3(int arr[], int start, int end) {
    if (start < end) {
        swap(arr[start], arr[end]);
        reverseArray3(arr, start + 1, end - 1);
    }
}

bool isPalindrome(string s) {
    // init new string
    for (int i = s.length() - 1; i >= 0; i--) {
        cout << s[i] << endl;
    }
}