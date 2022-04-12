package bai_tap_java_core;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai14 {
	static void removeDuplicate(int []n) {
		ArrayList<Integer> lstTemp=new ArrayList<>();
		for(int i=0;i<n.length;i++) {
			if(!lstTemp.contains(n[i])) {
				lstTemp.add(n[i]);
			}
		}
		System.out.println("Mang moi sau khi xoa phan tu lap");
		for(int i=0;i<lstTemp.size();i++) {
			System.out.print(lstTemp.get(i)+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhap so n");
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("Nhap phan tu thu"+(i+1));
			arr[i]=sc.nextInt();
		}
		removeDuplicate(arr);
	}

}
