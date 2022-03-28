package day14;

public class study00 {
	public static void main(String[] args) {
		오리 a오리 = new 오리();
	    a오리.날다();
	    a오리.수영하다();
	    
	    System.out.println("==천둥오리==");
	    천둥오리 a천둥오리 = new 천둥오리();
	    a천둥오리.날다();
	    a천둥오리.수영하다();
	    System.out.println("==흰오리==");
	    흰오리 a흰오리 = new 흰오리();
	    a흰오리.날다();
	    a흰오리.수영하다();
	    System.out.println("==고무오리==");
	    고무오리 a고무오리 = new 고무오리();
	    a고무오리.날다();
	    a고무오리.수영하다();
	    System.out.println("==고무2오리==");
	    고무2오리 a고무2오리 = new 고무2오리();
	    a고무2오리.날다();
	    a고무2오리.수영하다();
	}
}
class 오리 {
	void 날다() {
		System.out.println("오리가 날개로 날아갑니다!!!");
	}
	void 수영하다() {
		System.out.println("오리가 물갈퀴로 수영합니다");
	}
}
class 천둥오리 extends 오리 {
}
class 흰오리 extends 오리 {
}
class 고무오리 extends 오리 {
	void 날다() {
	    System.out.println("고무오리는 날 수 없어요. ㅜㅠ");
	  }
}

class 고무2오리 extends 고무오리 {
	void 날다() {
	    System.out.println("고무2오리는 날 수 없어요. ㅜㅠ");
	  }
}