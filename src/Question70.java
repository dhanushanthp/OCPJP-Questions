class Vi{}
class Bu extends Vi{}
class Ca extends Vi{}

public class Question70 {
public static void main(String[]args) {
	Vi [] v1 = new Ca[0];
	Vi [] v2 = {new Bu(), new Bu()};
	Ca[] c1 = (Ca[]) v1;
	Bu[] b1 = (Bu[])v2;
}
}
