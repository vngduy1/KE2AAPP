//ke2a04
//ヴゴックズイ
//2024/05/1

class Bank {
	static int money = 0;
	
	// 1円追加するメソッド（同期化されています
	static synchronized void addOneYen() {
		money++;
	}
}

class Customer extends Thread {
	public void run() {
		for(int i = 0; i < 10000; i++) {
			Bank.addOneYen();
		}
	}
}


public class Jv0307 {
	public static void main(String[] args) {
		// 100人の顧客を生成します。
		Customer[] customers = new Customer[100];   
		for(int i = 0; i < 100; i++) {
			customers[i] = new Customer();
			customers[i].start();     // 顧客をスタートします。
		}
		
		for(int i = 0; i < 100; i++) {
		    try {
			    customers[i].join();
		    } catch (InterruptedException e) {
			    System.out.println(e);
		    }
		}
		
		System.out.println(Bank.money);
	}

}