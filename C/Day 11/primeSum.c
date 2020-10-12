#include <stdio.h>
int isPrime(int n){
  for (int i = 2; i <= n / 2; ++i) {
       if (n % i == 0) {
           return 0;
       }
   }
   return 1;
}
int primeSum(int n){
  for(int i=2; i<n/2; i++){
    if(isPrime(i)&&isPrime(n-i)){
      printf("%d %d\n",i,n-i);
      return 1;
    }
  }
  return 0;
}

int main(int argc, char const *argv[]) {
  int n;
  scanf("%d",&n);
  if(!primeSum(n)){
    printf("%s\n","Can\'t express as sum of two prime numbers" );
  }
  return 0;
}
