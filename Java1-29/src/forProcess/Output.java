package forProcess;
// Arraysクラスをインポート
import java.util.Arrays;

public class Output extends ProcessArray{
	
	public Output(String inputNum, String sort){
		
		// スーパークラスのコンストラクタを継承
		super(inputNum);
		
		// 2回目に受け取った値が昇順か降順かによって処理を変える
		// 昇順のとき
		if(sort.equals("昇順")) {
			
			// 数字が格納された配列を昇順でソート
			Arrays.sort(this.intArray);
			
		// 降順のとき
		}else if (sort.equals("降順")) {
			
			// 数字が格納された配列を昇順でソート
			Arrays.sort(this.intArray);
			
			// 前後から配列の全ての要素に対して処理できるように繰り返し処理
			for (int f = 0, l = intArray.length - 1; f < l; f++, l--){
				
				// あらかじめ変数に手前側の要素を代入
				int temp = intArray[f];
				// 手前側の要素を後ろ側の要素と入れ替える
				intArray[f]  = intArray[l];
				// 後ろ側の要素と手前側の要素を入れ替える
				intArray[l] = temp;
			}
		}
		
		// 入力された数字ごとに繰り返し処理
		for(int j = 0; j < intArray.length; j++) {
			
			// 現行の数字を変数に代入
			int num = intArray[j];
			
			// 都道府県名、県庁所在地、面積の3つにわける
			String[] province  = originalArray[num].split(":");
			
			// 都道府県名を配列に格納
			this.provinceName[j] = province[0];
			// 県庁所在地を配列に格納
			this.capitalName[j] = province[1];
			// 面積を配列に格納
			this.area[j] = province[2];
			
		}
	}
	// フィールド変数から定型文を設定するメソッド
	public String toString(int provinceNum) {
		
		return "都道府県名：" + this.provinceName[provinceNum] + "\n" +
				"県庁所在地：" + this.capitalName[provinceNum] + "\n" +
				"面積：" + this.area[provinceNum] + "km2\n";
	}
	
	// コンソールに出力するメソッド
	public void output() {
		
		// 都道府県ごとに繰り返し処理
		for (int k = 0; k < intArray.length; k++) {
			
			// 定型文を設定
			String infomation = toString(k);
			// コンソールに出力
			System.out.println(infomation);
		}
	}
	
}
