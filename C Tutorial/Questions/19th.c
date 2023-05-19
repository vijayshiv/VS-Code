#include <stdio.h>
#include <conio.h>

int main() {
    int num;
    int c = 1;
    printf("Enter the number : ");
    scanf("%d", &num);

    if(num == 1){
        printf("Prime Number");
        return 0;
    }
    for(int i = 2; (i * i) <= num; i++ ){
        if(num % i == 0){
            c++;
        }
    }
    if(c == 1){
        printf("%d is prime number", num);
    } else {
        printf("%d is not prime  number", num);
    }
    return 0;
}