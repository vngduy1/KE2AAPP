//ke2a04
//ヴゴックズイ
//2024/04/26

import java.util.Scanner;

class InvalidAdultException extends Exception {
	InvalidAdultException(String message) {
		super(message);
	}
}

 class Person {
	int age;
	
	public Person() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public void setAge(int age) throws InvalidAdultException {
	
		if(age <= 0 || age > 100) {
		    throw new InvalidAdultException("Invalid Person");
		} else if (age > 0 && age < 18) {
			throw new InvalidAdultException("未成年です！！");
		} else {
			System.out.println("どうぞお入りください");
		}
		
		this.age = age;
	}
}

public class Jv0204 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.print("年齢を入力してください>>");
		Scanner sc = new Scanner(System.in);    //準備入力用スキャナ
		
		Person p = new Person();
		
		try  {
			int age = sc.nextInt();   //ユーザ入力する年齢
			p.setAge(age);
			
		} catch (InvalidAdultException e) {
			System.out.println(e);
		}
	}

}
