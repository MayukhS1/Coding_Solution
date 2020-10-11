#include<stdio.h>
#include<math.h>

void primeFactor(int n){
  int temp = n;
  while(temp%2==0){
    printf("%s ","2");
    temp = temp/2;
  }
  for(int i=3;i<sqrt(temp);i++){
    while(temp%i==0){
      printf("%d ",i);
      temp/=i;
    }
  }
  if(temp>2)
    printf("%d\n",temp);
}
int main(int argc, char const *argv[]) {
  int n;
  scanf("%d",&n);
  primeFactor(n);
  return 0;
}
