package bai_tap_java_core;

import java.util.Scanner;

public class Bai9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhap so thu nhat");
		int num1=sc.nextInt();
		System.out.println("Nhap so thu hai");
		int num2=sc.nextInt();
		String temNum1=Integer.toString(num1);
		String temNum2=Integer.toString(num2);
		if(temNum2.contains(String.valueOf(temNum1.charAt(0)))||temNum2.contains(String.valueOf(temNum1.charAt(1)))) {
			System.out.println("TRUE");
		}
		else {
			System.out.println("FALSE");
		}
	}

}
