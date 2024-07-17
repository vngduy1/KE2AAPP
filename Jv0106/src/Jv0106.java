//ke2a04
//ヴゴックズイ
//2024/04/17

public class Jv0106 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String str = "Javaの学習"; //Stringグラスのメゾットが利用する文字列データ
		System.out.println(str.length());  //strの文字数を出力
		
		System.out.println(str.indexOf("学習"));  //文字列“学習”がstrの何文字目以降りに
		System.out.println(str.indexOf("Ruby"));  //文字列“Ruby”がstrの何文字目以降りに
		
		System.out.println(str.contains("学習"));  //文字列“学習”がstrにあうかどうか
		System.out.println(str.contains("Ruby"));  //文字列“Ruby”がstrにあうかどうか
		
		//String str = "Javaの学習"; String
		
		System.out.println(str.replace("Java", "Java言語"));  
		//strに含まれる文字列"Java"を"Java言語"に置き換えて出力
		
		/* String */  str = "2020/11/22";  //split()メゾットに利用する文字列データ
		String[] items = str.split("/");  //strを"/"のところで分割りした文字列データの配列
		for(int i = 0; i < items.length; i++) {
			System.out.println(items[i]);
		}
	}

}
