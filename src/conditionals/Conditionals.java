package conditionals;

public class Conditionals {

	public static void main(String[] args) {
		// ! == NOT (turns false into true and true into false)
		int i = 29;
		boolean b = false;
		if (!b) {
			System.out.println("hello");
		}
		System.out.println(true);
		System.out.println(!true);

		// || === boolean OR
		if (true || false) {
			System.out.println("true || false");
		}
		// && === boolean AND
		if (true && false) {
			System.out.println("true && false");
		}
		if (i % 2 == 0) {
			System.out.println("Even");
		} else if (i > 10) {
			System.out.println("> 10");
		} else if (i % 2 != 0) {
			System.out.println("Odd");
		} else {
			System.out.println("What kinda number is this!?");
		}
	}

}
