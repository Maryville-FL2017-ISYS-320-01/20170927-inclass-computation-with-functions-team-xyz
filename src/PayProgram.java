
public class PayProgram {

	public static void main(String[] args) {

		double salary = 4.00;
		int hours = 9;

		System.out.print(computePay(salary, hours));

	}

	public static double computePay(double salary, int hours) {
		for (int num = hours; num > 8; num--) {
			return ((8 * salary) + (hours - 8) * salary * 1.5);
		}
		return hours * salary;
	}

}
