//ke2a04
//ヴゴックズイ
//2024/05/3

class DataSet {
	int[] data = new int[100];    //ヒープ領域を圧迫用配列100回
}

public class Jv0401 {
	public static void main(String[] args) {
		System.out.println("空きメモリサイズ:" + 
	    Runtime.getRuntime().freeMemory());
		DataSet[] data = new DataSet[10000];   //ヒープ領域を圧迫用配列１万回
		
		for(int i = 0; i < 10000; i++) {
			data[i] = new DataSet();
			data[i] = null;
				
			if(i % 100 == 99) {
				if(i > 1000 && i % 1000 == 99) {
					Runtime.getRuntime().gc();
					System.out.println("gc() done!");
				}
				System.out.println("生成済みインスタンス数："
						+ (i + 1) + "空きメモリサイズ:" +
						+ Runtime.getRuntime().freeMemory());
			}
			
		}
		
	}
}