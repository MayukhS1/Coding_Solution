#include<stdio.h>
#include<stdlib.h>
#include<math.h>
#include<string.h>

int isValid(int argc){
  if(argc<2)
    return 0;
  return 1;
}
int main(int argc, char *argv[]) {
  /* code */
  int count = argc-1,i,j;
  char temp[25];
  if(isValid(argc)){

    for(i=1;i<=count;i++)
      for(j=i+1;j<=count;j++){
         if(strcmp(argv[i],argv[j])>0){
            strcpy(temp,argv[i]);
            strcpy(argv[i],argv[j]);
            strcpy(argv[j],temp);
         }
      }

   for(i=1;i<=count;i++)
      puts(argv[i]);

  }else{
    printf("%s\n","ERROR" );
  }
  return 0;
}
