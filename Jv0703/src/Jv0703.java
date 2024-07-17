//ke2a04
//ヴゴックズイ
//2024/05/24

import java.io.*;

public class Jv0703 {
	public static void main(String[] args) {
		//標準入力用書き込み先ファイル
		File file = new File("C:\\appDev_ke2a04\\Jv0703.txt");
		//標準入力用カバッファ
		try (FileWriter fw = new FileWriter(file); 
			BufferedWriter bw = new BufferedWriter(fw); ) {
			for(int i = 0; i < 5; i++) {
				bw.write("[" + i + "]");
				bw.newLine();
			}
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
