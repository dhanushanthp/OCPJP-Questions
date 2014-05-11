
public class Question51 {
	static void doubleX(int x ){x = x*2;}
	static void doubleY(){y = y*2;}
	static int y =10;
	
	public static void main(String[]args) {
		int x = 9;
		doubleX(10);doubleY();System.out.println(x+y);
	}
	
}
