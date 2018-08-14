

import java.util.*;
import java.lang.*;
import java.io.*;

class Count
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int count=0,n;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
while(n!=0)
{
n/=10;
++count;
}
System.out.println(count);
	}
