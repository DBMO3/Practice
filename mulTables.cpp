#include <bits/stdc++.h>
#include <iostream>

using namespace std;
int main(){
	int table;
	cin >> table;

	for(int i = 0; i <= 10; i++){
		int result = table * i;
		cout << table << " X " << i << " = " << result << endl;
	}

	return 0;
}
