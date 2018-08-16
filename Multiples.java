/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Multiples
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int i=0;
int n=0;
Scanner sc=new Scanner(System.in);
System.out.println(" ");
i=sc.nextInt();
System.out.println(" ");
n=sc.nextInt();
if((i<=1) || (n<=1))
{
System.out.println();
System.exit(1);
}
System.out.println(n +" multiples of " + i + " are:"); 
	}
}
