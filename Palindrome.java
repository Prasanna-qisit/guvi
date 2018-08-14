

import java.util.*;
import java.lang.*;
import java.io.*;

class Palindrome
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n,m,a=0,x;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
m=n;
while(n>0)
{
x=n%10;
a=a*10+x;
n=n/10;
}
if(a==m)
{
System.out.println("palindrome");
}
else
{
System.out.println("not");
}

	}
}
