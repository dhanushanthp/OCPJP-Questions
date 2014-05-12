interface RaceAble{
	void race();
}

class Catsss implements RaceAble{

	@Override
	public void race() {
		System.out.println("Cat");
		
	}
	
}

class kitty extends Catsss{}
public class Question67 implements RaceAble{
public void race(){
	System.out.println("Man");
}

public static void main(String[]args) {
	RaceAble [] runner = new RaceAble[3];
	runner[0] = new Catsss();
	runner[1] = new kitty();
	runner[2] = new Question67();
	for (RaceAble raceAble : runner) {
		raceAble.race();
	}
}
}
