//ke2a04
//ヴゴックズイ
//2024/05/24

import java.io.*;

public class Jv0702 {
	public static void main(String[] args) {
		//標準入力用入力ストリーム
		InputStreamReader in = new InputStreamReader(System.in);
		//標準入力用カバッファ
		try (BufferedReader reader = new BufferedReader(in)) {
			String line = reader.readLine();
			double val = Double.parseDouble(line);
			System.out.println("入力された値の平方根は" + Math.sqrt(val));
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
