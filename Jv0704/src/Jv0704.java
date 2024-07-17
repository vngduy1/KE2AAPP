//ke2a04
//ヴゴックズイ
//2024/05/31

import java.io.*;

public class Jv0704 {
	public static void main(String[] args) {
		//標準入力用読み込み先ファイル
		File file = new File("C:\\appDev_ke2a04\\Jv0703.txt");
		//標準ファイルの読み取り用
		try (FileReader fr = new FileReader(file); 
			BufferedReader br = new BufferedReader(fr); ) {
			String s;  //Jv0703.txtから1行ずつ読み込んだ文
			
			while ((s = br.readLine()) != null) {
				System.out.println(s + "を読み込みました");
			}
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
