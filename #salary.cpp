#include <iostream>
 using namespace std;

 int main()
 {
 	int salary; 
     int part;
     int full; // initializing variables
 	cout << "Enter your hourly pay" << endl; // asking for salary
 	cin >> salary; // inputting salary
     part = salary * 10; // part time salary
     full = salary * 40;  //full salary
     cout << "You make $" << part << " dollars for every 10 hours worked " << "and $" << full << " for every 40 hours!" << endl;
 }