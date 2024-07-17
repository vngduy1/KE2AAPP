//ke2a04
//ヴゴックズイ
//2024/05/22

import java.util.HashSet;

public class Jv0603 {

	public static void main(String[] args) {
		// 配列の初期化
		String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun"};
		
		// HashSetの宣言と初期化
		HashSet<String> set = new HashSet<String>();
		
		// 配列の要素をHashSetに追加
		for(String m : months) {
			set.add(m);
		}
		
		//ラムダ式
		set.forEach(month -> System.out.println(month));
	}

}
