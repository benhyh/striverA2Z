#include<bits/stdc++.h>
using namespace std;

int main() {
    // int
    // long
    // float, double
    // string and getline
    // char 

    /**
     * int arr[5];
     * for(int i=0; i<5; i++) {
     *  cin >> arr[i];
     * }
     */


    int numbers[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int target = 5;

    for (int num : numbers) {
        if (num == target) {
            cout << "target found" << target << endl;
            break;
        }
        cout << "Checking" << num << endl;
    }

    for (int num : numbers) {
        if (num % 2 != 0) {
            continue;
        } else {
            cout << "num is even" << num << endl;
        }
    }
} 