package forOutput;
// java.time.LocalDateTimeをインポート
import java.time.LocalDateTime;
// java.time.format.DateTimeFormatterをインポート
import java.time.format.DateTimeFormatter;

public class Output {
	
	// フィールド
	// 国名
	public String country;
	// 食べ物
	public String food;
	// 日付
	public String dateTime;
	
	// コンストラクタ
	public Output(String country,String food){
		// 変数に代入
		this.food = country;
		
		// 変数に代入
		this.country = food;
		
		// 現在日時を取得
		LocalDateTime nowDate = LocalDateTime.now();
		// 表示形式を指定
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		// 変数に代入
		this.dateTime = dtf1.format(nowDate);
	}
	
	// 挨拶を出力するメソッド
	public void greeting() {
		
		// コンソールに出力
		System.out.println("こんにちは！ここは" + this.country + "です！");
	}
	
	// 食べ物の味を出力するメソッド
	public void taste() {
		
		// コンソールに出力
		System.out.println("この" + this.food + "はうまい");
	}
	
	// どの国の食べ物か出力するメソッド
	public void whereNationalFood() {
		
		// コンソールに出力
		System.out.println(this.food + "は和食です");
	}
	
	// 現在日時を出力するメソッド
	public void nowDateTime() {
		
		// コンソールに出力
		System.out.println("今の現在日時は" + this.dateTime + "です");
	}
}
