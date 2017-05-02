/* Shantha Thangiah
 * CMPT220
 * Lab 5, Problem 8.7
 * This program to find points nearest to each other
 */
import java.util.Scanner;
public class lab5pb8_07 {
   
	public static void main(String[] args) {
		System.out.println("CMPT220 - Software Development I"); // This is to display the course ID
		System.out.println("Lab 5, Problem 8.7\n"); // This is to display the lab and pb numbers

		// values given on the book
		double[][] points = {{-1, 0, 3}, {-1, -1, -1}, {4, 1, 1},
		    {2, 0.5, 9}, {3.5, 2, -1}, {3, 1.5, 3}, {-1.5, 4, 2},
		    {5.5, 4, -0.5}};

		int p1 = 0, p2 = 1; // Initial two points
		double shortestDistance = distance(points[p1][0], points[p1][1],
				points[p1][2], points[p2][0], points[p2][1], points[p2][2]);
				// Initialize shotestDistance

		for (int i = 0; i < points.length; i++) {
			for (int j = i + 1; j < points.length; j++) {
				double distance = distance(points[i][0], points[i][1],
						points[i][2], points[j][0], points[j][1], points[j][2]);  
				if (shortestDistance > distance) {
				     p1 = i; // update p1 initial points
				     p2 = j; // update p2 initial points
				     shortestDistance = distance;
				}
			}
		}

		// Display result
		System.out.println("The closest two points are " + 
				"(" + points[p1][0] + ", " + points[p1][1] +  ") and (" +
				points[p2][0] + ", " + points[p2][1] + ")");
 }
	 // Compute the distance
	 public static double distance(
			 double x1, double y1, double z1, double x2, double y2, double z2) {
		 return Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2) + Math.pow((z2 - z1),2));
	 }
}
