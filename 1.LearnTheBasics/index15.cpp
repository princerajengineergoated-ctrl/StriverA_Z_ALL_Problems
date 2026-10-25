#include <iostream>
using namespace std;

int main() {

    int n = 1211;

    int temp = n;
    int count = 0;

    

    // Reverse number
    int reverse = 0;

    while(n > 0) {

        int reverse_digit = n % 10;

        reverse = reverse * 10 + reverse_digit;

        n = n / 10;
    }

    if(reverse == temp){
        cout<<"IT is Palindrome no. mate";
    }

    return 0;
}