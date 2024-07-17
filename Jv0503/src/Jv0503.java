import java.util.HashMap;

//ke2a04
//ヴゴックズイ
//2024/05/08

public class Jv0503 {
	public static void main(String[] args) {
		//12か月の省略英語名
		String[] mon = {"Jan", "Feb", "Mar", "Abr", "May", "Jun",
				"Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
		
		// monの要素を格納するハッシュマップ
	    HashMap<Integer, String> months = new HashMap<Integer, String>();
		for(int i = 0; i < mon.length; i++) {
			months.put(i + 1, mon[i]);
		}
		System.out.println("キー＝値のリスト＞");		
		System.out.println(months);

		System.out.println("キーリスト＞");
		System.out.println(months.keySet());
		

		System.out.println("値のリスト＞");
		System.out.println(months.values());
		for(int i = 1; i <= months.size(); i++) {
			System.out.println(months.get(i));
		}
	}
}