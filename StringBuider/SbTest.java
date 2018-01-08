package it.my.StringBuider;

public class SbTest {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Java");
		sb.insert(0, "The latest").append("version is ").append("1.7").delete(27,28).append("8").substring(4);
		System.out.println(sb);
	}

}
