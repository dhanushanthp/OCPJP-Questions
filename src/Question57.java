import java.awt.Shape;


public class Question57 {
	public static void main(String[]args) {
		Question57 s = new Triangle();
		Question57 t = new Square();
		Circle c = new Circle();
		
		System.out.println(s instanceof Circle);
		Square ss =(Square)t;
		//Circle d = (Circle)s;
	//	Square st = t;
	System.out.println(Square instanceof Shape);
	}
}

class Triangle extends Question57{
	
}

class Square extends Question57{
	
}

class Circle extends Question57{
	
}
