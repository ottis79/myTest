package it.my.test29Nov;

public class Q5 {
	public static void main(String[] args) {
		System.out.println(16 >>> 3);
		// 10000 16 in binario
		// shift a destra di tre posizioni -> 10
		// il risultato è 2

		System.out.println(16 << 2); // shift a sx di due posizioni conservando
										// il segno
		System.out.println(16 >> 2); // shift a dx di due nposizioni conservando
										// il segno

		System.out.println(-16 >> 2);
	}
}
