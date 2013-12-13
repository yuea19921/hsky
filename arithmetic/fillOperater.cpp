/*
*   calculate
*   eg: 5 5 5 5 5 = 5 其中填入运算符，使其等式成立
*   此例子 不限制运算符的使用次数
*/
#include<stdio.h>
#include<conio.h>
int main()
{
    int j;
    int i[5];//need to calculate number i[1] = +; i[2] = -; i[3] = *; i[4] = /
    int num[6];//to store operator number
    int result;//to store operator result
    int count;//count number
    char operator[5] = {"","+","-","*","/"};//operator
    printf("输入要计算的数字\n");
    //insert number
    for(j=1; j<=5; j++){
        scanf("%d",&num[j]);
    }
    printf("输入结果值\n");
    scanf("%d",&result);
    for(i[1]=1; i[1]<=4; i[i]++)
    {
        if( i[1]<4 || num[2]!=0)
        {
            for(i[2]=1; i[2]<=4; i[2]++)
            {
                if(i[2]<4 || num[3]!=0)
                {
                    for(i[3]=1; i[3]<=4; i[3]++)
                    {
                        if(i[3]<4 || i[3]!=0)
                        {
                            for(i[4]=1; i[4]<=4; i[4]++)
                            {
                                if(i[4]<4 || i[4]!=0)
                                {
                                    left = 0;
                                    right = num[1];
                                    sign = 1;
                                    for(j=1; j<=4; j++)
                                    {
                                        switch(operator[i[j]])
                                        {
                                            case "+" :
                                                left = left + sign * right;
                                                sign = 1;
                                                right = num[j+1];
                                                break;
                                            case "-" :
                                                left = left + sign * right;
                                                sign = -1;
                                                right = num[j+1];
                                                break;
                                            case "*" :
                                                right = right * num[j+1];
                                                break;
                                            case "/" :
                                                right = right / num[j+1];
                                                break;
                                        }
                                    }
                                    if(left+sign*right == result)
                                    {
                                        count++;
                                        printf("%3d:",count);
                                        for(j=1; j<=4; j++)
                                        {
                                            printf("%d%c",num[j],operator[i[j]]);
                                        }
                                        printf("%d=%d",num[5],result);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    if(0 == count)
    {
        printf("没有符合条件的结果\n");
    }
    getch();
    return 0;
}