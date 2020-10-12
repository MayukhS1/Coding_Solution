#include<stdio.h>
#include<stdlib.h>
#include<math.h>
#include<string.h>

int isValid(int argc, char *argv1, char *argv2){
  if(argc!=3)
    return 0;
  for (size_t i = 0; argv1[i]!='\0'; i++) {
    if(argv1[i]<'0' || argv1[i]>'9')
      return 0;
  }
  for (size_t i = 0; argv2[i]!='\0'; i++) {
    if(argv2[i]<'0' || argv2[i]>'9')
      return 0;
  }
  return 1;
}

int gcd(int n1, int n2){
  while(n1!=n2){
       if(n1 > n2)
           n1 -= n2;
       else
           n2 -= n1;
   }
   return n1;
}

int main(int argc, char *argv[]) {
  if(isValid(argc, argv[1], argv[2])){
    int n1 = atoi(argv[1]);
    int n2 = atoi(argv[2]);
    printf("%d %d\n",gcd(n1,n2),(n1*n2/gcd(n1,n2)));
  }else{
    printf("%s\n","ERROR" );
  }
  return 0;
}
