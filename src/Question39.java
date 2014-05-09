class Flower{
	int i = 10;
	Flower(){
		i = 100;
		foo();
	}
	
	public void foo(){
		System.out.println("Flower " + i);
	}
}


public class Question39 extends Flower{
	int i = 200;
	
	Question39(){
		i = 300;
		System.out.println("exe");
	}
	
	public void foo() {
		System.out.println("Rose " + i);
	}
	
	public static void main(String[]args) {
		new Question39();
	}
}
