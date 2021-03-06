package practice11;
/*
 * PTra11_02.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra11_02 {
	public static void main(String[] args) {

		// ★ ReadFileClassのクラスメソッドreadBookDataFile()を使い、本情報を取得します
		Book[] bookList = FileReaderClass.readBookDataFile();


		System.out.println("探したい本のタイトル（又はその一部）を入力してください");

		// ★ ユーザが入力した文字列が、本情報のタイトル一部に含まれていた場合は、その本情報を出力してください
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		String line = scanner.nextLine();

		for (int a = 0; a < bookList.length; a++) {
			if (bookList[a].title.indexOf(line) != -1) {
				System.out.println(bookList[a].dispBookInfo());
			}
		}
	}
}
