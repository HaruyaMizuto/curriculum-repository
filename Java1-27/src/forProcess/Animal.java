package forProcess;

public class Animal {
	// フィールド変数
	public String inputArray[]; // 入力された文字列をカンマ区切りで格納した配列
	public String name[]; // 動物名
	public double size[]; // 体長
	public int speed[]; // 速度
	public String scientificName[]; // 学名
	
	// コンストラクタ
	Animal(String sample){
		// 文字列を取得してカンマ区切りで配列を設定
		this.inputArray = sample.split(",");
		// 動物の種類分だけ要素のある配列に設定
		this.name = new String[inputArray.length];
		// 動物の種類分だけ要素のある配列に設定
		this.size = new double[inputArray.length];
		// 動物の種類分だけ要素のある配列に設定
		this.speed = new int[inputArray.length];
		// 動物の種類分だけ要素のある配列に設定
		this.scientificName = new String[inputArray.length];
	}
}