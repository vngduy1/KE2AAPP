//ke2a04
//ヴゴックズイ
//2024/04/26

class MyThread extends Thread {
	public void run() {
		for(int i = 0; i < 100; i++) {
			System.out.println("MyThreadのrunメゾット(" + i + ")");
		}
	}
}

public class Jv0301 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		MyThread t = new MyThread();
		//スレッドを作成して開始します。
		t.start();
		
		for(int i = 0; i < 100; i++) {
			System.out.println("Jv0301のmainメゾット(" + i + ")");
		}
	}

}
