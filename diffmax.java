/* package whatever; // don't place package name! */

import java.util.*;
import java.math.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int a[]=new int[n];
		int diff=0,pos=0,max=0;
		for(int i=0;i<n;i++)
		{
			a[i]=in.nextInt();
			if(i>0)
			{
					diff=Math.abs(a[i]-a[i-1]);
				//	System.out.print(diff);
				if(diff>max)
				{
					max=diff;
					pos=i;
				}
			}
		}
		pos=pos-1;
		max=max-1;
		System.out.println(a[pos+max]);
	}
}
