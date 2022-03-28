package baekjoon;
import java.util.Scanner;
public class no_14681 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int i = scan.nextInt();
		int j = scan.nextInt();
		
		if (0<i && 0<j){
			System.out.println(1);
		}else if (i<0 && 0<j){
			System.out.println(2);
		}else if (i<0 && j<0){
			System.out.println(3);
		}else {
			System.out.println(4);
		}
	}
}
