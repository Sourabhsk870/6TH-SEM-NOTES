/* JAVA PROGRAM TO FIND BIGGEST OF THREE NUMBERS */

import java.io.*;

public class Biggest {

    	public static void main (String []args) throws IOException {
    		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = 0, b = 0, c = 0, big = 0, big1 = 0;
		try {
			a = Integer.parseInt(args[0]); // Wrapper class
			b = Integer.parseInt(args[1]); // Wrapper class
			c = Integer.parseInt(args[2]); // Wrapper class
			big = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
			System.out.print("Enter number ---> ");
			a = Integer.parseInt(br.readLine());
			System.out.print("Enter number ---> ");
			b = Integer.parseInt(br.readLine());
			System.out.print("Enter number ---> ");
			c = Integer.parseInt(br.readLine());
			big1 = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
		}
		catch(NumberFormatException e){
		        System.out.println("Number format Exception occured: "+ e);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index out of bounds Exception occured: "+ e);
		}
		catch(IOException e) {
			System.out.println(e);
		 }
		 /* catch(Exception e){
		         System.out.println("Exception occured: "+ e);
		 }*/
		 System.out.println("Biggest is: " + big);
		 System.out.println("Biggest is: " + big1);
	 }
}
