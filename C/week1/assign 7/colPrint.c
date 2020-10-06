#include<stdio.h>
int main(int argc, char const *argv[]) {
  int n;
  int arr[10][10];
  scanf("%d",&n);
  for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
      scanf("%d",&arr[i][j]);
    }
  }
  for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
      printf("%d ",arr[j][i]);
    }
  }
  return 0;
}
