#include <stdio.h>

int main(void)
{
    int lx, ly, inx, iny;
    int x, y;
    int dx, dy;
    scanf("%d %d", &lx, &ly);
    scanf("%d %d", &inx, &iny);
    x = inx;
    y = iny;
    while (1)
    {
        dx = lx - x;
        dy = ly - y;
        if ( dy < 0 )
        {
            printf("N");
            y--;
        }
        else if ( dy > 0 )
        {
            printf("S");
            y++;
        }
        if ( dx < 0 )
        {
            printf("W");
            x--;
        }
        else if ( dx > 0 )
        {
            printf("E");
            x++;
        }
        printf("\n");
    }
    return 0;
}