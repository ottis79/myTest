package it.my.TestOnline;

public class LabelLoop {
	public static void add(int a){
		loop:for(int i=0;i<3;i++)
			for(int j=0; j<3;j++){
				if(a==5)
					break loop;
				System.out.println(i*j);
			}
	}
	
	public static void main(String[] args) {
		LabelLoop.add(5);
		boolean test=false;
		if(test=true)
			System.out.println("true");
	}

}
