#include<stdio.h>
#include<stdlib.h>
#include<math.h>
#include<string.h>

void print_arr(int arr[], int count){
  for (int i = 0; i < count; i++) {
    printf("%d ",arr[i]);
  }
}
void merge(int arr1[],int arr2[], int count1,int count2){
  int count = count1+count2;
  int merged[count];
  int i,j,k;
  for (i = 0,j=0,k=0; i < count && j<count1 && k<count2; i++) {
    if(arr1[j]<arr2[k]){
      merged[i]=arr1[j++];
    }
    else{
      merged[i] = arr2[k++];
    }
  }
  while(j<count1){
    merged[i++] = arr1[j++];
  }
  while(k<count2){
    merged[i++] = arr2[k++];
  }
  print_arr(merged,count);
}
int main(int argc, char const *argv[]) {
/*code*/
//initializaions
int arr1[20],arr2[20];
int count1,count2;

//inputs
scanf("%d",&count1);
scanf("%d",&count2);

//array inputs
for (int i = 0; i < count1; i++) {
  scanf("%d",&arr1[i] );
}
for (int i = 0; i < count2; i++) {
  scanf("%d",&arr2[i] );
}
merge(arr1,arr2,count1,count2);
  return 0;
}
