
class Super{
	public Super() {
		foo();
		}
		void foo() {System.out.println("Super");}

}

public class Question37 extends Super {
	void foo(){System.out.println("PreMature");}
	public static void main(String[]args) {
		new Question37();
	}
}
