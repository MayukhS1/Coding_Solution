#include<stdio.h>

int isUnique(int index, int arr[], int count){
  for (int i = 0; i < count; i++) {
    if(i!=index && (arr[i]==arr[index])){
      return 0;
    }
  }
  return 1;
}

int main(int argc, char const *argv[]) {
  int arr[10],count;
  scanf("%d",&count);
  for (int i = 0; i < count; i++) {
    scanf("%d",&arr[i]);
  }
  for (int i = 0; i < count; i++) {
    if(isUnique(i,arr,count)){
      printf("%d ",arr[i]);
    }
  }
  return 0;
}
