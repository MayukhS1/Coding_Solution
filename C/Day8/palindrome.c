#include<stdio.h>
#include<stdlib.h>
#include<math.h>
#include<string.h>
int isValid(int argc){
  if(argc!=2)
    return 0;
  return 1;
}
int isPalindrome(char str[])
{
    int h = strlen(str)-1;
    int l = 0;
    while (h > l){
      if (str[l++] != str[h--]) {
            return 0;
        }
    }
    return 1;
}
int main(int argc, char  *argv[]) {
  if(isValid(argc)){
    if(isPalindrome(argv[1])){
      printf("%s\n","Yes" );
    }
    else
    {
      printf("%s\n","No" );
    }
  }else{
    printf("%s\n","ERROR");
  }
  return 0;
}
