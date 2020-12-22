#include<stdio.h>
int square (int num);
int main() {
   int a;
  scanf("%d",&a);
 
  printf("%d",square(a));
  return 0;
  
}
int square (int num)
{
 int r=num*num;
  return r;
}
 