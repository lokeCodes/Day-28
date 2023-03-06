// https://www.codechef.com/problems/CHEFSCORE
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
		    int n = s.nextInt();
		    int x = s.nextInt();
		    int y = s.nextInt();
            int res1 = y/x;
            int res2 = res1*x;
            if(res2==y){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
	    }
	}
}

