package it.my.StringBuider;

public class MyStringBuilder {
	
	public static void main(String [] ciccio){
		StringBuilder sb = new StringBuilder(200); //capacity
		sb.append(false);
		sb.append('C');
		sb.append('c');
		sb.append("te saluto");
		System.out.println(sb.toString());
		System.out.println(sb);
		System.out.println(sb.reverse());
		System.out.println(sb.replace(10/*start*/, 11/*end*/, "bu"));
	}
}
