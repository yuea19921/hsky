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
        printf("%d�£���������Ϊ%ld\n",i,fib[i]);
    }
    getch();//ʹ����ͣס
    return 0;
}