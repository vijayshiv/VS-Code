#include <stdio.h>
#include <conio.h>

int main() {
    int a, b, c, d;
    a = 21;
    b = 33;
    c = -9;
    d = -112;
    
    // for a
    printf("Before Right Shift a : %d \n", a);
    a = a >> 2;
    printf("After Right Shift of a : %d \n", a);
    
    // for b
    printf("Before Left Shift a : %d \n", b);
    b = b << 2;
    printf("After Left Shift of a : %d \n", b);
    
    // for c
    printf("Before Right Shift a : %d \n", c);
    c = c >> 3;
    printf("After Right Shift of a : %d \n", c);
    
    // for d
    printf("Before Left Shift a : %d \n", d);
    d = d << 3;
    printf("After Left Shift of a : %d \n", d);
    
    return 0;
}