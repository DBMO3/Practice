#include <bits/stdc++.h>
#include <iostream>

using namespace std;
int main() {
	int array[] = {2,6,9,3,5};
	int result = 0;
	for(int i = 0; i < sizeof(array)/sizeof(int); i++){
		cout << i << ": " << array[i] << endl;
		result += array[i];
	}

	cout << result << endl;
	return 0;
}
