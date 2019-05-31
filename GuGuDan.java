package jump2java.myzoo;

import java.util.Scanner;

public class GuGuDan {
	
	public void getGuGu(int num) {
		for(int i=1; i<10; i++) {
			System.out.println(num+"X"+i+" = "+(num*i));
		}
	}
	
	public void getAGuGu() {
		for(int i=1; i<10; i++) {
			for(int j=2; j<10; j++) {
				System.out.print(j+"x"+i+"="+(j*i)+"\t");
			}
			System.out.println("");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		GuGuDan ggd = new GuGuDan();

		System.out.println("원하시는 단을 입력하세요.모든 단을 보려면 0입력");
		
		int num = sc.nextInt();
		if(num==0) {
			ggd.getAGuGu();			
		} else {
			ggd.getGuGu(num);			
		}
	}
		
}
