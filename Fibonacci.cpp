#include <bits/stdc++.h>
#include <iostream>

using namespace std;
int main(){
	int n, F2 = 0, F0 = 0, F1 = 1;
	cin >> n;

	for(int i = 0; i <= n; i++){
		cout << "F" << i << ": " << F0 << endl;
		F2 = F0 + F1;
		F0 = F1;
		F1 = F2;
	}
	return 0;
}
