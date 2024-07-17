//ke2a04
//ヴゴックズイ
//2024/04/24

import java.util.Scanner;

class InvalidAdultException extends Exception {
	InvalidAdultException(String message) {
		super(message);
	}
}

public class Jv0203 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.print("年齢を入力してください>>");
		Scanner sc = new Scanner(System.in);    //準備入力用スキャナ
		
		try  {
			int age = sc.nextInt();   //ユーザ入力する年齢
			if(age < 18) {
				throw new InvalidAdultException("未成年です！！");
			}
			System.out.println("どうぞお入りください");
		} catch (InvalidAdultException e) {
			System.out.println(e);
		}
	}

}
