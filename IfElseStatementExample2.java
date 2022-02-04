package conditionalStatements;

public class IfElseStatementExample2 {

	public static void main(String[] args) {
	
		int a = 30;
		int b = 20;
		System.out.println("a value is :" +a);
		System.out.println("b value is :" +b);
		if(a<b) {
			System.out.println("Biggest Number is:" +b);
		}
		else if(a>b) {
			System.out.println("Biggest Number is:" +a);
		}
		else {
			System.out.println("Both are equal");
		}
	}

}
