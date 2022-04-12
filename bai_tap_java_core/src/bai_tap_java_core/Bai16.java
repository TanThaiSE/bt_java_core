package bai_tap_java_core;

import java.util.Scanner;

public class Bai16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhap nam");
		int year=sc.nextInt();
		if ((year % 400 == 0)||(year % 4 == 0 && year % 100 != 0)) {
			System.out.println("La nam nhuan");
		} 
		else {
			System.out.println("Khong la nam nhuan");
		}
	}

}
