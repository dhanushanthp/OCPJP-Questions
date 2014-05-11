

class Item{
	int i;
	Item(int i){
		this.i= i;
	}
}

class Holder{
	Item t;
	
}


public class Question53 {
static void modify1(Holder h){h.t = new Item(100);}
static void modify2(Item t){t = new Item(1000);}
static void modify3(int i){i = 10000;}

public static void main(String[]args) {
	Holder h = new Holder();
	h.t = new Item(10);
	System.out.println(h.t.i);
	modify1(h);
	System.out.println(h.t.i);
	modify2(h.t);
	System.out.println(h.t.i);
	modify3(h.t.i);
	System.out.println(h.t.i);
}
}
