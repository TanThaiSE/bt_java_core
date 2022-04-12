package bai_tap_java_core;

import java.util.Scanner;

public class Bai17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int secNum= (int)(Math.random() * (1000 - 1 + 1) + 1);
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("Moi ban nhap so");
			int num=sc.nextInt();
			if(num>secNum) {
				System.out.println("Nhap so nho hon");
			}
			else if(num<secNum) {
				System.out.println("Nhap so lon hon");
			}
			else {
				System.out.println("Nhap dung roi");
				break;
			}
		}
	}

}
