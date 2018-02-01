/*
 * PTra13_09.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice13.ptra13;

import practice13.common.Employee;

public class PTra13_09 {

	/*
	 * ★ PTra13_08で作成したEmployeeクラスを使用します
	 */

	/** 名前データ（定数） */
	public static final String[] NAMEDATA = {"山田", "佐藤", "小林"};

	/** メールデータ（定数） */
	public static final String[] MAILDATA = {"yamada@hoge.com","satou@hoge.com","kobayashi@hoge.com"};

	/** パスワードデータ（定数） */
	public static final String[] PASSDATA = {"rezo0001","rezo0002","rezo0003"};

	/** 部署データ（定数） */
	public static final String[][] QUATERDATA = {
														{"総務部","業務部","システム部"},
														{"5","10","35"},
													};

	/**
	 * エントリーポイント
	 * @param args
	 */
	public static void main(String[] args) {

		// ★ 定数で定義されている各データを使用して、Employeeインスタンスを３つ作成してください
		Employee[] Employees = new Employee[3];
		
		for (int i = 0; i < Employees.length; i++) {
			Employee employee = new Employee();
			Employees[i] = employee;
			
			Employees[i].setUserNm(NAMEDATA[i]);
			Employees[i].setMail(MAILDATA[i]);
			Employees[i].setPassword(PASSDATA[i]);
			Employees[i].setDepartmentNm(QUATERDATA[0][i]);
			Employees[i].setDepartmentCnt(Integer.parseInt(QUATERDATA[1][i]));
			
		}
		for (int a = 0; a < Employees.length; a++) {
			System.out.println(Employees[a].getUserNm());
			System.out.println(Employees[a].getMail());
			System.out.println(Employees[a].getPassword());
			System.out.println(Employees[a].getDepartmentNm());
			System.out.println(Employees[a].getDepartmentCnt());
		}
	}
}
