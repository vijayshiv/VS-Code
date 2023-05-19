#include <stdio.h>
#include <conio.h>

int main() {
    int a;
    char h;
    float f;
    double d;
    long int l;
    short int s;
    long double lm;
                                                   // the void data type has no meaning, it has no size at all.
    printf("size of int     = %d \n ", sizeof(a)); // int will be 2 bytes or 16 bits in the case of an environment that is 16-bit.
    printf("size of char    = %d \n ", sizeof(h)); // int will be 4 bytes or 32 bits in case of an environment that is 32-bit.
    printf("size of float   = %d \n ", sizeof(f)); 
    printf("size of double  = %d \n ", sizeof(d));
    printf("size of long    = %d \n ", sizeof(l));
    printf("size of short   = %d \n ", sizeof(s));
    printf("size of long double   = %d \n ", sizeof(lm));

    return 0;
}