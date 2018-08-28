import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner in=new Scanner(System.in);
		System.out.print("Enter any number : ");
		int number=in.nextInt();
		int i=1,count=0;
		while(i<=number)
		{
			if(number%i==0)
			{
				count++;
			}
			i++;
		}
		if(count>2)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}	// your code goes here
	}
}
