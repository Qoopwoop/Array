public class GreaterToPower
{
int ans1=1;
int ans2=1;
int Great()
{
int base=2;
int pow=5;
for(int i=1;i<=pow;i++)
{
ans1=ans1*base;
}
System.out.println(ans1);
return ans1;
}
int Less()
{
int base=5;
int pow=2;
for(int i=1;i<=pow;i++)
{
ans2=ans2*base;
}
System.out.println(ans2);
return ans2;
}
if(ans1>ans2)
{
System.out.println(" 2 to the power of 5 is greater");
}
else
{
System.out.println("5 to the power of 2 is greater");
}




