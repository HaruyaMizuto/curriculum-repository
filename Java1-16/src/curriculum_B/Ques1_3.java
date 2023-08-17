package curriculum_B;
//java.util.Randomパッケージをインポート
import java.util.Random;
//java.util.Scannerパッケージをインポート
import java.util.Scanner;

public class Ques1_3 {
	
	public static void main(String[] args) {
		/*
		 * Q1 ログイン時の入力チェックシステムを下記条件で作成してください
		 * ・ユーザー名の文字数が10文字より大きい場合「名前を10文字以内にしてください」と出力してください
		 * ・ユーザー名の文字数が0文字以下もしくはnullの場合「名前を入力してください」と出力してください
		 * ・ユーザー名が正常な値だった場合「ユーザー名「 入力したユーザー名 」を登録しました」と出力してください
		 * Q2 ユーザー名が半角英数字以外の場合「半角英数字のみで名前を入力してください」と出力してください
		 */
		//Scannerクラスのインスタンスを初期化
		Scanner sc1 = new Scanner(System.in);
		//nameを宣言し初期化
		String name = null;
		//breakされるまで繰り返し処理
		while (true) {
			//nameに、入力された値を文字列として代入
			name = sc1.nextLine();
			//nameの文字数が10文字より大きい場合
			if (name.length() > 10) {
				//コンソールに出力
				System.out.println("名前を10文字以内にしてください");
				//コンソールを改行
				System.out.println(" ");
			//それ以外でnameの文字数が0文字以下もしくはnullの場合
			}else if (name.length() <= 0 || name == null) {
				//コンソールに出力
				System.out.println("名前を入力してください");
				//コンソールを改行
				System.out.println(" ");
			//それ以外でnameが半角英数字の場合
			}else if (name.matches("^[A-Za-z0-9]+$")){
				//コンソールに出力
				System.out.println("ユーザー名"+name+"を登録しました");
				/*  
				 * Q3 じゃんけんのシステムを下記の条件で作成してください
				 * ・「0はグー、1：チョキ、2：パー」とすること
				 * ・じゃんけんに勝つまでループすること
				 * ・一回ごとに自分の手と相手の手を下記の通り出力してください
				 *    ユーザー名「name」を登録しました
				 *    nameの手は「パー」
				 *    相手の手は「グー」
				 * ・条件分岐の設定
				 * ・自分がじゃんけんに勝った場合、下記が出力されるようにしてください
				 *    やるやん。
				 *    次は俺にリベンジさせて
				 * ・自分がじゃんけんでグーに負けた場合、下記が出力されるようにしてください
				 *    俺の勝ち！
				 *    負けは次につながるチャンスです！
				 *    ネバーギブアップ！
				 * ・自分がじゃんけんでチョキに負けた場合、下記が出力されるようにしてください
				 *    俺の勝ち！
				 *    たかがじゃんけん、そう思ってないですか？
				 *    それやったら次も、俺が勝ちますよ
				 * ・自分がじゃんけんでパーに負けた場合、下記が出力されるようにしてください
				 *    俺の勝ち！
				 *    なんで負けたか、明日まで考えといてください。
				 *    そしたら何かが見えてくるはずです
				 * ・あいこの場合、下記が出力されるようにしてください
				 *    DRAW あいこ もう一回しましょう！
				 * じゃんけんを行った回数を表示してください
				 *    勝つまでにかかった合計回数は1回です
				 * ユーザー名が正常の場合じゃんけんのシステムが起動するようにしてください
				 */
				//timesを宣言し初期化
				int times = 0;
				//配列handを宣言し、要素は{グー,チョキ,パー}とする
				String[] hand = {"グー","チョキ","パー"};
				//Randomクラスのインスタンスを初期化
				Random rand1 = new Random();
				//breakされるまで繰り返し処理
				while (true) {
					//userHandを宣言し、入力された値を数値として取得
					int userHand = sc1.nextInt(3);
					//コンソールに出力
					System.out.println(name + "の手は「" + hand[userHand] + "」");
					//pcHandを宣言し、0～2のランダムな数字を代入
					int pcHand = rand1.nextInt(3);
					//コンソールに出力
					System.out.println("相手の手は「" + hand[pcHand] + "」");
					//コンソールを改行
					System.out.println(" ");
					//じゃんけんの結果によってリアクションをコンソールに出力
					if ((userHand == 0 && pcHand == 1) || (userHand == 1 && pcHand == 2) || (userHand == 2 && pcHand == 0)) {
						//timesに1を足す
						times++;
						//コンソールに出力
						System.out.println("やるやん。\n次は俺にリベンジさせて");
						//コンソールを改行
						System.out.println(" ");
						//コンソールに出力
						System.out.println("勝つまでにかかった合計回数は"+times+"回です");
						break;
					}else if (userHand == 1 && pcHand == 0) {
						//コンソールに出力
						System.out.println("俺の勝ち！\n負けは次につながるチャンスです！\nネバーギブアップ！");
						//timesに1を足す
						times++;
					}else if (userHand == 2 && pcHand == 1) {
						//コンソールに出力
						System.out.println("俺の勝ち！\nたかがじゃんけん、そう思ってないですか？\nそれやったら次も、俺が勝ちますよ");
						//timesに1を足す
						times++;
					}else if (userHand == 0 && pcHand == 2) {
						//コンソールに出力
						System.out.println("俺の勝ち！\nなんで負けたか、明日までに考えといてください\nそしたら何かが見えてくるはずです");
						//timesに1を足す
						times++;
					}else if (userHand == pcHand){
						//コンソールに出力
						System.out.println("DRAW あいこ もう一回しましょう！");
						//timesに1を足す
						times++;
					};
					//コンソールを改行
					System.out.println(" ");
				}
				break;
			//半角英数字でないとき
			}else {
				//コンソールに出力
				System.out.println("半角英数字のみで名前を入力してください");
				//コンソールを改行
				System.out.println(" ");
			}
		}
	}
}
