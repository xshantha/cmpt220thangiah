/* Shantha Thangiah
 * CMPT220
 * Lab 6, Problem 9.1
 * This program works with pb 9.1, takes values, caculate, and pass it back to main program
 */
public class rectangle {
	 
    private double width;
    private double height;

    public rectangle() {
        this.width = 1.0;
        this.height = 1.0;
    }

    public rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    
    // return width
    public double getWidth() {
    	return width;
    }

    // returns height
    public double getHeight() {
    	return height;
    }

    // calculates area and return values
    public double getArea() {
        return this.width * this.height; 
    }

    // calculate perimeters and return value
    public double getPerimeter() {
        return this.width * 2 + this.height * 2;
    }
}