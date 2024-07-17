
import java.util.ArrayList;

//ke2a04
//ヴゴックズイ
//2024/05/08

public class Jv0501 {
	public static void main(String[] args) {
		//12か月の省略英語名
		String[] mon = {"Jan", "Feb", "Mar", "Abr", "May", "Jun",
				"Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
		//monの要素を格納する配列リスト
		ArrayList<String> months = new ArrayList<String>();
		for(int i = 0; i < mon.length; i++) {
			months.add(mon[i]);
		}
		System.out.println("要素数" + months.size());
		for(int i = 0; i < months.size(); i++) {
			System.out.print(months.get(i) + " ");
		}
		System.out.println("===>");
		
		while (months.size() >0) {
			months.remove(0);
			System.out.println("要素数" + months.size());
			System.out.println(months);	
		}
	}
}