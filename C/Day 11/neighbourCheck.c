#include<stdio.h>
#include<stdlib.h>
#include<math.h>
int isNeighbour(int n){
  int prevDigit = n%10;
  n/=10;
  while (n) {
    int curDigit = n%10;
    n/=10;
    if(abs(curDigit-prevDigit)!=1)
      return 0;
    prevDigit = curDigit;
  }
  return 1;
}
int main(int argc, char const *argv[]) {
  int n;
  scanf("%d",&n);
  if(isNeighbour(n)){
    printf("%s\n","Yes" );
  }else{
    printf("%s\n","No" );
  }
  return 0;
}
