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


public class Jv0304 {
	public static void main(String[] args) {
		//Thread クラスを拡張しています。
		MyThread t = new MyThread();   
		//スレッドを作成して開始します。
		t.start();
		try {
			t.join();
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		
		for(int i = 0; i < 100; i++) {
			System.out.println("Jv0304のmainメゾット(" + i + ")");
		}
	}

}