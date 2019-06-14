#include<stdio.h>
int main()
{
  //Type your code here
  int t1=1,t2=2,t3,i,n;
  scanf("%d",&n);
  for(i=3;i<=n;i++){
  		t3=t1+t2;		//3	
    	t1=t2;			//t1=2
    	t2=t3;			//t2=3
    }
  printf("%d",t3);
  return 0;
}