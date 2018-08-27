/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Multiplies
{
	public static void main (String[] args)
	{
int i,n;
Scanner sc=new Scanner(System.in);
i=sc.nextInt();
n=sc.nextInt();
if((i<=5)||(n<=5))
{
System.exit(1);
}
System.out.println(n + " multiplies of " + i + " :");
int j;
for(j=1;j<=n;j++)
System.out.println(j*i);
	}
