package main;

class Person{
	//インスタンスフィールド
	public String name;
	public int age;
	public double height;
	public double weight;
	
	// クラスフィールド
	public static int count = 0; // 初期値0

	// コンストラクタ
	Person(String name, int age, double height, double weight){
		
		// インスタンスフィールドの変数に値を設定
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		
		// カウントを1増やす
		count++;
	}

	// BMIを返すインスタンスメソッド
	public double bmi(){
		return this.weight / this.height / this.height;
	}

	// コンソールに出力するインスタンスメソッド
	public void print(){
		System.out.println("名前は" + this.name + "です");
		System.out.println("年は" + this.age + "です");
	}
	
	// クラスメソッド
	public static void printCount(){
		System.out.println("合計" + count + "人です");
	}
}