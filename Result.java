/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Result
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int base=1,exponent=1;
       Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
long result=1;
for(;exponent !=0; --exponent)
{
result *=base;
}
   System.out.println("answer=" +result);
	}
}
