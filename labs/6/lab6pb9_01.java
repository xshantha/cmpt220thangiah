/* Shantha Thangiah
 * CMPT220
 * Lab 6, Problem 9.1
 * This program calculates area and perimeter and display
 */ 

public class lab6pb9_01 {

    public static void main(String[] args) {
    	System.out.println("CMPT220 - Software Development I"); // This is to display the course ID
        System.out.println("Lab 6, Problem 5.1\n"); // This is to display the lab and pb numbers
    	
        // passing values to rectangle class to calculate
        rectangle[] rectangles = new rectangle[2];
        rectangles[0] = new rectangle(4, 40);
        rectangles[1] = new rectangle(3.5, 35.9);

        // This is loop to retrieve data from rectangle class and display 
        for (int i = 0; i < 2; i++){
            System.out.println("Rectangle " + (i+1) +":");
            System.out.println("\t Width\t   =    " + rectangles[i].getWidth());
            System.out.println("\t Height    =   " + rectangles[i].getHeight());
            
            System.out.printf("\t Area\t   = %6.1f", rectangles[i].getArea());
            System.out.println("\n\t Perimeter =   " +  rectangles[i].getPerimeter() +"\n");
        }
    }
}

