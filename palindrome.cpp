#include <bits/stdc++.h>
#include <iostream>
#include <cstring>
#include <string>

using namespace std;

int main() {
	string word;
	cin >> word;

	string reverseWord = string(word.rbegin(), word.rend());
	cout << reverseWord << endl;

	if(strcasecmp(word.c_str(), reverseWord.c_str()) == 0){
		cout << "It's palindrome" << endl;
	} else {
		cout << "It isn't palindrome" << endl;
	}

	return 0;
}
