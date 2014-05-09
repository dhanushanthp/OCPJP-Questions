
public class Question38 {
	
	int i = setValue(10);
	
	{
		i = setValue(20);
	}
	
	Question38() {
		i = setValue(30);
	}
	
	int j = setValue(40);
	public static void main(String[]args){
		Question38 s = new Question38();
		System.out.println(s.i);
	}
	
	private static int setValue(int val){
		System.out.println(val);
		return val;
	}
}
