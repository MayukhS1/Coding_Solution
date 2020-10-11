#include<stdio.h>
#include<stdlib.h>
#include<math.h>
#include<string.h>

int maxDivide(int a, int b)
{
  while (a%b == 0)
   a = a/b;
  return a;
}

int isUgly(int no)
{
  no = maxDivide(no, 2);
  no = maxDivide(no, 3);
  no = maxDivide(no, 5);

  return (no == 1)? 1 : 0;
}

int getNthUglyNo(int n) {
  int i = 1;
  int count = 1;
  while (n > count){
    i++;
    if (isUgly(i))
      count++;
  }
  return i;
}
void uglyNumberAt(int pos){
  printf("%d\n",getNthUglyNo(pos));
}

void fiboNumberAt(int pos){
  if(pos==0){
    printf("%s\n","1");
  }
  else if(pos==1){
    printf("%s\n","1");
  }
  else{
    int a1 = 1, a2 = 1;
    for (int i = 2; i <= pos; i++) {
      int next = a2+a1;
      a1 = a2;
      a2 = next;
    }
    printf("%d\n",a2);
  }
}

int main(int argc, char const *argv[]) {
/*code*/
//initializaions
int n;

//inputs
scanf("%d",&n);

if(n%2==0){
  uglyNumberAt(n/2);
}
else{
  fiboNumberAt(n/2);
}

  return 0;
}
