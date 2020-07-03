#include<iostream>
using namespace std;
int main()
{
  int w,a=75,c=30,na,nc,tw;
  cin>>w>>na>>nc;
  tw=(a*na)+(c*nc);
  if(w>tw)
    cout<<"Boat is stable";
  else
    cout<<"Boat will drow";
}