package polymorphism;

public class LgTV implements TV {
	public void powerOn() {
		System.out.println("LgTv---���� �Ҵ�.");
	}
	public void powerOff() {
		System.out.println("LgTv---���� ����.");
	}
	public void volumeUp() {
		System.out.println("LgTv---�Ҹ� �ø���.");
	}
	public void volumeDown() {
		System.out.println("LgTv---�Ҹ� ������.");
	}
}
