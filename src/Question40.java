class Parentss{
	int i = 10;
}

public class Question40 extends Parentss {
int i = 100;

public static void main(String[]args) {
		int i = 1000;
		System.out.println(""+i+this.i+ super.i);
}
}
