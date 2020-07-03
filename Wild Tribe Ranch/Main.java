#include<iostream>
int main()
{
  int a,b;
  std::cin>>a>>b;
  if(a>b)
    std::cout<<"Yes, you can enter.";
  else if(b>a)
    std::cout<<"Sorry, you can't enter";
  else
    std::cout<<"Yes, you can enter. Kindly use a rope.";
}