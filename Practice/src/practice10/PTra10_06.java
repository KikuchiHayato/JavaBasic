package practice10;
/*
 * PTra10_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra10_06 {

	/*
	 * PTra10_05で作成したCarクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * carインスタンスを3件作成し、それぞれの色、ガソリンを入力して決定してください
		 * 各carインスタンスのrunメソッドを実行して、それぞれ「目的地にまでn時間かかりました。残りのガソリンは、xリットルです」を出力してください。
		 */
		Car Car1 = new Car();
		Car1.color = "Blue";
		Car1.gasoline = 30;
		
		Car Car2 = new Car();
		Car2.color = "Green";
		Car2.gasoline = 45;
		
		Car Car3 = new Car();
		Car3.color = "Yellow";
		Car3.gasoline = 60;
		
		final int distance = 300;
		
		Car[] cars = new Car[3];
		
		cars[0] = Car1;
		cars[1] = Car2;
		cars[2] = Car3;
		
		for (int i = 0; i < cars.length; i++) {
			int sum = 0;
			int n = 0;

			while (cars[i].gasoline > 0) {
				int ran = cars[i].run();
				sum += ran;
				n++;
				cars[i].gasoline--;

				if ( cars[i].gasoline == 0) {
					System.out.println("目的地に到達できませんでした");
					break;
		        } else if (distance - sum < 0) {
		        	System.out.println("目的地まで" + n + "時間かかりました。" + "残りのガソリンは、" + cars[i].gasoline + "リットルです");
		        	break;
			    }
	        }
		}
	}
}
