#include<iostream>
using namespace std;
int main()
{
  float j,k,l,m,n;
  int i;
  cin>>i>>j;
  l=i*j;
  k=(j/100)*50;
  if(i<=2)
    {cout<<l-k;}
  else if(i==3)
  {cout<<2*j;}
  else
  {cout<<"Number of items is more";}
}