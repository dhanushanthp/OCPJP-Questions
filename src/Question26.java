public class Question26 {
	int i;

	Question26(){}
	Question26(int i) {
		//This will give compilcation error.
		this();
		System.out.println(i);
		this.i = i;
	}

	public static void main(String[] args) {
		Question26 q = new Question26(10);
		System.out.println(q.i);
	}
}
