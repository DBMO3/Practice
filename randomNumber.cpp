#include <iostream>
#include <cstdlib>
#include <time.h>

using namespace std;
int main(){
	int n;
	cout << "Type a number" << endl;
	cin >> n;

	srand(time(NULL));
	int randomNumber = rand() % 10 + 1;
	for(int attemp = 10; attemp > 0; attemp--){
		if(n > randomNumber || n < randomNumber){
			cout << "You have " << attemp << " attemps, Try again" << endl;
			cin >> n;
		}
	}

	if(n == randomNumber){
		cout << "Good job! :D" << endl;
	} else {
		cout << "Game over" << endl;
		cout << "The random number is: " << randomNumber << endl;
	}
}
