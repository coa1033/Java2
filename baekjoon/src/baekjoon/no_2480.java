package baekjoon;
import java.util.*;

public class no_2480 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		
		if (a == b && a !=c && b !=c) {
			System.out.println(1000+(a+b)*100);
		}else if (a != b && a ==c && b !=c) {
			System.out.println(1000+(a+c)*100);
		}else if (a != b && a !=c && b ==c) {
			System.out.println(1000+(b+c)*100);
		}else if (a>b && a>c) {
			System.out.println(100*a);
		}else if (b>a && b>c) {
			System.out.println(100*b);
		}else if (c>b && c>a) {
			System.out.println(100*c);
		}else  {
			System.out.println(10000+(a+b+c)*1000);
		}
	}
}
