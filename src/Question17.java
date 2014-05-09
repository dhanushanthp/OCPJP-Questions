class Parent {
	long test(int i) {
		System.out.println("Parent(int)");
		return 0;
	}

	int test(long i) {
		System.out.println("Parent(int)");
		return 0;
	}
}

public class Question17 extends Parent {
	/**
	 * We can't do this because int is primitive type 
	 * 
	 */
	int test(int i) {
		System.out.println("Parent(int)");
		return 0;
	}

	int test(long i) {
		System.out.println("Parent(int)");
		return 0;
	}

}
