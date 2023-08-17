package curriculum_B;
//java.math.BigDecimalパッケージをインポート
import java.math.BigDecimal;
//java.math.RoundingModeパッケージをインポート
import java.math.RoundingMode;
//java.util.Scannerパッケージをインポート
import java.util.Scanner;

public class Ques7 {

	public static void main(String[] args) {
		/*
		 * N人の生徒の成績を管理するプログラムを下記条件で作成してください
		 * ・N人の生徒の成績を入力できるようにしてください 入力値は上から英語・数学・理科・社会の点数としてください
		 * ・各生徒の科目平均点、全体の科目平均点、そして各教科の平均点を出力してください
		 * ・このプログラムの実行は必ず1回以上行われるようにしてください
		 * ・出力例を参考にプログラミングを作成してください
		 * 
		 * 入力・出力例
		 * 生徒の人数を入力してください（2以上）: 2
		 * 1人目の『英語』の点数を入力してください :10
		 * 1人目の『数学』の点数を入力してください :10
		 * 1人目の『理科』の点数を入力してください :10
		 * 1人目の『社会』の点数を入力してください :10
		 * 
		 * 2人目の『英語』の点数を入力してください :10
		 * 2人目の『数学』の点数を入力してください :10
		 * 2人目の『理科』の点数を入力してください :10
		 * 2人目の『社会』の点数を入力してください :10
		 * 
		 * 1人目の平均点は10.00点です。
		 * 2人目の平均点は10.00点です。
		 * 
		 * 英語の平均点は10.00点です。
		 * 数学の平均点は10.00点です。
		 * 理科の平均点は10.00点です。
		 * 社会の平均点は10.00点です。
		 * 全体の平均点は10.00点です。
		 */
		//Scannerクラスのインスタンスを初期化
		Scanner sc2 = new Scanner(System.in);
		//s,sub,score,studentNumを宣言し初期化
		int s,sub,score,studentNum = 0;
		//配列subjectを宣言し、英語,数学,理科,社会を格納
		String [] subject = {"英語", "数学", "理科", "社会"};
		//コンソールに出力
		System.out.print("生徒の人数を入力してください（2以上）: ");
		//studentNumに入力された値を代入
		studentNum = sc2.nextInt();
		//多次元配列scoresを宣言し、行がstudentNum,列が4の空配列を初期値に設定
		double [][] scores = new double[studentNum][4];
		double allSum = 0;
		//1人目からstudentNum人目まで繰り返し処理
		for (s = 1; s <= studentNum; s++) {
			//4つの教科に対して繰り返し処理
			for (sub = 0; sub < 4; sub++) {
				//コンソールに出力
				System.out.print(s + "人目の『"+ subject[sub] + "』の点数を入力してください :");
				//scoreに入力された値を代入
				score = sc2.nextInt();
				//scoreを多次元配列scoresに格納
				scores[s-1][sub] = score;
			}
			//コンソールを改行
			System.out.println("");
		}
		//studentSum,subjectSum,avarageを宣言
		double studentSum,subjectSum,avarage;
		//生徒ごとの平均点を出力する記述
		//1人目からstudentNum人目まで繰り返し処理
		for (s = 1; s <= studentNum; s++) {
			//studentSumを初期化
			studentSum = 0;
			//4つの教科で繰り返し処理
			for (sub =0; sub < 4; sub++) {
				//studentSumにscore[s-1][sub]を足していく
				studentSum = studentSum + scores[s-1][sub];
			}
			//avarageに値を代入
			avarage = studentSum / 4;
			//BigDecimalクラスavrをインスタンス化
			BigDecimal avr = new BigDecimal(avarage);
			//avrを小数点第2位までで丸め処理してresultに代入
			BigDecimal result = avr.setScale(2, RoundingMode.HALF_UP);
			//コンソールに出力
			System.out.println(s + "人目の平均点は" + result + "点です");
			allSum = allSum + studentSum;
		}
		//コンソールを改行
		System.out.println("");
		//全体での教科ごとの平均点を出力する記述
		//4つの教科で繰り返し処理
		for (sub =0; sub < 4; sub++) {
			//subjectSumを初期化
			subjectSum = 0;
			//1人目からstudentNum人目まで繰り返し処理
			for (s =1; s <= studentNum; s++) {
				//subjectSumにscores[s-1][sub]を足していく
				subjectSum = subjectSum + scores[s-1][sub];
			}
			//avarageに値を代入
			avarage = subjectSum / studentNum;
			//BigDecimalクラスavrをインスタンス化
			BigDecimal avr = new BigDecimal(avarage);
			//avrを小数点第2位までで丸め処理してresultに代入
			BigDecimal result = avr.setScale(2, RoundingMode.HALF_UP);
			//コンソールに出力
			System.out.println(subject[sub] + "の平均点は" + result +  "点です");
		}
		//avarageに値を代入
		avarage = allSum / (4 * studentNum);
		//BigDecimalクラスavrをインスタンス化
		BigDecimal avr = new BigDecimal(avarage);
		//avrを小数点第2位までで丸め処理してresultに代入
		BigDecimal result = avr.setScale(2, RoundingMode.HALF_UP);
		//コンソールに出力
		System.out.println("全体の平均点は" + result +  "点です");
	}

}
