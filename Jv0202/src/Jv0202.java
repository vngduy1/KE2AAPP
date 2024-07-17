//ke2a04
//ヴゴックズイ
//2024/04/24

import java.util.*;

public class Jv0202 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] score = new int[5];  //ユーザ入力の整数を最大５つ格納
		Scanner sc = new Scanner(System.in);    //準備入力用スキャナ
		
		try {
			int i = 0;
			while(true) {  //入力整数の格納先scoreの添え字
				System.out.print("整数を入力用してください>>");
				score[i] = sc.nextInt();
				System.out.print(score[i]);
				i++;
			}
		} catch (Exception e){
			System.out.println(e);
			e.printStackTrace();
		} 
	}

}
