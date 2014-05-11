
public class Question52 {
 void method(String s1){s1 = "World";}
 
 public static void main(String[]args) {
	String s1 = "Hello";
	new Question52().method(s1);
	System.out.println(s1 + " World");
}
}
