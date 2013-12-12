/***********
*看商品猜价格
*/
#include<stdio.h>
int main()
{
    int old_price;//商品原来价格
    int price = 0;//猜测价格
    int i;
    printf("请先设置商品的原来价格！");
    scanf("%d",&old_price);
    system("cls");
    printf("请输入试猜价格！");
    while(old_price != price)
    {
        i++;
        prinf("参与者");
        scanf("%d",&price);
        printf("主持人");
        if(price > old_price)
        {
            prinf("高了");
        }
        else if(price < old_price)
        {
            prinf("低了");
        }
        else
        {
            printf("恭喜你，答对了，该商品属于您了\n你一共猜了%d次",i);
        }
    }
    getch();
    return 0;
}