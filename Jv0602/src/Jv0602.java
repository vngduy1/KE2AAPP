//ke2a04
//ヴゴックズイ
//2024/05/22

import java.util.HashSet;
import java.util.function.Consumer;

public class Jv0602 {
	public static void main(String[] args) {
		// HashSetの宣言と初期化
		HashSet<String> set = new HashSet<String>();
		
		// 要素の追加
		set.add("A");	
		set.add("B");	
		set.add("C");	
		set.add("D");	
		
		set.forEach(new Consumer<String>() {
			public void accept(String str) {
				System.out.println(str);
			}
		});
	}
}
