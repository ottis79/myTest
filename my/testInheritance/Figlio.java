package my.testInheritance;

public class Figlio extends Padre{
	@Override
	void test(int i) throws RuntimeException{ //private non va bene perchè non può essere più restrittivo
		System.out.println(i);
	}
}
