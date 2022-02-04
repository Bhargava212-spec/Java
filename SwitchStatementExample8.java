package conditionalStatements;

public class SwitchStatementExample8 {
//case value must be either direct constant or final constant
	public static void main(String[] args) {
	final int i = 50, j=10, k=15, m=20;
		switch (10) {

		case i:
			System.out.println("Five");
			break;
		case j:
			System.out.println("Ten");
			break;
		case k:
			System.out.println("Fifteen");
			break;
		case m:
			System.out.println("Twenty");
			break;
		}
	}

}
