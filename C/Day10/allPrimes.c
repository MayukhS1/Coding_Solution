#include<stdio.h>
#include<stdlib.h>
#include<math.h>
#include<string.h>

int isPrime(int num){
   int flag = 1;
   if(num==1)
       return 0;

   for(int i=2; i<num/2; ++i){
       if(num%i == 0){
           flag = 0;
           break;
       }
   }
   return flag;
}

int main(int argc, char const *argv[]) {
  int num,count=0;
  scanf("%d",&num );
  while(num!=0){
      if(isPrime(num))
          count++;
      num=num/10;
  }
  printf("%d\n",count);
  return 0;
}
