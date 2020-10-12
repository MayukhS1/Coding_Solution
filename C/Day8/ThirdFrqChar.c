#include<stdio.h>
#include<stdlib.h>
#include<math.h>
#include<string.h>
int isValid(int argc, char *argv){
  if(argc!=2)
    return 0;
  /*for (size_t i = 0; argv[i]!='\0'; i++) {
    if(argv[i]<0 && argv[i]>9)
      return 0;
  }*/
  return 1;
}
int main(int argc, char  *argv[]) {
  if(isValid(argc,argv[1])){
    int count[256]={0};
    for (size_t i = 0;argv[1][i]!='\0'; i++) {
      count[(int)argv[1][i]]++;
    }
    int max1 = 0, max2 = 0, max3 = 0;

    for (size_t i = 0; i < 256; i++) {
      if(count[i]>max1){
        max3 = max2;
        max2 = max1;
        max1 = count[i];
      }
      else if(count[i]>max2){
        max3 = max2;
        max2 = count[i];
      }
      else if(count[i]>max3){
        max3 = count[i];
      }
    }
    for (size_t i = 0; i < 256; i++) {
      if(max3==count[i]){
        printf("%c\n",i);
        break;
      }
    }
  }else{
      printf("%s\n","ERROR");
  }
  return 0;
}
