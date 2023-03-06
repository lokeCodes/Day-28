// https://www.codechef.com/problems/MINCARS
// Question Link^^^

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t-- > 0){
		    int x = s.nextInt();
		    int car = x/4;
		    int res = x%4==0 ? car : car+1;
		    System.out.println(res);
		}
	}
}
