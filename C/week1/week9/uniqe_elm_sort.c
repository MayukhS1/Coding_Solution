#include<stdio.h>
int findMinAfter(int arr[], int count, int minLimit){
  int min = 9999;
  for(int i=0;i<count;i++){
    if(arr[i]<min && arr[i]>minLimit){
      min = arr[i];
    }
  }
  return min;
}
void uniqueSortedArr(int arr[], int count){
  int sortedArr[count],index=0;
  int curmin=-9999;
  while (curmin!=9999) {
    curmin = findMinAfter(arr,count,curmin);
    sortedArr[index++]=curmin;
  }
  for (int i = 0; i < index-1; i++) {
    printf("%d ",sortedArr[i]);
  }
}
int main(int argc, char const *argv[]) {
  int arr[10],count;
  scanf("%d",&count);
  for (int i = 0; i < count; i++) {
    scanf("%d",&arr[i]);
  }
  uniqueSortedArr(arr,count);
  return 0;
}
