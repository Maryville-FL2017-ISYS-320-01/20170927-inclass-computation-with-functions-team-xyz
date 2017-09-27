/*
	ISYS 320
	Name(s): Bradley Higdon, Jordan Poertner, Alex Hummel
	Date: 9/27/17
*/

/*
 What were the errors you found?
 Void - It was a method, not a function
 There was no return in the function
 The value of tempc was not being changed in main
 
 */

public class P4_FixTempConverter {
	public static void main(String[] args) {
		double tempf = 98.6;
		double tempc = 0.0;
		tempc = ftoc(tempf, tempc);
		System.out.println("Body temp in C is: " + tempc);
	}

	// converts Fahrenheit temperatures to Celsius
	public static double ftoc(double tempf, double tempc) {
		return tempc = (tempf - 32) * 5 / 9;
	}
}
