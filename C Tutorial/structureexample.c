#include <stdio.h>
#include <conio.h>
#include <string.h>

struct book
{
    int bookid;
    char title[20];
    float price;
};

struct book input()
{
    struct book b;
    printf("Enter book id ");
    scanf("%d", &b.bookid);
    printf("Enter book title ");
    fflush(stdin);
    gets(b.title);
    printf("Enter book price ");
    scanf("%f", &b.price);
    return (b);
}

void display(struct book b)
{
    printf("\n%d %s %f", b.bookid, b.title, b.price);
}

int main()
{
    struct book b1;
    b1 = input();
    display(b1);
    return 0;
}