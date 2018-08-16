/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Armstrongn
{
	public static void main (String[] args) throws java.lang.Exception
	{
	int c=0,a,temp;
int n=0;
Scanner sc=new Scanner(System.in);
int x=sc.nextInt();
temp=n;
while(n>0)
{
a=n%10;
n=n/10;
c=c+(a*a*a);
}
if(temp==c)
System.out.println("armstrong");
else
System.out.println("no");
	}
}
