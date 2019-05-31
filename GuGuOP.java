package jump2java.myzoo;

public class GuGuOP {
	
	int dan;
	
	public GuGuOP() {
	}
	
	public GuGuOP(int input){
		this.dan = input;
	}
	
	public void printGuGuOdd() { // 홀홀
		for(int i=3; i<10; i++) {
			if(i%2 == 1) {
				for(int j=3; j<10; j++) {
					if(j%2==1) {
						System.out.print(j+"x"+i+"="+(j*i)+"\t");
					}
				}
				System.out.println("");
			}
		}
	}
	
	public void printGuGuEven() { // 짝짝
		for(int i=2; i<10; i++) {
			if(i%2 == 0) {
				for(int j=2; j<10; j++) {
					if(j%2==0) {
						System.out.print(j+"x"+i+"="+(j*i)+"\t");
					}
				}
				System.out.println("");
			}
		}
	}
		
	public void printGuGuOE() { // 홀짝
		for(int i=3; i<10; i++) {
			if(i%2 == 1) {
				for(int j=2; j<10; j++) {
					if(j%2==0) {
						System.out.print(j+"x"+i+"="+(j*i)+"\t");
					}
				}
				System.out.println("");
			}
		}
	}
	
	public void printGuGuEO() { // 짝홀
		for(int i=2; i<10; i++) {
			if(i%2 == 0) {
				for(int j=3; j<10; j++) {
					if(j%2==1) {
						System.out.print(j+"x"+i+"="+(j*i)+"\t");
					}
				}
				System.out.println("");
			}
		}
	}
}
