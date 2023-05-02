#include <stdio.h>
#include <conio.h>

int main() {
    int num, rem, sumofdigits = 0;
    printf("Enter the number : ");
    scanf("%d", &num);

    while(num > 0){
        rem = num % 10;
        num = num / 10;
        sumofdigits = sumofdigits + rem;

    }
    printf("The sum of digits of %d is : %d", num, sumofdigits);
    return 0;
}