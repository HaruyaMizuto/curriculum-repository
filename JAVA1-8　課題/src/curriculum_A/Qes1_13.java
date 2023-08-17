package curriculum_A;

public class Qes1_13 {
	
	public static void main(String[] args) {
		/*
		 * Q1 下記9個をローカル変数として宣言のみしてください
		 * ・バイト型・短整数型・整数型・長整数型
		 * ・単精度浮動小数点数型・倍精度浮動小数点数型
		 * ・文字型・文字列型
		 * ・ブーリアン型
		 */
		//byte型変数を定義
		byte b;
		//short型変数を定義
		short s;
		//int型変数を定義
		int i1;
		//long型変数を定義
		long l;
		//float型変数を定義
		float f;
		//double型変数を定義
		double d;
		//char型変数を定義
		char c;
		//String型変数を定義
		String str;
		//boolean型変数を定義
		boolean bln;
		/*
		 * Q2 それぞれのローカル変数をローカル内でそれぞれの初期値を代入し初期化してください
		 */
		//byte型bの初期値を設定
		b = 0;
		//short型sの初期値を設定
		s = 0;
		//int型i1の初期値を設定
		i1 = 0;
		//long型lの初期値を設定
		l = 0L;
		//float型fの初期値を設定
		f = 0.0f;
		//double型dの初期値を設定
		d = 0.0d;
		//char型cの初期値を設定
		c = '\u0000';
		//String型strの初期値を設定
		str = null;
		//boolean型blnの初期値を設定
		bln = false;
		/*
		 * Q3 初期化をしたそれぞれの変数に下記の値を代入してください
		 * ・バイト型 10
		 * ・短整数型 100
		 * ・整数型 1000
		 * ・長整数型 10000
		 * ・単精度浮動小数点数型 9.5
		 * ・倍精度浮動小数点数型 10.5
		 * ・文字型 a
		 * ・文字列型 ハロー
		 * ・ブーリアン型 true
		 */
		//bに10を代入
		b = 10;
		//sに100を代入
		s = 100;
		//i1に1000を代入
		i1 = 1000;
		//lに10000を代入
		l = 10000;
		//fに9.5を代入
		f = 9.5f;
		//dに10.5を代入
		d = 10.5;
		//cにaを代入
		c = 'a';
		//strにハローを代入
		str = "ハロー";
		//blnにtrueを代入
		bln = true;
		/*
		 * Q4 下記の通りにコンソール出力されるようにしてください
		 * 上記で作成した変数を必ず使用すること
		 * 11110
		 * 20
		 * a ハロー true
		 * 11130
		 * 10000000000
		 * 0.105
		 * -90
		 */
		//コンソールにl+i1+s+bを出力
		System.out.println(l + i1 + s + b);
		//コンソールにf+dを出力
		System.out.println(f + d);
		//コンソールにa ハロー trueと出力
		System.out.println(c + " " + str + " " + bln);
		//コンソールにをb,s,i1,lの積を出力
		System.out.println(b * s * i1 * l);
		//コンソールにd/sを出力
		System.out.println(d / s);
		//コンソールにb-sを出力
		System.out.println(b - s);
		//コンソールを1行空ける
		System.out.println("");
		/*
		 * Q5 次のプログラムを実行すると「ハローJAVA2023」という結果が表示されます。
		 * 「ハローJAVA43」と表示とさせたいのですが、意図通りに動きません。正しく動作するように修正してください。
		 * String num="20";
		 * int num1=23;
		 * System.out.println("ハローJAVA"+(num+num1));
		 */
		//int型numの初期値を設定
		int num=20;
		//int型num1の初期値を設定
		int num1=23;
		//コンソールにハローJAVA43と出力
		System.out.println("ハローJAVA"+(num+num1));
		/*
		 * Q6 『』で囲われた人の情報を変数にして、formatの通りコンソールに出力してください
		 * ローカル変数に代入し○○に入れてください
		 * 『山田太郎 18歳 170.5cm 62.2kg 寿司』
		 * ↓↓format↓↓
		 * 「初めまして○○です」
		 * 「年齢は○○歳です」
		 * 「身長は○○cmです」
		 * 「体重は○○kgです」
		 * 「好きな食べ物は○○です」
		 */
		//String型nameの初期値を設定
		String name = "山田太郎";
		//int型ageの初期値を設定
		int age = 18;
		//double型heightの初期値を設定
		double height = 170.5;
		//double型weightの初期値を設定
		double weight = 62.2;
		//String型foodの初期値を設定
		String food = "寿司";
		//コンソールに出力
		System.out.println("初めまして"+name+"です");
		//コンソールに出力
		System.out.println("年齢は"+age+"歳です");
		//コンソールに出力
		System.out.println("身長は"+height+"cmです");
		//コンソールに出力
		System.out.println("体重は"+weight+"kgです");
		//コンソールに出力
		System.out.println("好きな食べ物は"+food+"です");
		/*
		 * Q7 6で作成した自己紹介に続いてBMIが出力されるようにしてください
		 * 「BMIは○○です」
		 * ただし計算は数値を直書きせず、全て変数を使ってすること
		 */
		//double型bmiの初期値を設定
		double bmi = ((double)Math.round((weight/ ((height/100)*(height/100))) * 100))/100;
		//コンソールに出力
		System.out.println("BMIは"+bmi+"です");
		//コンソールを1行空ける		
		System.out.println(" ");
		/*
		 * Q8 6で宣言した変数に再代入し下記の通りコンソールに出力してください
		 * 初めまして鈴木一郎です
		 * 年齢は24歳です
		 * 身長168.5cmです
		 * 体重は64.2kgです
		 * 好きな食べ物はオムライスです
		 * BMIは22.6です
		 */
		//nameに値を再代入
		name = "鈴木一郎";
		//ageに値を再代入
		age = 24;
		//heightに値を再代入
		height = 168.5;
		//weightに値を再代入
		weight = 64.2;
		//foodに値を再代入
		food = "オムライス";
		//bmiに値を再代入
		bmi = ((double)Math.round((weight/ ((height/100)*(height/100))) * 10))/10;
		//コンソールに出力
		System.out.println("初めまして"+name+"です");
		//コンソールに出力
		System.out.println("年齢は"+age+"歳です");
		//コンソールに出力
		System.out.println("身長は"+height+"cmです");
		//コンソールに出力
		System.out.println("体重は"+weight+"kgです");
		//コンソールに出力
		System.out.println("好きな食べ物は"+food+"です");
		//コンソールに出力
		System.out.println("BMIは"+bmi+"です");
		//コンソールを1行空ける		
		System.out.println(" ");
		/*
		 * Q9 8で使用した変数【年齢・身長・体重】の数値を和算で自己代入し、下記の通りコンソールに出力してください
		 * 初めまして鈴木一郎です
		 * 年齢は48歳です
		 * 身長337.0cmです
		 * 体重は128.4kgです
		 * 好きな食べ物はオムライスです
		 * BMIは11.31です
		 */
		//iageに値を自己代入
		age += age;
		//heightに自己代入
		height += height;
		//weightに自己代入
		weight += weight;
		//bmiに値を再代入
		bmi = ((double)Math.round((weight/ ((height/100)*(height/100))) * 100))/100;
		//コンソールに出力
		System.out.println("初めまして"+name+"です");
		//コンソールに出力
		System.out.println("年齢は"+age+"歳です");
		//コンソールに出力
		System.out.println("身長は"+height+"cmです");
		//コンソールに出力
		System.out.println("体重は"+weight+"kgです");
		//コンソールに出力
		System.out.println("好きな食べ物は"+food+"です");
		//コンソールに出力
		System.out.println("BMIは"+bmi+"です");
		//コンソールを1行空ける		
		System.out.println(" ");
		/*
		 * Q10 8で使用した年齢が25歳以上ならtrueが出力されるようにしてください。ただしif文は使いません
		 */
		//ageに値を再代入
		age = 24;
		//コンソールに出力
		System.out.println(age >= 25);
		//コンソールを1行空ける		
		System.out.println(" ");
		/*
		 * Q11 8で使用した【年齢・身長・体重】を文字列型に型変換し繋げて出力してください
		 */
		//heightに値を再代入
		height = 168.5;
		//weightに値を再代入
		weight = 64.2;
		//ageを文字列型に型変換
		String ageString = String.valueOf(age);
		//heightを文字列型に型変換
		String heightString = String.valueOf(height);
		//weightを文字列型に型変換
		String weightString = String.valueOf(weight);
		//コンソールに出力
		System.out.println(ageString + heightString + weightString);
		//コンソールを1行空ける		
		System.out.println(" ");
		/*
		 * Q12 11で変換した【年齢・身長】を整数型に変換して出力してください
		 */
		//ageStringを整数型に変換
		Integer ageInt = Integer.valueOf(ageString);
		//コンソールに出力
		System.out.println(ageInt);
		//heightStringをdouble型に変換しint型に変換
		int heightInt = (int)Double.parseDouble(heightString);
		//コンソールに出力
		System.out.println(heightInt);
		//コンソールを1行空ける		
		System.out.println(" ");
		/*
		 * Q13 12で変換した【年齢・身長】で【年齢が25もしくは身長が160以上】であればtrueを出力してください
		 * ただしif文は使わないでください
		 */
		//コンソールに出力
		System.out.println(ageInt >= 25 || heightInt >= 160);
	}
}
