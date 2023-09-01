package main;

import java.math.BigDecimal;
import java.math.RoundingMode;

class Person{
	/* 問題1：インスタンスフィールドを定義してください
	 * 問題4：インスタンスフィールド「weight」を定義し、コンストラクタの中で値をセットしてください（double型）
	 */
	
	// インスタンスフィールドを定義
	public String name;
	public int age;
	public double height; 
	public double weight;
	public int count;
	
	/* 問題2：コンストラクタを定義してください（下記それぞれの引数)
	 * name,age,height
	 *
	 * 問題3：コンストラクタの中で各インスタンスフィールドに値をセットしてください
	 */
	
	// コンストラクタを定義しインスタンスフィールドに値をセット
	Person(String name, int age, double height, double weight){
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.count++;
	}
	
	/* 
	 * 問題6：インスタンスメソッド「bmi」を定義してください（戻り値：double）
	 * 問題7：bmiメソッドでインスタンスのBMIを返すようにしてください
	 */
	public double bmi() {
		return weight / (height * height);
	}
	
	/*
	 * 問題8：インスタンスメソッド「print」を定義してください（戻り値：void）
	 * 問題9：printメソッドの中でthisを用いて「名前は〇〇です」,「年は〇〇です」「BMIは○○です」と出力してください
	 * 問題10：人数の合計を「合計○人です」と出力してください。
	 */
	public void print() {
		BigDecimal bd = new BigDecimal(this.bmi());
		
		System.out.println("名前は" + this.name + "です");
		System.out.println("年は" + this.age + "です");
		System.out.println("BMIは" + bd.setScale(2, RoundingMode.HALF_UP) + "です");
		System.out.println("合計"+ this.count +"人です");
	}
}
