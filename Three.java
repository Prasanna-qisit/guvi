/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Three
{
	public static void main (String[] args) throws java.lang.Exception
	{
		double n1=1, n2=2, n3=3;
        if( n1 >= n2 && n1 >= n3)
        System.out.println("1");
       else if(n2 >= n1 && n2 >=n3)
       System.out.println("2");
       else
       System.out.println("3");
