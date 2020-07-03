#include<iostream>
using namespace std;
int main()
{
  int p,r,y;
  float a,b,c,d;
  std::cin>>p;
  std::cin>>r;
  std::cin>>y;
  a=(p*r*y)/100;
  std::cout<<a;
  b=p+a;
  std::cout<<"\n"<<b;
  c=a*0.02;
  std::cout<<"\n"<<c;
  d=b-c;
  std::cout<<"\n"<<d;
return 0;
}