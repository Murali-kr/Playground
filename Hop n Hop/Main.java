#include<iostream>
using namespace std;
int main()
{
  int x,y,a,b;
  std::cin>>x;
  std::cin>>y;
  a=x-3;
  b=y-4;
  (a>b)?std::cout<<a:std::cout<<b;
}