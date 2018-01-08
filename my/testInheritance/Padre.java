package my.testInheritance;

public class Padre {
	
	void test(int i) throws Exception{
		System.out.println(i);
	}
	
	void test(long l){
		System.out.println(l);
	}
	
	long test(long l, long l2) throws IllegalArgumentException{
		System.out.println(l);
		return l;
	}
	
	int test(int i, String s) throws Exception{
		return i;
	}

}
