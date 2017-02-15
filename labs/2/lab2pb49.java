
import java.io.*;
import java.util.Scanner;
	public class lab2pb49 { 
     
    public static void main(String[] args) throws IOException {
  

        // Ask user to enter a message
       System.out.println("Enter a character: ");
       byte b[] = new byte[2];
		Scanner inputVal = new Scanner (System.in);
       int numRead = System.in.read(b);
        
 	
	 	
        System.out.println("The Unicode for the character  is " + b[0]);
  //      System.out.println("The Unicode for the character " + input0Val);

}
}

