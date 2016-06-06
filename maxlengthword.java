/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int length=0,max=0;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String st=br.readLine();
		String word="";
		for(String st1:st.split(" "))
		{
			length=st1.length();
			if(length>max)
			{
				max=length;
				word=st1;
			}
		}
		System.out.println(word+"(length-"+max+")");
		
	}
}
