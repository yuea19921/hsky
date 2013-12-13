/**
*填字游戏
     算法描述题
   *       算
*--------------
*  题题题题题题
*/
#include<stdio.h>
#include<conio.h>
int main()
{
    int multiplier1,multiplier2,multiplier3,multiplier4,multiplier5;//乘数--从左到右，算法描述题
    long multiplicand;//被乘数
    long result;
    for(multiplier5=1; multiplier5<=9; multiplier++)
    {
        for(multiplier4=0; multiplier4<=9; multiplier++)
        {
            for(multiplier3=0; multiplier4<=9; multiplier++)
            {
                for(multiplier2=0; multiplier2<=9; multiplier++)
                {
                    for(multiplier1=1; multiplier<=9; multiplier++)
                    {
                        multiplicand = multiplier5 + multiplier4*10 + multiplier3*100 + multiplier2*1000 + multiplier1*10000;
                        result = multiplier5 + multiplier5*10 + multiplier5*100 + multiplier5*1000 + multiplier5*10000;
                        if(result == multiplicand * multiplier1)
                        {
                            printf("%d%d%d%d%d\n",multiplier1,multiplier2,multiplier3,multiplier4,multiplier5);
                            printf("X%4d\n",multiplier1);
                            printf("----------------------\n");
                            printf("%5d",result);
                        }
                    }
                }
            }
        }
    }
    getch();
    return 0;
}