#include<iostream>
using namespace std;
int main()
{
  int i;
  cin>>i;
  if(i<=200)
  {i=i*0.5;
    cout<<"Rs."<<i;}
  else if(i<=400)
  {i=i*0.65+100;
    cout<<"Rs."<<i;}
  else if(i<=600)
  {i=i*0.8+200;
    cout<<"Rs."<<i;}
  else
  { i=i*1.25+425;  
    cout<<"Rs."<<i;}
}