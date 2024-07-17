//ke2a04
//ヴゴックズイ
//2024/04/12

public class Jv0105 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String s1 = new String("こんにちは");    //データが「こんにちは」である文字列オプジェクブ
		String s2 = new String("こんにちは");    //上と同じデータだが別の文字列オプジェクブ
		System.out.println(s1 == s2);  //--> false
		
		String s3 = "こんにちは";     //教科書では下段s1
		String s4 = "こんにちは";     //              s2
		System.out.println(s3 == s4);  //--> true
		//s3 と s4 が「==」すなわち同じインスタンスならtrue違うならfalse

	}

}
