package bai_tap_java_core;

import java.util.Scanner;

public class Bai15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhap chuoi");
		String chuoi=sc.nextLine();
		System.out.println("Do dai chuoi: "+chuoi.length());
		System.out.println("Nhap vi tri");
		int viTri=sc.nextInt();
		System.out.println("Ki tu tai vi tri "+ viTri+" la: "+chuoi.charAt(viTri));
		int checkViTri=chuoi.indexOf("abcdef");
		if(checkViTri!=-1) {
			System.out.println("Co chuoi phu abcdef");
		}
		else {
			System.out.println("Khong chuoi phu abcdef");
		}
	}

}
