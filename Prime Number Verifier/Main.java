// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
// Main function
int main()
{
  // Enter your code here 
  int num,prime=0,i;
  scanf("%d",&num);
  for(i=1;i<=num;i++){
  	if(num%i==0)
      	prime++;
  }
  if(prime==2){
    printf("prime");
  }
  else if(prime>2)
  {
    printf("composite");
  }
  else
    printf("neither");
   return 0;
}