/*
 * PTra18_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

import practice18.entity.Player;

public class PTra18_04 {

	/*
	 * PTra19_02で作成したPlayerクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * ①
		 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */
		ArrayList<Player> array = new ArrayList<>();
        try(Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"))) {
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                String[] PlayerList = line.split(",", 0);
                Player player = new Player();
                player.setPosition(PlayerList[0]);
                player.setName(PlayerList[1]);
                player.setCountry(PlayerList[2]);
                player.setTeam(PlayerList[3]);

                array.add(player);
            }
        } catch (FileNotFoundException e) {
            System.out.println("ファイルが見つかりません");
        }

		// ★ ①のArrayListの中からGK1名、DF4名、MF4名, FW2名をランダムで出力してください
        Collections.shuffle(array);

        int GK = 0;
        int DF = 0;
        int MF = 0;
        int FW = 0;

        Iterator<Player> i = array.iterator();
        while(i.hasNext()){
            Player player = i.next();

            switch (player.getPosition()) {
            case "GK":
            	if (GK < 1) {
            		System.out.println(player);
                	GK++;
            	}
            	break;

            case "DF":
            	if (DF < 4) {
            		System.out.println(player);
                	DF++;
            	}
            	break;

            case "MF":
            	if (MF < 4) {
            		System.out.println(player);
                	MF++;
            	}
                break;

            case "FW":
            	if (FW < 2) {
            		System.out.println(player);
                	FW++;
            	}
                break;
            }
        }
	}
}
