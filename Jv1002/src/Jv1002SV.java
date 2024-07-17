import java.io.*;
import java.net.*;
//ke2a04
//ヴゴックズイ
//2024/07/12
public class Jv1002SV {
	static String[] weathres = {"晴れ", "曇り", "雨", "晴れのち曇り", 
			"晴れのち雨", "曇りのち晴れ" 
	};

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
	    try {
			ServerSocket ss = new ServerSocket(5000);
			while(true) {
				Socket s = ss.accept();
				PrintWriter w = new PrintWriter(s.getOutputStream());
				String weather = getWeatherForecast();
				w.println(weather);
				System.out.println("[" + weather + "] の予報を送りました。" );
//				w.close();
			}
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
	
	static String getWeatherForecast() {
		return weathres[(int) (Math.random() * weathres.length)];
	}

}
