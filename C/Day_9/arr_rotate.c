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
  int arr[20],left[20];
  int count,d;
  scanf("%d",&count);
  for (int i = 0; i < count; i++) {
    scanf("%d",&arr[i] );
  }
  scanf("%d",&d);
  for (int i = 0; i < count; i++) {
    left[i]=arr[i];
    arr[i]=arr[i+d];
  }
  for (int i = count-d,j=0; i < count; i++,j++) {
    arr[i]=left[j];
  }
  print_arr(arr,count);
  return 0;
}
