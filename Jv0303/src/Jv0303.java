//ke2a04
//ヴゴックズイ
//2024/04/26

public class Jv0303 {

	public static void main(String[] args) {
		
		for(int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
				// Thread.sleep(1000) を呼び出して、ループを1秒間停止します。
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println("*");
		}
	}

}