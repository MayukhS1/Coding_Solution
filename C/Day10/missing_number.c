#include<stdio.h>
#include<stdlib.h>
#include<math.h>
#include<string.h>

void print_arr(int arr[], int count){
  for (int i = 0; i < count; i++) {
    printf("%d ",arr[i]);
  }
}

int main(int argc, char const *argv[]) {
/*code*/
//initializaions
int arr[20];
int count,sum=0;

//inputs
scanf("%d",&count);

//array inputs
for (int i = 0; i < count-1; i++) {
  scanf("%d",&arr[i] );
  sum+=arr[i];
}
double n = count;
printf("%d\n",(int)(n*(n+1)/2)-sum);

  return 0;
}
