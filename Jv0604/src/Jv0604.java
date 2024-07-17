//ke2a04
//ヴゴックズイ
//2024/05/22

import java.util.HashSet;
import java.util.function.Consumer;

public class Jv0604 {

	public static void main(String[] args) {
		// 配列の初期化
		String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun"};
		
		// HashSetの宣言と初期化
		HashSet<String> set = new HashSet<String>();
		
		// 配列の要素をHashSetに追加
		for(String m : months) {
			set.add(m);
		}
		//Consumer<String>型の匿名クラスオブジェクトを与えられた forEach メソッド
		set.forEach(new Consumer<String>() {
			public void accept(String str) {
				System.out.println(str);
			}
		});
	}

}
