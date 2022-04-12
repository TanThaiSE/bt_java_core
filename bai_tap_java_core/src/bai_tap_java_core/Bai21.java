package bai_tap_java_core;

import java.util.Scanner;

public class Bai21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhap x1, x2,v1,v2");
		int x1=sc.nextInt();
		int x2=sc.nextInt();
		int v1=sc.nextInt();
		int v2=sc.nextInt();
		double result=(x1-x2)*1.0/(v2-v1);
		if(((x1-x2)%(v2-v1)==0)&&result>0) {
			System.out.println("Gap nhau");
		}
		else {
			System.out.println("Khong gap nhau");
		}
	}

}
