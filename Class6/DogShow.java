package Class6;

class Dog{
	public void bark() {
		System.out.println("Woof");
	}
}
class Hound extends Dog{
	public void sniff() {
		System.out.println("sniff");
	}
	public void bark() {
		System.out.println("howl");
	}
}

public class DogShow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new DogShow().go();
	}
	void go() {
		new Hound().bark();
		((Dog)new Hound()).bark();
		((Hound)new Hound()).sniff();
	}

}
