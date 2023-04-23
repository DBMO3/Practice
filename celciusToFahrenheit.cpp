#include <iostream>
using namespace std;

void celciusToFahrenheit(int celcius){
	double Fahrenheit = (celcius * 1.8000) + 32.00;
	cout << Fahrenheit << "°F" << endl;
}

int main(){
	int celcius;
	cin >> celcius;
	celciusToFahrenheit(celcius);
}
