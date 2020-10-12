#include<stdio.h>
#include<stdlib.h>
#include <math.h>
int isPower(int n, int x){
  int p = 1;
  for (int i = 0; p <= x; i++) {
    p = pow(n,i);
    if (p==x) {
      printf("%s\n","Yes" );
      return 1;
    }
  }
  return 0;
}
int main(int argc, char const *argv[]) {
  int n,x;
  scanf("%d%d", &n,&x);
  if (!isPower(n,x)) {
    printf("%s\n","No" );
  }
  return 0;
}
