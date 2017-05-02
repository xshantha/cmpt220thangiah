/* Shantha Thangiah
 * CMPT220
 * Lab 5, Problem 8.10
 * This program find largest row and column
 */

public class lab5pb8_10 {
    public static void main(String[] args) {
		System.out.println("CMPT220 - Software Development I"); // This is to display the course ID
		System.out.println("Lab 5, Problem 8.10\n"); // This is to display the lab and pb numbers


        int[][] matrix = new int[4][4];
        int largestRI = 0;
        int largest = -1;
        for (int i = 0; i < matrix.length; i++) {
            int rowCount = 0;
            for (int k = 0; k < matrix[i].length; k++) {
                matrix[i][k] = (int)(Math.random() * 2);
                rowCount += matrix[i][k];
            }
            if (rowCount > largest) {
                largestRI = i;
                largest = rowCount;
            }
        }

        int largestCI = 0;
        largest = -1;
        for (int k = 0; k < matrix[0].length; k++) {
            int columnCount = 0;
            for (int i = 0; i < matrix.length; i++) {
                columnCount += matrix[i][k];
            }
            if (columnCount > largest) {
                largest = columnCount;
                largestCI = k;
            }

        }
        for (int i = 0; i < matrix.length; i++) {
            for (int k = 0; k < matrix[i].length; k++) {
                System.out.printf("%d", matrix[i][k]);
            }
            System.out.printf("\n");
        }
        System.out.println("The largest row index: " + largestRI);
        System.out.println("The larges column index: " + largestCI);
    }
}    

