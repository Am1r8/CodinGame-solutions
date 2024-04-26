#include <stdlib.h>
#include <stdio.h>
#include <limits.h>
 

int comp (const void * e1, const void * e2) {
    int f = *((int*)e1);
    int s = *((int*)e2);
    if (f > s) return  1;
    if (f < s) return -1;
    return 0;
}
int main(int argc, char** argv)
{
    int N;
    scanf("%d\n", &N);
    int ho[N];
    for (int i = 0; i < N; i++)
        scanf("%d\n", ho+i);
    qsort(ho, N, sizeof(int), comp);
    int mi = INT_MAX;
    int di;
    for (int i = 0; i < N-1; i++) {
        di = ho[i+1]-ho[i];
        if (di < mi)
                mi = di;
    }
    printf("%d\n", mi);
    return EXIT_SUCCESS;
}