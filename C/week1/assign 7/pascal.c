#include<stdio.h>
void pascalPrint(int n) {
  int rows=n, coef = 1, space, i, j;
  for (i=0; i<rows; i++) {
     for (space=1; space<=rows-i; space++)
        printf("  ");
     for (j=0; j<=i; j++) {
        if (j==0 || i==0)
           coef = 1;
        else
           coef = coef*(i-j+1)/j;
        printf("%4d",coef);
     }
     printf("\n");
  }
}
int main(int argc, char const *argv[]) {
  int num;
  scanf("%d",&num);
  pascalPrint(num);
  return 0;
}
