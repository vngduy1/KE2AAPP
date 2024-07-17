import java.util.LinkedList;
import java.util.Queue;

//ke2a04
//ヴゴックズイ
//2024/05/15

public class Jv0508 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// String型配列 strCaA の初期値
		String[] strCaA = {"God", "blessed", "Abel", "but", "didn't", "Cain"};
		
		//Queue<String>型変数 que に，新規生成した LinkedList<String>型オブジェクトを割り当てる。
	    Queue<String> que = new LinkedList<String>();
	    //LinkedList<String>型変数 stk に，新規生成した LinkedList<String>型オブジェクトを割り当てる。 
	    LinkedList<String> stk = new LinkedList<String>();
	    
	   // 配列 strCaA の要素を que と stk のリスト末尾に順次追加
	    for (String str : strCaA) {
            que.offer(str);
            stk.push(str);
        }
	    
	    // キューの出力
        System.out.println("キューの出力＞");
        while(!que.isEmpty()) {
            System.out.print(que.poll() + " ");
        }
	    System.out.println("");
	    
	    // スタックの出力
        System.out.println("スタックの出力＞");
        while(!stk.isEmpty()) {
            System.out.print(stk.pop() + " ");
        }
	}

}
