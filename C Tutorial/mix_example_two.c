#include <stdio.h>
#include <conio.h>
#include<string.h>

/*
void main() {
    int x = 5;
    printf("%d\n", x);
    printf("%d", &x);
}
*/

/*
void main() {
    int x = 5;
    printf("%d\n", x);
    printf("%u\n", &x);
    printf("%d", *&x);
}
*/

/*
void main(){
    int a,b; 
    int *j;
    a = 15;
    j = &a;

    printf("%d\n", a);
    printf("%d\n", j);
    printf("%d", j+1);
}
*/

/*
void main(){
     int x , *p, **q, ***r;
     x = 5;
     p = &x;
     q = &p;
     r = &q;

     printf("%d\n", x);     // x = 5
     printf("%d\n", *p);    // p = &x and *p points the value of x
     printf("%d\n", **q);    // q = &p and *q points the value of p while **q points the value of x   
}
*/

/*
void main(){
    int x, y;
    int *p, *q;

    x = 5;
    y = 6;

    p = &x;
    q = &y;

    printf("%d - %d = %d\n", p ,q ,(p-q));
    printf("p = %d\n", p);
    printf("Pointer(p) + 1 = %d",(p+1));
}
*/

/*
void main(){
    int x, y, *p , *q;
    x = 5;
    y = 10;
    p = &x;
    q = p - 1;

    printf("%d\n", x);
    printf("%d\n", &y);
    printf("%d\n", p);
    printf("%d\n", *q);
}
*/

/*
void main(){
    int a[5], i, *p;
    p = &a[0];

    for(i = 0; i < 5; i++){
        scanf("%d",(p + i));
    }
    for(i = 0; i < 5; i++){
        printf("%d ",*(p + i));
    }
}
*/