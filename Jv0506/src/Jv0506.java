//ke2a04
//ヴゴックズイ
//2024/05/15

import java.util.HashSet;

public class Jv0506 {
	public static void main(String[] args) {
		// HashSetの宣言と初期化
		HashSet<String> set = new HashSet<String>();
		
		// 要素の追加
		set.add("A");	
		set.add("B");	
		set.add("C");	
		set.add("D");	
		
		for(String str : set) {
			System.out.println(str);
		}
	}
}
