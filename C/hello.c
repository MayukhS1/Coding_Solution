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
int count;

//inputs
scanf("%d",&count);

//array inputs
for (int i = 0; i < count; i++) {
  scanf("%d",&arr[i] );
}


  return 0;
}
