#include<stdio.h>
#include<stdlib.h>
#include<math.h>

int main(int argc, char const *argv[]) {
  int n,temp1,temp2;
  scanf("%d",&n);
  int count[10]={0};
  temp1 = temp2 = n;
  while (temp1) {
    count[temp1%10]++;
    temp1/=10;
  }
  int c=0;
  for (size_t i = 0; i < 10; i++) {
    if(count[i] && n%i==0){
      c+=count[i];
    }
  }
  printf("%d\n",c);
  return 0;
}
