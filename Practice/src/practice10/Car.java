package practice10;

import java.util.Random;

public class Car {

	int serialNo;
	String color;
	int gasoline;

	int run() {
		Random rnd = new Random();
	    int ran = rnd.nextInt(15);

		return ran;
    };
}
