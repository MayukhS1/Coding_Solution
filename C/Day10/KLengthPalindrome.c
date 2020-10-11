#include<stdio.h>
#include<stdlib.h>
#include<math.h>
#include<string.h>

int isPalindrome(char str[], int k)
{
    int h = k-1;
    int l = 0;
    while (h > l) {
      if (str[l++] != str[h--]) {
            return 0;
        }
    }
    return 1;
}

int main(int argc, char const *argv[]) {
/*code*/
  char str[20]={},substr[10]={};
  gets(str);
  int k;
  scanf("%d",&k);
  for (unsigned int i = 0; i <= strlen(str)-k; i++) {
    int j=0;
    while(j<k){
      substr[j]=str[i+j];
      j++;
    }
    if(isPalindrome(substr,k))
      puts(substr);
  }

  return 0;
}
