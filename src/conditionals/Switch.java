package conditionals;

public class Switch {

	public static void main(String[] args) {
		int dayOfWeek = 6;

		if (dayOfWeek == 1) {
			System.out.println("MONDAY");
		} else if (dayOfWeek == 2) {
			System.out.println("TUESDAY");
		} else if (dayOfWeek == 3) {
			System.out.println("IT IS WEDNESDAY MY DUDES");
		} else if (dayOfWeek == 4) {
			System.out.println("THURSDAY");
		} else if (dayOfWeek == 5) {
			System.out.println("FRIDAY");
		} else if (dayOfWeek == 6) {
			System.out.println("SATURDAY");
		} else if (dayOfWeek == 7) {
			System.out.println("SUNDAY");
		}

		switch (dayOfWeek) {
		case 1:
			System.out.println("MONDAY");
			break;
		case 2:
			System.out.println("TUESDAY");
			break; // exit switch
		case 3:
			System.out.println("IT IS WEDNESDAY MY DUDES");
			break;
		case 4:
			System.out.println("THURSDAY");
			break;
		case 5:
			System.out.println("FRIDAY");
			break;
		case 6:
			System.out.println("SATURDAY");
			break;
		case 7:
			System.out.println("SUNDAY");
			break;
		default:
			System.out.println("ONLY 7 DAYS IN THE WEEK YOU MUPPET");
		}

		String s = "a";

		switch (s) {
		case "a":
			System.out.println("yo");
			break;
		}
	}

}
