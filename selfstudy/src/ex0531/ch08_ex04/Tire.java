package ex0531.ch08_ex04;

public class Tire {
//	필드
	public int maxRotation;						//최대 회전수(최대 수명)
	public int accumulatedRotation;	// 누적 회전수
	public String location;						// 타이어의 위치
	
//	생성자
//	Car class의 필드 값 초기화 생성자
	public Tire(String location, int maxRotation) {
		this.location = location;									//	"앞 왼쪽","앞 오른쪽","뒤 왼쪽","뒤 오른쪽"
		this.maxRotation = maxRotation;				//   6, 2, 3, 4
	}
//	메소드
	public boolean roll() {
//		누적회전수++
		++accumulatedRotation;		// 1					
//																6, 2, 3, 4
		if (accumulatedRotation < maxRotation) {				// 누적회전수 < 최대 회전수
																										// 누적회전수 - 최대 회전수
			System.out.println(location + "타이어 수명:" + (maxRotation - accumulatedRotation) + "회");
			return true;
		} else {
			System.out.println("***" + location + "Tire 펑크 ***");
			return false;
		}
	}

}

