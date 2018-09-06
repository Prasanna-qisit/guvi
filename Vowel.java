import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Vowel
{
	public static void main (String[] args) throws java.lang.Exception
	{
		char ch;
        Scanner scan = new Scanner(System.in);
		
        System.out.print(" ");
        ch = scan.next().charAt(0);
		
        if(ch=='a' || ch=='A' || ch=='e' || ch=='E' ||
        ch=='i' || ch=='I' || ch=='o' || ch=='O' ||
        ch=='u' || ch=='U')
        {
            System.out.print("yes");
        }
        else
        {
            System.out.print("no");
        }
    }
}
	
