#include<stdio.h>
int main(int argc, char const *argv[]) {
  int m,n;
  int max1=-999,max2=-999;

  scanf("%d%d",&n,&m);
  for(int i=0;i<n;i++){
    int input;
    scanf("%d",&input);
    if(input>max1) max1=input;
  }
  for(int i=0;i<m;i++){
    int input;
    scanf("%d",&input);
    if(input>max2) max2=input;
  }
  printf("%d\n",(max1+max2));
  return 0;
}
