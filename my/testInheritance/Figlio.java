package my.testInheritance;

public class Figlio extends Padre{
	@Override
	void test(int i) throws RuntimeException{ //private non va bene perch� non pu� essere pi� restrittivo
		System.out.println(i);
	}
}
