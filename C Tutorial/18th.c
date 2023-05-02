#include <stdio.h>
#include <conio.h>

int main() {
    int n, a = 0, b = 1, c, i = 1;
    printf("Enter value of n : ");
    scanf("%d",&n);
    // printf("Enter a and b : ");
    // scanf("%d %d", &a, &b);
    while(i <= n){
        c = a + b;
        printf("%d ", c);
        a = b;
        b = c;
        i++;
    }
    return 0;
}