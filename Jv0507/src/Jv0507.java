//ke2a04
//ヴゴックズイ
//2024/05/15

import java.util.HashSet;
import java.util.Iterator;

public class Jv0507 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// 配列の初期化
		String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun"};
		
		// HashSetの宣言と初期化
		HashSet<String> set = new HashSet<String>();
		
		// 配列の要素をHashSetに追加
		for(String m : months) {
			set.add(m);
		}
		
		// イテレータの取得
		Iterator<String> it = set.iterator();
		
		// HashSetの要素を出力
		while(it.hasNext()) {
			String str = it.next();
			System.out.println(str);
		}
	}

}
