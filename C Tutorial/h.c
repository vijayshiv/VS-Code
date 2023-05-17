#include <stdio.h>
#include <conio.h>
#include <windows.h>

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

void main()
{
    int x;
    x = 5 < 4 ? 1, 2, 3 : 4, 5, 6;
    printf("%d", x);
}