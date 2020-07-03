#include<iostream>
using namespace std;
int main()
{
  float m,am;
  int p,d;
  cin>>m>>p>>d;
  am=m*p;
  if(am<d)
    cout<<"Cannot reach";
  else
    cout<<"Can reach";
}