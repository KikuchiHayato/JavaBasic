/*
 * PTra16_02.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice16;

public class PTra16_02 {
	public static void main(String[] args) {

		boolean b = true;
		byte by = 100;
		short s = 300;
		char c = '日';
		int i = 1000;
		long l = 2000L;
		float f = 3.14F;
		double d = 453.592;

		// ★ 上記基本型を、それぞれのラッパークラスに代入してください
		Boolean numBoolean = b;
		Byte numByte = by;
		Short numShort = s;
		Character numCharacter = c;
		Integer numInteger = i;
		Long numLong = l;
		Float numFloat = f;
		Double numDouble = d;

		System.out.println(numBoolean);
		System.out.println(numByte);
		System.out.println(numShort);
		System.out.println(numCharacter);
		System.out.println(numInteger);
		System.out.println(numLong);
		System.out.println(numFloat);
		System.out.println(numDouble);
	}
}
