/***********
*����Ʒ�¼۸�
*/
#include<stdio.h>
#include<stdlib.h>
#include<conio.h>
int main()
{
    int old_price;//��Ʒԭ���۸�
    int price = 0;//�²�۸�
    int i=0;
    printf("����������Ʒ��ԭ���۸�\n");
    scanf("%d",&old_price);
    system("cls");
    printf("�������Բ¼۸�\n");
    while(old_price != price)
    {
        i++;
        printf("������\n");
        scanf("%d",&price);
        printf("������\n");
        if(price > old_price)
        {
            printf("����\n");
        }
        else if(price < old_price)
        {
            printf("����\n");
        }
        else
        {
            printf("��ϲ�㣬����ˣ�����Ʒ��������\n��һ������%d��\n",i);
        }
    }
    getch();
    return 0;
}