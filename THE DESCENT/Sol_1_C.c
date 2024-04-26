#include <stdlib.h>
#include <stdio.h>
#include <string.h>


int main()
{
  int mh, ih;  
  while (1) {
    mh = 0; 
    ih = 0;
    for (int i = 0; i < 8; i++) {
      int mountainH;
      scanf("%d", &mountainH);
      if(mountainH > mh) { 
	mh = mountainH; 
	ih = i;
      }
    }
    printf("%d\n", ih);
  }
  return 0;
}