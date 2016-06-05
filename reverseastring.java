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
		String str=in.next();
		sb.append(str);
		System.out.println(sb.reverse());
	}
}
