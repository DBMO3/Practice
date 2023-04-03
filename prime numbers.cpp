#include <bits/stdc++.h>
#include <iostream>

using namespace std;

int main() {
	int count = 0;
	for(int num = 2; num < 20; num++){
		bool isPrime = true;
		for(int i = 2; i <= sqrt(num); i++){
			if(num%i == 0){
				isPrime = false;
				break;
			}
		}

		if(isPrime){
			cout << num << endl;
			count++;
		}
	}

	return 0;
}
