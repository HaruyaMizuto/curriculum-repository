package forProcess;

public class ProcessArray {
	
	// フィールド変数
	public String[] originalArray; // あらかじめ規定値を設定した元となる配列
	public String[] inputArray; // 入力された値をカンマ区切りで格納した配列
	public int[] intArray; // int型配列にしたもの
	public String[] provinceName; // 都道府県名が入った配列
	public String[] capitalName; // 県庁所在地が入った配列
	public String[] area; // 面積が入った配列
	
	// コンストラクタ
	ProcessArray(String inputNums){
		
		// 	配列に既定の要素を設定
		this.originalArray = new String[]{"北海道:札幌市:83424", "青森県:青森市:9646", "岩手県:盛岡市:15275", "宮城県:仙台市:7282",
				"秋田県:秋田市:11638", "山形県:山形市:9323", "福島県:福島市:13784", "茨城県:水戸市:6097", 
				"栃木県:宇都宮市:6408", "群馬県:前橋市:6362", "埼玉県:さいたま市:3798"};

		// 文字列を取得してカンマ区切りで配列を設定
		this.inputArray = inputNums.split(",");
		// 入力された数字分の要素数の配列に設定
		this.intArray = new int[inputArray.length];

		// 設定された文字列型の配列を繰り返し処理
		for (int i = 0; i < inputArray.length; i++) {

			// 設定した配列を型変換
			this.intArray[i] = Integer.parseInt(inputArray[i]);
		}
		
		// 入力された数字分の要素数の配列に設定
		this.provinceName = new String[inputArray.length];
		// 入力された数字分の要素数の配列に設定
		this.capitalName = new String[inputArray.length];
		// 入力された数字分の要素数の配列に設定
		this.area = new String[inputArray.length];
	}
}
