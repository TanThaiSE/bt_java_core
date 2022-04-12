package bai_tap_java_core;

public class Bai1 {

	static void displayEqual() {
		System.out.println("==================================");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<9;i++) {
			if(i%2==0)
			{
				System.out.print("* * * * * * ");
				displayEqual();
			}
			else {
				System.out.print(" * * * * *  ");
				displayEqual();
			}
		}
		for(int i=0;i<6;i++) {
			System.out.print("============");
			displayEqual();
		}
		
	}

}
