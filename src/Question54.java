class Holders{
	int i ;
	Holders(int i){
		this.i= i;
	}
}


public class Question54 {
void swap(Holders h1,Holders h2){
	Holders tmp = h1;
	h1 = h2;
	h2 = tmp;
}
void swap(int x,int y){
	int tmp = x;
	x = y;
	y = tmp;
}

public static void main(String[]args) {
	Holders h3 = new Holders(10);
	Holders h4 = new Holders(20);
	int i = 9; int j = 99;
	new Question54().swap(h3, h4);
	new Question54().swap(i, j);
	System.out.println(h3.i + " " + h4.i);
	System.out.println(i + " " + j);
}
}
