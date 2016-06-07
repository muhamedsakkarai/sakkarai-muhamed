/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		ArrayList al=new ArrayList();
		Scanner in=new Scanner(System.in);
		String ans="";
		int max=0;
		int choice=in.nextInt();
		for(int i=0;i<choice;i++)
		{
			String namandmark=in.next();
			al.add(namandmark);
		}
			for(int i=0;i<choice;i++)
				{
					String name=al.get(i).toString();
					String addmark[]=name.split("#");
					int summark=Integer.parseInt(addmark[1])+Integer.parseInt(addmark[2])+Integer.parseInt(addmark[3]);
						if(summark>max)
							{
							max=summark;
							ans=addmark[0];
							}
					}
			System.out.println(ans);
	}
}
