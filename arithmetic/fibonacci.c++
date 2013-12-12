#include<stdio.h>
#define NUM 13;
int main()
{
    int i;
    long fib[NUM] = {1,1};
    for(i=2; i<NUM; i++)
    {
        fib[i] = fib[i-1] + fib[fib-2];
    }
    for(i=0; i<NUM; i++)
    {
        printf("%d月，兔子总数为%d",i,fib[i]);
    }
    getch();//使程序停住
    return 0;
}