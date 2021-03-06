/*package ch7;
// p.392 인터페이스의 장점 -> 새로운 공통점 만들기


public class RepairableTest {

	public static void main(String[] args) {
		Tank tank = new Tank();
		Dropship dropship = new Dropship();
		
		Marine marine = new Marine();
		SCV scv = new SCV();
		scv.repair(tank);
		scv.repair(dropship);
//		scv.repair(marine); // 에러
	}

}

interface Repairable {}

class Unit {
	int hitPoint;
	final int MAX_HP;
	Unit(int hp){
		MAX_HP = hp;
	}
	// ...
}

class GroundUnit extends Unit {
	GroundUnit(int hp){
		super(hp);
	}
}

class AirUnit extends Unit{
	AirUnit(int hp){
		super(hp);
	}
}

class Tank extends GroundUnit implements Repairable {
	Tank(){
		super(150); // Tank의 HP는 150이다
		hitPoint = MAX_HP;
	}
	
	public String toString(){
		return "Tank";
	}
	// ...
}

class Dropship extends AirUnit implements Repairable {
	Dropship(){
		super(125);
		hitPoint = MAX_HP;
	}
	
	public String toString(){
		return "Dropship";
	}
	// ...
}

class Marine extends GroundUnit{ // 마린은 Repairable 없음
	Marine(){
		super(40);
		hitPoint = MAX_HP;
	}
	// ...
}

class SCV extends GroundUnit implements Repairable{
	SCV(){
		super(60);
		hitPoint = MAX_HP;
	}

	void repair(Repairable r){ // r을 주목
		if(r instanceof Unit){
			Unit u = (Unit)r;
			while(u.hitPoint!=u.MAX_HP){
				//unit의 hp를 증가시킨다
				u.hitPoint++;
			}
			System.out.println(u.toString() + "의 수리가 끝났습니다.");
		}
	}
}


*/