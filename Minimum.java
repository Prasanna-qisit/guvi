/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Minimum
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n,min=0;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
for(int i=0;i<n;i++)
{
if(i==0&&n>0)
min=n;
if(n<min)
min=n;
System.out.println(min);
}
	}
}
