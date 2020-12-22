#include <stdio.h>


int main() {

  int sum = 0;

  for (int i = 0; i < 1000; i = i + 3)
  {
    sum = sum + i;
  }
  for (int i = 0; i < 1000; i = i + 5)
  {
    sum = sum + i;
  }
  for (int i = 0; i < 1000; i = i + 15) 
  {
    sum = sum - i;
  }
  printf("%d\n",sum);
  return 0;
}
