package conditionals;

public class BlackJack {

	public static int play(int p1, int p2) {
		if (p1 > 21 && p2 > 21) {
			return 0;
		} else if (p1 > 21) {
			return p2;
		} else if (p2 > 21) {
			return p1;
		} else if (p1 > p2) {
			return p1;
		} else {
			return p2;
		}
	}

	public static void main(String[] args) {
		System.out.println(play(22, 22)); // 0

		System.out.println(play(22, 20)); // 20
		System.out.println(play(19, 22)); // 19

		System.out.println(play(18, 12)); // 18
		System.out.println(play(12, 16)); // 16

		System.out.println(play(17, 17)); // 17
	}

}