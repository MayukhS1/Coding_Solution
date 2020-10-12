#include<stdio.h>
#include<stdlib.h>
#include<math.h>

int contains(int num, int x){
  while(num){
    if(x==num%10)
      return 1;
    num/=10;
  }
  return 0;
}
int main(int argc, char const *argv[]) {
  int n1,n2,t;
  scanf("%d%d%d",&n1,&n2,&t);
  for (int i = n1; i < n2; i++) {
    if(i==t || contains(i,t)){
      printf("%d ",i);
    }
  }
  return 0;
}
