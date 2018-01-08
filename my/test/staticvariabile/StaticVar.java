package my.test.staticvariabile;

public class StaticVar {
	static int x=10;
	public static void main(String [] args){
		int x=100;
		System.out.println(x);
		System.out.println(StaticVar.x);
	}
}
