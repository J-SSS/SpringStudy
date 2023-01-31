package polymorphism;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("tv")
public class LgTV implements TV {
	@Autowired
	@Qualifier("apple")
	private Speaker speaker;
	
	public void powerOn() {
		System.out.println("LgTv---���� �Ҵ�.");
	}
	public void powerOff() {
		System.out.println("LgTv---���� ����.");
	}
	public void volumeUp() {
		speaker.volumUp();
//		System.out.println("LgTv---�Ҹ� �ø���.");
	}
	public void volumeDown() {
		speaker.volumDown();
//		System.out.println("LgTv---�Ҹ� ������.");
	}
}
