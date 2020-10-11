#include<stdio.h>
#include<stdlib.h>
#include<math.h>
#include<string.h>

void print_arr(int arr[], int count){
  for (int i = 0; i < count; i++) {
    printf("%d ",arr[i]);
  }
}
int contains(int arr[], int count, int elm){
  for (int i = 0; i < count; i++) {
    if (arr[i]==elm) {
      return 1;
    }
  }
  return 0;
}
void merge(int arr1[],int arr2[], int count1,int count2){
  int count = count1+count2;
  int merged[count];
  int i,j,k;
  for (i = 0,j=0,k=0; i < count && j<count1 && k<count2;) {
    if(arr1[j]<arr2[k]){
      if(!contains(arr2,count2,arr1[j]))
        merged[i++]=arr1[j++];
      else j++;
    }
    else {
      if(!contains(arr1,count1,arr2[k]))
        merged[i++] = arr2[k++];
      else k++;
    }
  }
  while(j<count1){
    if(!contains(arr2,count2,arr1[j]))
      merged[i++] = arr1[j++];
    else j++;
  }
  while(k<count2){
    if(!contains(arr1,count1,arr2[k]))
      merged[i++] = arr2[k++];
    else k++;
  }
  print_arr(merged,i);
}

int main(int argc, char const *argv[]) {
/*code*/
//initializaions
int arr1[20],arr2[20];
int count1;
int count2;
//inputs
scanf("%d",&count1);
scanf("%d",&count2);
//array inputs
for (int i = 0; i < count1; i++) {
  scanf("%d",&arr1[i]);
}
for (int i = 0; i < count2; i++) {
  scanf("%d",&arr2[i]);
}
merge(arr1,arr2,count1,count2);
  return 0;
}
