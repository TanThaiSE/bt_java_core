package bai_tap_java_core;

import java.util.Scanner;

public class Bai11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhap so n");
		int n=sc.nextInt();
		double resultLog2=Math.log(n)/Math.log(2);
		System.out.println("So tu nhien nho nhat lon hon log2(n): "+(int)resultLog2);
	}

}
