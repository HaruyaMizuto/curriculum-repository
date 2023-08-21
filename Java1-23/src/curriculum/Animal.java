package curriculum;

public class Animal {
	// フィールド
	private String name;// 動物名
	private double size;// 体長
	private int speed;// 速度	
	
	// setter
	// 動物名を設定
	public void setName(String name) {
		this.name = name;
	}
	// 体長を設定
	public void setSize(double size) {
		this.size = size;
	}
	// 速度を設定
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	// getter
	// 動物名を取得
	public String getName() {
		return this.name;
	}
	
	// 体長を取得 
	public double getSize() {
		return this.size;
	}
	
	// 速度を取得
	public int getSpeed() {
		return this.speed;
	}
}
