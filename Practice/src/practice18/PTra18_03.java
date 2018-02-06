/*
 * PTra18_03.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import practice18.entity.Player;

public class PTra18_03 {

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

		// ★ ①のArrayListの中から"レアル・マドリード", "バルセロナ"の選手を除外してください
        Iterator<Player> i = array.iterator();
        while(i.hasNext()){
            Player player = i.next();
            String team = player.getTeam();

            if(team.startsWith("レアル・マドリード") || team.startsWith("バルセロナ")){
                i.remove();
            }
        }

		// ★ 削除後のArrayListの中身を全件出力してください
        for(Player informent : array){
            System.out.println(informent);
        }

	}
}
