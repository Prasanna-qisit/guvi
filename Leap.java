

import java.util.*;
import java.lang.*;
import java.io.*;
class Leap
{
	public static void main (String[] args) throws java.lang.Exception
	{

Scanner sc=new Scanner(System.in);
int year=sc.nextInt();
if((year%400==0)||((year%4==0)&&(year%100!=0)))
{
System.out.println("leap year");
}
else 
{
System.out.println("no");
}
	}
}
