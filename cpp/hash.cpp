#include<bits/stdc++.h>
using namespace std;

void intHashing(int numberArray[], int size,int query) {
    
    // pre compute
    int hash[13] = {0};
    for (int i = 0; i < size; i++) {
        hash[numberArray[size]] += 1;
    }

    while (query--) {
        int number;
        cin >> number;
        // fetch
        cout << hash[number] << endl;
    }
}

void charHashing(string s, int query) {
    // pre-computing
    int hash[26] = {0};
    for (int i = 0; i < s.size(); i++) {
        hash[s[i] - 'a']++;
    } 

    while (query--) {
        char c; 
        cin >> c;
        // fetch 
        cout << hash[c-'a'] << endl;
    }
}

int main() {
    string s;
    cin >> s;

    int n;
    cin >> n;
    int arr[n];
    
    int q;
    cin >> q;

    intHashing(arr, n, q);
    charHashing(s, q);

    return 0;
}

class Solution {
    public:
    vector<int> frequencyCount(vector<int>&arr) {
        int size = arr.size();
        map<int, int> mpp;

        for (int i = 0; i < size; i++) {
            mpp[arr[i]]++;
        }

        vector<int> v;

        for (int i = 1; i <= size; i++) {
            v.push_back(mpp[i]);
        }

        return v;
    }   

    void selectionSort(vector<int> &arr) {
        int len = arr.size();
        
        for (int i = 0; i < len; i++) {
            int min = i;
            
            for (int j = i; j < len; j++) {
                if (arr[j] < arr[min]) min = j;
            }
            
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    void bubbleSort(std::vector<int>& arr) {
        int len = arr.size();

        for (int i = 0; i < len - 1; i++) {  // Iterate len-1 times
            for (int j = 0; j < len - i - 1; j++) {  // Traverse unsorted part
                if (arr[j] > arr[j + 1]) {  // Compare adjacent elements
                    std::swap(arr[j], arr[j + 1]);  // Swap if out of order
                }
            }
        }
    }
};