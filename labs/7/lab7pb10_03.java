/* Shantha Thangiah
 * CMPT220
 * Lab 7, Problem 10.3
 * This program test odd, even, prime numbers and converting data types.
 */ 

public class lab7pb10_03 {

	public static void main(String[] args) {

		System.out.println("CMPT220 - Software Development I"); // This is to display the course ID
        System.out.println("Lab 7, Problem 10.3\n"); // This is to display the lab and pb numbers

		MyInteger numero1 = new MyInteger(5);
    	MyInteger numero2 = new MyInteger(5);
    	MyInteger numero3 = new MyInteger(25);

        System.out.printf("\t1st Number = %d\t isPrime: %b \t isOdd: %b \t isEven %b\n",
        		numero1.getValue(), numero1.isPrime(), numero1.isOdd(), numero1.isEven());

        System.out.printf("\t2nd Number = %d\t isPrime: %b \t isOdd: %b \t isEven %b\n",
        		numero2.getValue(), numero2.isPrime(), numero2.isOdd(), numero2.isEven());
        System.out.printf("\t3rd Number = %d\t isPrime: %b \t isOdd: %b \t isEven %b\n",
        		numero3.getValue(), numero3.isPrime(), numero3.isOdd(), numero3.isEven());

        System.out.printf("\n\tIs 1st Number = 2nd Number? %b\n", numero1.equals(numero2));
        System.out.printf("\tIs 1st Number = 3rd Number? %b\n", numero1.equals(numero3));
        System.out.printf("\n\tConverting an array of numeric characters 500 to an integer value: %d\n", MyInteger.parseInt("500"));
        System.out.printf("\tConverting a string 900 into an integer value: %d\n", MyInteger.parseInt("900".toCharArray()));
    }
}

class MyInteger {
    private int value;
    public MyInteger(int value){this.value = value;}
    public int getValue() {return value;}
    public void setValue(int value) {this.value = value;}
    public boolean isEven() {return value % 2 == 0;}
    public boolean isOdd() {return !isEven();}
    public boolean isPrime() {
        double range = Math.sqrt(value);
        for (int i = 2; i < range; i++) {
            if (value % i == 0) return false;
        }
        return true;
    }

    public static boolean isEven(int value) {return value % 2 == 0;}
    public static boolean isOdd(int value) {return !isEven(value);}
    public static boolean isPrime(int value) {
        double range = Math.sqrt(value);
        for (int i = 2; i < range; i++) {
            if (value % i == 0) return false;
        }
        return true;
    }

    public static boolean isEven(MyInteger myInteger) {return myInteger.isEven();}
    public static boolean isOdd(MyInteger myInteger) {return myInteger.isOdd();}
    public static boolean isPrime(MyInteger myInteger) {return myInteger.isPrime();}
    public boolean equals(int value) {return this.value == value;}
    public boolean equals(MyInteger myInteger) {return this.value == myInteger.value;}

    public static int parseInt(char[] value) {
        double valueDouble = 0;
        int toPower = value.length - 1;
        for (char aValue : value) {valueDouble += Math.pow(10, toPower--) * (aValue - '0');}
        return (int)valueDouble;
    }
    public static int parseInt(String value) {return MyInteger.parseInt(value.toCharArray());}
}