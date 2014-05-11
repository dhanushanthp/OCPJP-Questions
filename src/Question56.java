class In{
	private int i;
	public void setI(int ii){
		i = ii;
	}
	public int getI(){
		return i;
	}
}

class Out{
	private In i;
	public void setJ(In ii){
		i = ii;
	}
	public In getJ(){
		return i;
	}
}
public class Question56 {
	public static void main(String[]args) {
		Out o = new Out();
		In i = new In();
		int x =10;
		i.setI(10);
		o.setJ(i);
		i.setI(100);
		System.out.println(o.getJ().getI());
	}
}
