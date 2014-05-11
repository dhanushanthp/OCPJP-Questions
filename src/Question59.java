interface Washable{void wash();}


public class Question59 implements Washable{
public void wash(){
	System.out.println("Washing");
	
}
public static void main(String[]args) {
	Question59 c = new volvl();
	Washable w = c;
	w.wash();	
}
}


class volvl extends Question59{
	public void wash(){
		System.out.println("shinning");
	}
}