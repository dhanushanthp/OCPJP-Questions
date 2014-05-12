class Animall{
	
}

class Cat extends Animall{}
class Dog extends Animall{}
public class Question60 {
 public static void main(String[]args) {
	Dog d = new Dog();
	Animall a = d;
	System.out.println(a instanceof Dog);
}
}
