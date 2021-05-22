/* JAVA PROGRAM TO FIND THE GREATEST OF TWO INTEGERS */

import java.util.*;

class Greater {
	public static void main(String args []){
		Scanner s = new Scanner(System.in);
		System.out.println ("Enter two numbers to find the greatest :");
		int a = s.nextInt();
		int b = s.nextInt();
		int big;
		if (a >= b)
			big = a;
		else
			big = b;
		System.out.println ("Greatest number is : "+big);			
	}
}
