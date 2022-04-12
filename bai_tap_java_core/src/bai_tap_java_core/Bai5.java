package bai_tap_java_core;

import java.util.Scanner;

public class Bai5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhap A(x1,y1) ");
		int x1=sc.nextInt();
		int y1=sc.nextInt();
		System.out.println("Nhap B(x2,y2) ");
		int x2=sc.nextInt();
		int y2=sc.nextInt();
		double AB= Math.pow(Math.pow((x1-x2), 2)+Math.pow((y1-y2),2),0.5);
		System.out.println("Do dai doan AB: "+AB);
	}

}
