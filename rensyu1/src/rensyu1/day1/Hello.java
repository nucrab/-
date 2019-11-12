package rensyu1.day1;

public class Hello{
	public static void main (String[] args) {
		Base b = new Base();
		Hawaiian h = new Hawaiian();
		System.out.print("Hawaiian says: ");
		System.out.print(b.outputHello() + " is " + h.outputHello());
		
		Korean k = new Korean();
		System.out.print("\nKorean says: ");
		System.out.print(b.outputHello() + " is " + k.outputHello());
		
		Japanese j = new Japanese();
		System.out.print("\nJapanese says: ");
		System.out.print(b.outputHello() + " is " + j.outputHello());
	}
	
}

