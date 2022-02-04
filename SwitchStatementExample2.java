package conditionalStatements;

public class SwitchStatementExample2 {
	
	/*
	 * boolean short long float double are not allowed in switch statement as
	 * parameter
	 */

	public static void main(String[] args) {
		
		char c = 'B';
		switch (c) {

		case 'A':
			System.out.println("AAA");
			break;
		case 'B':
			System.out.println("BBB");
			break;
		case 'C':
			System.out.println("CCC");
			break;
		case 'D':
			System.out.println("DDD");
			break;
		default:
			System.out.println("Default");
		}


	}

}
