package basicClass;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Animal {
	
	public static void main(String[] args) {
		
		// インスタンスを初期化
		new Dog(3);
		// インスタンスを初期化
		new Dog();
		
		// Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。
		// 変数に代入
		String name = Dog.animalName;
		// コンソールに出力
		System.out.println(name);
		
		// Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。
		// 変数に代入
		int number = Dog.animalNum;
		// コンソールに出力
		System.out.println(number);
		
		// 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください
		// 現在日時を取得
		LocalDateTime nowDate = LocalDateTime.now();
		
		// 表示形式を指定
		DateTimeFormatter d = DateTimeFormatter.ofPattern("yyyy-MM-dd H:m:s");
		// 変数に代入
		String date = d.format(nowDate);
		// コンソールに出力
		System.out.println(date);
	}
}
