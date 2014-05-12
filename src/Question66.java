import java.util.Iterator;

public class Question66 {
	public static void main(String[] args) {
		Integer[] a = new Integer[] { 1, 3, 5 };
		Number[] n = a;
		n[2] = new Integer(0);
		a = (Integer[]) n;
		for (int i : a) {
			System.out.println(i);
		}
	}
}
