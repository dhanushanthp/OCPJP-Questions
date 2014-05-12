class Fruits {
	void eat() {
		System.out.println("eating Friut");
	}
}

public class Question69 extends Fruits {
	void eat() {
		System.out.println("eating Mango");
	}

	public static void main(String[] args) {
		Question69 [] m = new Question69[]{new Question69()};
		Fruits [] f = m;
		f[0].eat();
	}
}
