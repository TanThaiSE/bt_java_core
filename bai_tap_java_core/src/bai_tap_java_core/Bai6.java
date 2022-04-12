package bai_tap_java_core;

import java.util.Scanner;

public class Bai6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Nhap chuoi");
		Scanner sc=new Scanner(System.in);
		String result=sc.nextLine();
		
		StringBuffer sbr=new StringBuffer(result);
		sbr.reverse();
		System.out.println("Chuoi nguoc la: "+sbr);
	}

}
