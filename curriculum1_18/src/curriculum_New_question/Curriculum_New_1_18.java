package curriculum_New_question;
// java.util.Randomパッケージをインポート
import java.util.Random;

public class Curriculum_New_1_18 {
	
	// Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成してください。
	public static void outputGreeting(String str,int num1) {
		
		// コンソールに出力
		System.out.println("「Hello " + str + " " + num1 + "」\n");
	}
	
	// Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成してください
	public static void calculation(int num2,int num3) {
		
		// コンソールに出力
		System.out.println(num2 * num3 + "\n");
	}
	
	// Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成してください
	public static void outputArray(int[] array) {
		
		// 配列の要素を順番に繰り返し処理
		for (int i = 0; i < array.length; i++) {
			
			// コンソールに出力
			System.out.println(array[i]);
		}
		
		// コンソールに出力
		System.out.println("\n");
	}
	
	// Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力してください。
	public static double calculation(double d1, double d2) {
		
		// 引数同士の合計を返す
		return d1 + d2;
	}
	
	// Q5：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して
	// 格納した値を順番にコンソールで出力後、格納した値を返すメソッドを作成してください。
	// ※0は出力＆格納しないようにしてください。
	public static int[] randomArray(int count) {
		
		// Randomクラスのインスタンスを初期化
		Random rand = new Random();
		// 配列を宣言
		int[] array1 = new int[count];
		
		for (int j = 0; j < count; j++) {
			
			// 配列のj番目の要素に1～100までのランダムな数字を格納
			array1[j] = rand.nextInt(99) + 1;
			// コンソールに出力
			System.out.println(array1[j]);
		}
		
		// 配列を返す
		return array1;
	}
	
	// Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
	// ※小数点以下も表示されるようにしてください。
	public static double average(int[] array2) {
		
		// 受け取った配列の要素の合計を初期化
		double arraySum = 0;
		
		// 受け取った配列の長さの分だけ繰り返し処理
		for (int k = 0; k < array2.length; k++) {
			
			// 配列の要素を足していく
			arraySum += array2[k];
		}
		
		// 平均値を代入
		double arrayAverage = arraySum / array2.length;
		// コンソールに出力
		System.out.println(arrayAverage);
		// 平均値を返す
		return arrayAverage;
		
		}
	
	// Q7：引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力してください。
	public static void check(double avr) {
		System.out.println(avr >= 50);
	}
	
	public static void main(String[] args) {
		// 作成したメソッドをここで呼び出してください
		
		// Q1のメソッドを呼び出し
		outputGreeting("JavaSE", 11);
		
		// Q2のメソッドを呼び出し
		calculation(6, 7);
		
		// 配列bを宣言し、値を設定
		int[] b = {1, 2, 3, 4};
		// Q3のメソッドを呼び出し
		outputArray(b);
		
		// Q4のメソッドを呼び出してコンソールに出力
		System.out.println(calculation(1.2, 2.5) + "\n");
		
		// Q5のメソッドを呼び出し
		randomArray(3);
		// コンソールに出力
		System.out.println("\n");
		
		// Q6のメソッドを呼び出し
		average(randomArray(3));
		// コンソールに出力
		System.out.println("\n");
		
		// Q7のメソッドを呼び出し
		check(average(randomArray(3)));
	}

}
