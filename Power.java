/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Power
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int a,power,result=1;
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
power=sc.nextInt();
while(power!=0)
{
result=result*a;
power=power-1;
}
System.out.println(result);
	}
}
