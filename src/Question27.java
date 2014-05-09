public class Question27 {
	Question27(int i) {
		System.out.println("Super");
	}
}

class Sub extends Question27 {
	
	Sub() {
	super(0);
	}
}
