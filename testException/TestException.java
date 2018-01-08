package it.my.testException;

public class TestException {
	
	public static void main(String []args){
		TestException t = new TestException();
		try {
			t.t1();
		} catch (Exception1 e) {
			e.printStackTrace();
		}	
	}
	
	public void t1() throws Exception1{
		t2();
	}
	
	public void t2() throws Exception1{
		t3();
	}
	
	public void t3() throws Exception1{
			throw new Exception1();
	}
}
