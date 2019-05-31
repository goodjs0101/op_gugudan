package jump2java.myzoo;

import java.util.Scanner;

public class GuGu extends GuGuOP {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		GuGu gg = new GuGu();
		
		String str = sc.next();

		if(str.equals("홀홀")) {
			gg.printGuGuOdd();
		} else if(str.equals("짝짝")) {
			gg.printGuGuEven();
		} else if(str.equals("홀짝")) {
			gg.printGuGuOE();
		} else if(str.equals("짝홀")) {
			gg.printGuGuEO();	
		}
	}
}
