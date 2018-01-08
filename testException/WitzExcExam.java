package it.my.testException;

public class WitzExcExam {

	public static void run() throws Exception{
		throw new Exception();
	}
	
	public static void main(String[] args) {
		try {
			run();
		} catch (RuntimeException e) {
			System.out.println("runtime");
		}catch (Exception e) {
			System.out.println("exception");
		}finally{
			System.out.println("finally");
		}
		System.out.println("end");
	}

}
