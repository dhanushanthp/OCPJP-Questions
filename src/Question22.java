class Parents {
	public void draw() throws Exception {
		System.out.println("Parent-9");
	}

	public void draw(long i) {
		System.out.println("Parent-i");
	}
}

public class Question22 extends Parents {
	public void draw() {
		System.out.println("Child");
	}

	public void draw1(int i) {
		System.out.println("Child-i");
	}
	
	

	public static void main(String[] args) throws Exception {
		Parents p = new Question22();
		p.draw();
		int x = 10;
		p.draw(x);
	}
}
