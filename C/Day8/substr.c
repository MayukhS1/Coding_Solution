#include<stdio.h>
#include<stdlib.h>
#include<math.h>
#include<string.h>
int isValid(int argc){
  if(argc!=3)
    return 0;
  return 1;
}
int main(int argc, char *argv[]) {
  /* code */
  if(isValid(argc)){
    if(strstr(argv[1],argv[2])=='\0'){
      printf("%s\n","Not Present" );
    }
    else{
      printf("%s\n","Present" );
    }
  }else{
    printf("%s\n","ERROR" );
  }
  return 0;
}
