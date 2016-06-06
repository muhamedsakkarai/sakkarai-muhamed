/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		StringBuilder sb=new StringBuilder();
		Scanner in=new Scanner(System.in);
		int sum=0;
		int start=in.nextInt();
		int end=in.nextInt();
		for(int i=start;i<=end;i++)
		{
			String str=String.valueOf(i);
			sb.append(str);
			if(str.equals(sb.reverse().toString()))
			{
				sum+=Integer.parseInt(str);	
			}
			sb.setLength(0);
		}
		System.out.println(sum);
	}
}
