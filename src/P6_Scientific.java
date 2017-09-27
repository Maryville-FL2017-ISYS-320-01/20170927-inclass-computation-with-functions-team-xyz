/*
	ISYS 320
	Name(s): Bradley Higdon, Jordan Poertner, Alex Hummel
	Date: 9/27/17
*/

public class P6_Scientific {

	public static void main(String[] args) {
		System.out.print((int) computeScientificValue(6.5, 3));

	}

	private static double computeScientificValue(double base, int expo) {
		return base * Math.pow(10, expo);

	}
}
