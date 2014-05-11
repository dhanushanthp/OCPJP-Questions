class Foo{
	private int i;
	public Foo(int ii){
		i = ii;
	}
	public void setI(int ii){
		i = ii;
	}
	public int getI(){
		return i;
	}
}


public class Question55 {
 static Foo fooBar(Foo foo){
	 foo = new Foo(100);
	 return foo;
 }
 
 public static void main(String[]args) {
	Foo foo = new Foo(300);
	System.out.println(foo.getI());
	
	Foo foo2 = fooBar(foo);
	System.out.println(foo.getI());
	System.out.println(foo2.getI());
	
	foo = fooBar(foo2);
	System.out.println(foo.getI());
	System.out.println(foo2.getI());
}
}

