package forProcess;

public class Output extends Animal{
	// コンストラクタ
	public Output(String sample) {
		
		// スーパークラスのコンストラクタを継承
		super(sample);
		
		// 動物ごとに繰り返し処理
		for(int i = 0; i < inputArray.length; i++) {

			// 動物名、体長、速度の3つにわける
			String[] animalArray = inputArray[i].split(":");
			// 動物名を配列に格納
			this.name[i] = animalArray[0];
			// 体長を配列に格納
			this.size[i] =Double.parseDouble(animalArray[1]);
			// 速度を配列に格納
			this.speed[i] = Integer.parseInt(animalArray[2]);

			// 動物名によって分岐
			switch(this.name[i]) {

			// ライオンのとき
			case "ライオン":
				// 学名を設定
				this.scientificName[i] = "パンテラ レオ";
				break;
				
			// ゾウのとき
			case "ゾウ":
				// 学名を設定
				this.scientificName[i] = "ロキソドンタ・サイクロティス";
				break;
				
			// パンダのとき
			case "パンダ":
				// 学名を設定
				this.scientificName[i] = "アイルロポダ・メラノレウカ";
				break;
				
			// チンパンジーのとき
			case "チンパンジー":
				// 学名を設定
				this.scientificName[i] = "パン・トゥログロディテス";
				break;
				
			// シマウマのとき
			case "シマウマ":
				// 学名を設定
				this.scientificName[i] = "チャップマンシマウマ";
				break;
				
			// それ以外のとき
			default:
				// 学名を不明に設定
				this.scientificName[i] = "不明";
			}
		}
	}
	// フィールド変数から定型文を設定するメソッド
	public String toString(int animalNum) {
		return "動物名：" + this.name[animalNum] + "\n" +
				"体長：" + this.size[animalNum] + "m\n" +
				"速度：" + this.speed[animalNum] + "km/h\n" +
				"学名：" + this.scientificName[animalNum] + "\n";
	}
	
	// コンソールに出力するメソッド
	public void output() {
		
		// 動物ごとに繰り返し処理
		for (int j = 0; j < inputArray.length; j++) {
			
			// 定型文を設定
			String infomation = toString(j);
			// コンソールに出力
			System.out.println(infomation);
		}
	}
}
