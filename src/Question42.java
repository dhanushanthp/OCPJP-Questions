
public class Question42 {
public static void main(String[]args) {
	int x = 100;
	int i ;
	for (i = 0; i < 200; i+=10) {
		x+=2;
		if(i == x)
			break;
		
		
	}
	System.out.println(x +  " "+ i);
}
}
