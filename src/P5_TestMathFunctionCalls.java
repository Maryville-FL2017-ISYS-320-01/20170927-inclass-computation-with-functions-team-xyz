/*
	ISYS 320
	Name(s): Bradley Higdon, Jordan Poertner, Alex Hummel
	Date: 9/27/17
*/

/*
 5. Your predicted expression values:
 
 	1. 1.6
 	2. 36
 	3. 7
 	4. -5
 	5. 5
 	6. 8
 	7. 17
 	8. 14
  
All of our predictions were correct, but some answers had decimals which we did not expect
  
 */
public class P5_TestMathFunctionCalls {

	public static void main(String[] args) {
		System.out.println(Math.abs(-1.6));
		System.out.println(Math.pow(6, 2));
		System.out.println(Math.max(7, 3));
		System.out.println(Math.min(-2, -5));
		System.out.println(Math.min(6, 3 + 2));
		System.out.println(Math.sqrt(64));
		System.out.println(13 + Math.abs(-7) - Math.pow(2, 3) + 5);
		System.out.println(Math.max(18 - 5, Math.ceil(4.6 * 3)));
	}

}
