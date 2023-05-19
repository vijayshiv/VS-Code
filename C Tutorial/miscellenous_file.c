#include <stdio.h>
#include <conio.h>
// #include <windows.h>

/*
void main()
{
    char a ='a';
    COORD c;
    c.X = 20;
    c.Y = 8;
    SetConsoleCursorPosition(GetStdHandle(STD_OUTPUT_HANDLE), c);
    printf("Hello\n");
    printf("%d", a);
    printf("%c", a);
}
*/

/*
void main()
{
    int x;
    x = 23 & 56;
    printf("%d", x);
}
*/

/*
void main()
{
    int x;
    x = 5 < 4 ? 1, 2, 3 : 4, 5, 6;
    printf("%d", x);
}
*/

/*
void main()
{
    int i = 1;
    printf("do while \n");
    do
    {
        printf("vj \n");
        i++;
    } while (i <= 5);
}
*/

/*
void main()
{
    printf("while \n");
    int i = 1;
    while (i <= 5)
    {
        printf("vj \n");
        i++;
    }
}
*/


/*
void main()
{
    printf("for \n");
    int i;
    for (i = 1; i <= 5; i++)
    {
        printf("vj \n");
    }
}
*/

/*
void main(){
    int n,k;
    int fun(int);
    printf("Enter the number : ");
    scanf("%d",&n);
    k = fun(n);
    printf("The sum of n terms is : %d", k);
}
int fun(int a){
    int s;
    if(a == 1){
        return a;
    }
    s = a + fun(a-1);
    return s;
}
*/

/*
void main()
{
    int arr[3] = {4, 5, 6};
    int a = 2;
    a = 22;
    a = 32;
    a = 9;
    float f = 2.9456;
    printf("%u\n", a); // 4294967295 this is 2^32 - 1
    printf("%f\n", f);
    printf("%d\n", sizeof(8.45f));
    printf("%d\n", &a);        // 6422300 this is address of a
    printf("%d\a", sizeof(a)); // 32-bit integer size 4
    printf("%f", f + a);

    int num = 99;
    printf("%d %o %x %p %u %ld %i", num, num, num, num, num, num, num);
}
*/