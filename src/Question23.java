class Animals{
	void run(int i){
		System.out.println("Animal");
	}
}

class Question23 extends Animal{
	void run(){
		System.out.println("Dog");
	}
	
	public static void main(String[]args) {
		Question23[] d = {new Question23(), new Question23()};
		Animal a = (Animals[]) d;
		a[2].run();
	}
}
