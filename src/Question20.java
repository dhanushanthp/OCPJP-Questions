import java.util.Vector;

class Vehicle {
}

class Car extends Vehicle {
}

class Base {
	Vehicle method(int i) {
		System.out.println("Vehicle");
		return new Car();
	}
}

public class Question20 extends Base {
	Car method(int i) {
		System.out.println("Car");
		return null;
	}

	public static void main(String[] arg) {
		Base b = new Question20();
		Vehicle v = new Base().method(3);
		/**
		 * We can convert vehicle to car and 
		 * 
		 */
		Car c = b.method(3);
	}
}