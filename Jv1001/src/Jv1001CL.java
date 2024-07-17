import java.io.*;
import java.net.*;

//ke2a04
//ヴゴックズイ
//2024/07/12

public class Jv1001CL {
	public static void main(String[] args) {
		try {
			Socket s = new Socket("127.0.0.1", 5000);
			BufferedReader reader = new BufferedReader(
					new InputStreamReader(s.getInputStream()));
			String message = reader.readLine();
			System.out.println("サーバーから受け取った文字列：" + message);
			reader.close();
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
