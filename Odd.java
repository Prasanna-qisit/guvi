/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Odd
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int i;
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(i=2;i<=n;i++)
{
if(i%2!=0)
{
System.out.println(i+ " ");
}
}
	}
}
