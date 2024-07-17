import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

//ke2a04
//ヴゴックズイ
//2024/05/10

public class Jv0504 {

	public static void main(String[] args) {
		//標準入力から入力された文字列を格納する
		String str;
		//12か月の省略英語名
		String[] mon = {"Jan", "Feb", "Mar", "Abr", "May", "Jun",
				"Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
		
		Scanner sc = new Scanner(System.in);  //準備入力用スキャナ
		Random rnd = new Random();      //Ramdomスキャナ
		//monの要素を格納する配列リスト
		HashSet<String> months = new HashSet<String>();   //要素を格納するため
		
		while (true) {
			int x = rnd.nextInt(12);  // 0以上11以下の整数
			months.add(mon[x]);
			
            System.out.println("月の英語名をどれか１つ，３文字で入力して下さい");
            str = sc.nextLine();
            
            if (months.contains(str)) {
                System.out.println("あたり！");
                break;
            } else {
                System.out.println("はずれ！もう一回入力してください");
            }
        }
	}

}
