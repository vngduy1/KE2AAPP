//ke2a04
//ヴゴックズイ
//2024/04/26

class MyRunnable implements Runnable {
	public void run() {
		for(int i = 0; i < 100; i++) {
			System.out.println("MyThreadのrunメゾット(" + i + ")");
		}
	}
}

public class Jv0302 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		MyRunnable t = new MyRunnable();  
		//Runnableインタフェースを実装したオブジェクトを取り組んだスレッド
		Thread thread = new Thread(t);
		thread.start();
		
		for(int i = 0; i < 100; i++) {
			System.out.println("Jv0302のmainメゾット(" + i + ")");
		}
	}

}