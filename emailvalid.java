/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in=new Scanner(System.in);
		Boolean b=false;
		String email1=in.next();
		int length1=email1.length();
		String email2=email1.replace("&","");
		int length2=email2.length();
		if(length1==length2+1)
		{
		 String EMAIL_REGEX = "^[\\w-_\\.+]*[\\w-_\\.]{3,}\\@([\\w]{4}+\\.)+com$";
            b = email2.matches(EMAIL_REGEX);
		}
      System.out.println(email1+"----->:Valid = " + b);
	}
}
