#include<stdio.h>
#include<string.h>
#include<ctype.h>

int vowelCount(char* str) {
  /* code */
  int i=0, count=0;
  while(str[i]!='\0'){
    if(str[i]=='a'||str[i]=='e'||str[i]=='i'||str[i]=='o'||str[i]=='u'||str[i]=='A'||str[i]=='E'||str[i]=='I'||str[i]=='O'||str[i]=='U'){
      count++;
    }
    i++;
  }
  return count;
}
void printString(char str[]) {
  int i=0;
  int n = strlen(str);
  char rev[100];

  while (str[i]!='\0') {
    printf("%c",toupper(str[i]));
    rev[n-i-1] = toupper(str[i]);
    i++;
  }
  printf("%s\n"," ");
  puts(rev);

}
int main(int argc, char const *argv[]) {
  char str[100];
  gets(str);
  printf("%d\n",vowelCount(str));
  printString(str);
  return 0;
}
