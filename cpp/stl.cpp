#include<bits/stdc++.h>
using namespace std;

/*
* 1. ALGORITHMS
* 2. CONTAINERS
* 3. FUNCTIONS
* 4. ITERATORS
*/

void explainPair() {
    pair<int, int> p = {1, 3};

    cout << p.first << " " << p.second << endl;

    pair<int, pair<int, int>> p1 = {1, {3, 4}};

    cout << p1.first << " " << p1.second.second << " " << p1.second.first;

    pair<int, int> arr[] = {{1, 2}, {2, 5}, {5, 1}};

    cout << arr[1].second; 
}

void explainVector() {

    vector<int> v;

    v.push_back(1); // push 1
    v.emplace_back(2); // push 2 (dynamic memory allocation)

    vector<pair<int, int>> vec;

    vec.push_back({1, 2});
    vec.emplace_back(1, 2); 

    vector<int> v(5, 100); // [size, input]
}

void explainList() {
    list<int> ls;

    ls.push_back(2); // {2}
    ls.emplace_back(5); // {2, 5}

    ls.push_front(5); // {5, 2, 4}
    ls.emplace_front(4); // {4, 5, 2, 4}
}

void explainIterator() {
    vector<int> v;
    vector<int>::iterator it = v.begin();
    
    // points to the memory, not the element. 

    it++;
    cout << *(it) << " ";

    for (auto it = v.begin(); it != v.end(); it++) {
        cout << *(it) << " ";
    }

    v.erase(v.begin() + 1); 
    v.erase(v.begin() + 1, v.begin() + 3); // end is not inclusive

    vector<int> v = (2, 100);
    v.insert(v.begin(), 300);
    v.insert(v.begin() + 1, 2, 10); // 2 instances of 10

    vector<int> copy(2, 50);
    v.insert(v.begin(), copy.begin(), copy.end());

}

void explainStack() {
    stack<int> st;
    st.push(1); // {1}
    st.push(2); // {2, 1}
    st.push(3); // {3, 2, 1}
    st.emplace(5); // {5, 3, 2, 1}

    cout << st.top();

    // LIFO - Last In First Out
}

void explainQueue() {
    queue<int> q;
    q.push(1);
    q.push(2);
    q.emplace(4);

    q.back() += 5;

    cout << q.back(); // prints 9

    cout << q.front() // prints 1

    // FIFO - First In First Out
}

void explainPQ() {
    priority_queue<int> pq;

    pq.push(5);
    pq.push(1);
    pq.push(10);
    pq.emplace(30);

    cout << pq.top(); // 30

    pq.pop(); // removes 30

    cout << pq.top(); // 10 

    // min heap
    priority_queue<int, vector<int>, greater<int>> pq;
    pq.push(5);
    pq.push(4);
    pq.push(1);
    pq.emplace(10);

    cout << pq.top(); // 1 
}

void print() {
    cout << "Hello World" << endl;
} // will not return you anything

void explainSet() {
    // stores everything in a sorted order and unique elements
    set<int> st;
    st.insert(1);
    st.emplace(2);
    st.insert(4);
    st.insert(3);

    // {1, 2, 3, 4, 5}
    auto it = st.find(3);  
}

void explainMultiSet() {
    multiset<int> st;

    st.insert(1);
    st.insert(1);
    st.insert(1); // {1, 1, 1}

    auto it = st.find(1); // points to the first 1 
    st.erase(1); // removes all the 1's

    int cnt = st.count(1); // 0

    st.erase(st.find(1)); // removes only one 1
}

void explainMap() {
    map<int, int> m;

    map<int, pair<int, int>> m;

    map<pair<int, int>, int> m;

    // {key, value} 
    // key can be of any data type
}

int sum(int a, int b) {
    return a + b;
} // will return you the sum of a and b

int main() {

    return 0;
}