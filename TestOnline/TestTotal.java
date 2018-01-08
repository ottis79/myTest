package it.my.TestOnline;

public class TestTotal {
	static int total=10;
	public static void main(String[] args) {
		new TestTotal();
	}
	public TestTotal(){
		System.out.println("In test");
		System.out.println(this);
		int temp=this.total;
		if(temp>5)
			System.out.println(temp);
	}

}
