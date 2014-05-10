
public class Question45 {
	static int doubleInt(int i){return i*=2;}
	static int givenTen(int j){return 10;}
	public static void main(String[]args) {
		int i , j;
		i = 10;i = doubleInt(i);
		j = givenTen(j);
		System.out.println(i + j);
	}
}
