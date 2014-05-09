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
	// This is not working
	int test(int i) {
		System.out.println("Parent(int)");
		return 0;
	}

	int test(long i) {
		System.out.println("Parent(int)");
		return 0;
	}

}
