#include <iostream>
#include <string>
#include <vector>
#include <algorithm>

using namespace std;

int main() {
  while (1) {
    int m = 0;
    int im = 0;
    for (int i = 0; i < 8; i++) {
      int mh;
      cin >> mh; cin.ignore();
      if (m < mh) {
        m = mh;
        im = i;
      }
    }
    cout << im << endl;
  }
}