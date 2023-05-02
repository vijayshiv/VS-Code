#include <stdio.h>
#include <conio.h>

int main() {
    float princpal, roi, time, si;
    printf("Enter the princpal amount : ");
    scanf("%f", &princpal);
    printf("Enter the rate of intrest per annum : ");
    scanf("%f", &roi);
    printf("Enter the time period in years : ");
    scanf("%f", &time);

    si = (princpal * roi * time)/100;
    printf("The simple intrest : %f", si);
    return 0;
}