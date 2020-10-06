#include<stdio.h>
int main(int argc, char const *argv[]) {
  int n,arr[50];
  scanf("%d",&n);
  for (int i = 0; i < n; i++) {
    int input;
    scanf("%d",&input);
    if(input<n && input>=0){
      arr[input] = input;
    }
  }
  for (int i = 0; i < n; i++) {
    if(arr[i]<n && arr[i]>=0)
      printf("%d ", arr[i]);
    else
      printf("%d ",-1);
  }
  return 0;
}
