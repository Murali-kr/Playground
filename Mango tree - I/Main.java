#include<iostream>
using namespace std;
int main()
{
  int a,b,c,t,t1;
  cin>>a>>b>>c;
  
  if(c<a||c<b||b%c==0||c%b==1)
  	{cout<<"Yes";}
  else
    {cout<<"No";}
}