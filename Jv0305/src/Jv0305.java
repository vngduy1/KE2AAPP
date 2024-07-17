//ke2a04
//ヴゴックズイ
//2024/04/26

class MyThread extends Thread {
	public boolean running = true;  //制限ループの変復フラグ。falseで停止
	public void run() {
		while(running) {
			System.out.print("*");
		}
		System.out.println("runメゾットを終了します。");
	}
}


public class Jv0305 {
	public static void main(String[] args) {
		//Thread クラスを拡張しています。
		MyThread t = new MyThread();   
		t.start();
		
		try {
			Thread.sleep(5);
			// ５ミリ秒ずつ停止して「＊」を変復表示するスレッド
		} catch (Exception e) {
			System.out.println(e);
		}
		
		t.running = false; 
	}

}