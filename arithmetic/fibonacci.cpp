#include<stdio.h>
#include<conio.h>
#define NUM 13
int main()
{
    int i;
    long fib[13] = {1,1};
    for(i=2; i<NUM; i++)
    {
        fib[i] = fib[i-1] + fib[i-2];
    }
    for(i=0; i<NUM; i++)
    {
        printf("%d月，兔子总数为%ld\n",i,fib[i]);
    }
    getch();//使程序停住
    return 0;
}