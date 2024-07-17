import java.util.HashSet;
import java.util.Random;

//ke2a04
//ヴゴックズイ
//2024/05/10

public class Jv0505 {
	public static void main(String[] args) {
        //標準入力から入力された文字列を格納する
        String str;

		//12か月の省略英語名
		String[] mon = {"Jan", "Feb", "Mar", "Abr", "May", "Jun",
				"Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
		// HashSet<String>型オブジェクト
        HashSet<String> months = new HashSet<>();

        // Random型オブジェクト
        Random rnd = new Random();

        // カウンタ変数 i 
        int i = 0;
        
        while (i < mon.length) {
            int yousu = rnd.nextInt(mon.length); // 0以上11以下の乱数を生成
            str = mon[yousu]; // 配列 mon からランダムな要素を取得

            if (months.add(str)) {
                i++; 
            } else {
                System.out.println("値\"" + str + "\"は既に格納済みです");
            }
        }

        // 結果を出力
        System.out.println("データがすべて格納されました");
        System.out.println(months);
	}
}
