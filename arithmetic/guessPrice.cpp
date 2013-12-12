/***********
*看商品猜价格
*/
#include<stdio.h>
#include<stdlib.h>
#include<conio.h>
int main()
{
    int old_price;//商品原来价格
    int price = 0;//猜测价格
    int i=0;
    printf("请先设置商品的原来价格\n");
    scanf("%d",&old_price);
    system("cls");
    printf("请输入试猜价格\n");
    while(old_price != price)
    {
        i++;
        printf("参与者\n");
        scanf("%d",&price);
        printf("主持人\n");
        if(price > old_price)
        {
            printf("高了\n");
        }
        else if(price < old_price)
        {
            printf("低了\n");
        }
        else
        {
            printf("恭喜你，答对了，该商品属于您了\n你一共猜了%d次\n",i);
        }
    }
    getch();
    return 0;
}