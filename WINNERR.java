/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t-- > 0){
		    int a = s.nextInt();
		    int b = s.nextInt();
		    int c = s.nextInt();
		    int d = s.nextInt();
		    int max1 = Math.max(a,b);
		    int max2 = Math.max(c,d);
		    if(max1==max2){
		        System.out.println("TIE");
		    }else if(max1<max2){
		        System.out.println("P");
		    }else if(max2<max1){
		        System.out.println("Q");
		    }
		    
		}
	}
}
