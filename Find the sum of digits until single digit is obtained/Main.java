#include<stdio.h>
int main(){
	int num,rem,sum=0,temp;
  	scanf("%d",&num);
  	temp=num;
  if(temp%2==0){
  	temp=temp%10;
    sum=temp-1;
  }
  else{
  while(temp!=0){
  	rem=temp%10;
	sum=sum+rem;
    temp=temp/10;
  }
  }
  printf("%d",sum);
  return 0;
}