import java.util.*;
import java.lang.*;
import java.io.*;
class Program81
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		if(a>b)
		{
			System.out.println(a-b);
		}
		else
		{
			System.out.println(Math.abs(a-b));
		}
	}
}
