package conditionalStatements;

public class IfElseStatementExample3 {

	public static void main(String[] args) {
		//Biggest among 3 Numbers
		
		int a = 10;
		int b = 20;
		int c = 30;
		
		if(a>b) {
			System.out.println("A is biggest Number");
		}
		else if(b>c) {
			System.out.println("b is biggest Number");
		}
		else if(c>a) {
			System.out.println("c is biggest Number");
		}
		else {
			System.out.println("All are equal");
		}
	}

}
