package forExe;
// Objectsクラスをインポート
import java.util.Objects;
// Scannerクラスをインポート
import java.util.Scanner;

// Outputクラスをインポート
import forProcess.Output;

public class Main {

	public static void main(String[] args) {
		/*

	 	コンソールに下記が入力されたときにコンソール出力結果がコンソールに表示されるように作ってください
	 	ライオン:2.1:80,ゾウ:3.2:40,パンダ:1.9:30,チンパンジー:0.94:25,シマウマ:2.4:65,インコ:0.1:50
	 	
	 	コンソール出力結果

		コンソールに文字を入力してください
	  	動物名：ライオン　// name[0]
		体長：2.1m // size[0]
		速度：80km/h // speed[0]
		学名：パンテラ レオ   // scientificName[0]

		動物名：ゾウ // name[1]
		体長：3.2m
		速度：40km/h
		学名：ロキソドンタ・サイクロティス

		動物名：パンダ
		体長：1.9m
		速度：30km/h
		学名：アイルロポダ・メラノレウカ

		動物名：チンパンジー
		体長：0.94m
		速度：25km/h
		学名：パン・トゥログロディテス

		動物名：シマウマ
		体長：2.4m
		速度：65km/h
		学名：チャップマンシマウマ

		動物名：インコ
		体長：0.1m
		速度：50km/h
		学名：不明
		 */

		// コンソールに出力
		System.out.println("コンソールに文字を入力してください");

		// インスタンスを初期化
		Scanner sc = new Scanner(System.in);
		// 入力された文字列を取得
		String sample = sc.nextLine();
		// スキャナーを閉じる
		sc.close();
		
		// nullチェック
		if (Objects.nonNull(sample)) {
			
			// Animalクラスのインスタンスを初期化
			Output o = new Output(sample);
			
			// nullチェック
			if(Objects.nonNull(o)) {
				
				// メソッドを呼び出し
				o.output();
			}else {
				// エラー文を表示
				System.out.println("エラー：Outputクラスがnullです");
			}
		}else {
			// エラー文を表示
			System.out.println("エラー：入力された値がnullです");
		}
	}

}
