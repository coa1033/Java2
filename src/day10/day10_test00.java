package day10;


import java.util.Scanner; 
public class day10_test00 {
	public static void main(String[] args) {
		Car a_car = new Car();
		Car b_car = new Car();
		Car c_car = new Car();
		

		a_car.이름 = "소나타";
//		a_car.최고속력 = scan.nextInt();
		a_car.introduce();
		
//		int [] a__car = new int[] {10,50,100};
//		introduce1(a__car);
//		
//		b_car.이름 = "아반떼";
//		b_car.최고속력 = scan.nextInt();
//		b_car.introduce();
//		
//		int [] b__car = new int[] {5,30,90};	
//		introduce1(b__car);
//		
//		c_car.이름 = "벤츠";
//		c_car.최고속력 = scan.nextInt();
//		c_car.introduce();
//		
//		int [] c__car = new int[] {20,70,130};
//		introduce1(c__car);
	}
//	static void introduce1(int[] s) {
//		System.out.println("=== 속력 측정 ===");
//		System.out.printf("초반속력 : %d km/h\n",s[0]);
//		System.out.printf("중반속력 : %d km/h\n",s[1]);
//		System.out.printf("종반속력 : %d km/h\n",s[2]);
//	}	
}
class Car {
	Scanner scan = new Scanner(System.in);
	String 이름;
	int 최고속력;
	
	
	void introduce() {
		System.out.printf("이름 : %s\n",이름);
		int 최고속력 = scan.nextInt();
		System.out.printf("최고속력 : %d km/h 입니다.\n", 최고속력);
	}
	
	void introduce2() {
		System.out.printf("최고속력 : %d km/h 입니다.\n",최고속력);
	}
}

