package forProcessing;

public class Status {
	// フィールド変数
	private int hp;// hp
	private int mp;// mp
	private int attack;// 攻撃力
	private int dex;// 素早さ
	private int resist;// 防御力
	
	// HPのgetter,setter
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	// MPのgetter,setter
	public int getMp() {
		return mp;
	}
	public void setMp(int mp) {
		this.mp = mp;
	}
	
	// 攻撃力のgetter,setter
	public int getAttack() {
		return attack;
	}
	public void setAttack(int attack) {
		this.attack = attack;
	}
	
	// 素早さのgetter,setter
	public int getDex() {
		return dex;
	}
	public void setDex(int dex) {
		this.dex = dex;
	}
	
	// 防御力のgetter,setter
	public int getResist() {
		return resist;
	}
	public void setResist(int resist) {
		this.resist = resist;
	}
}
