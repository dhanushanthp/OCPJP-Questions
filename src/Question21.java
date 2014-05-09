class Animal {
}

class Dog extends Animal {
}

class cat extends Animal {
}

public class Question21 {
	static void foo(Animal a) {
		System.out.println("Animal");
	}

	static void foo(Dog d) {
		System.out.println("Dog");
	}

	public static void main(String... args) {
		Animal a = new Animal();
		Dog d = new Dog();
		Animal ds = new Dog();
		Animal dd = null;
		foo(a);
		foo(d);
		foo(ds);
		foo(dd);
		foo(new cat());
	}
}
