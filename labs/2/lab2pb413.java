/*	Shantha Thangiah
	Lab 2: Selections, Mathematical Functions, Characters and Strings / Problem 4.13
	This program identifies the input letter is a vowel or consonant
	CMPT220 Software Development I */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class lab2pb413 {
    public static void main(String[] args) throws Exception 
    {
        char n;
		System.out.println("Lab 2: Problem 4.13\n"); 
		  // Prints title
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a letter: ");
        n = (char) bf.read();
        switch(n)
        {
            case 'a':
            case 'A':
            	System.out.println(n + " is a vowel");
            	break;
            	
            case 'e':
            case 'E':
            	System.out.println(n + " is a vowel");	            
            	break;

            case 'i':
            case 'I':
            	System.out.println(n + " is a vowel");	
            	break;

            case 'o':
            case 'O':	
            	System.out.println(n + " is a vowel");	
            	break;

            case 'u':
            case 'U':
            	System.out.println(n + " is a vowel");	
            	break;

            default:
            System.out.println(n+" is a consonant");
            break;
        }
    }
}