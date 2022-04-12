package bai_tap_java_core;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai13 {

	static void giaTriTrungBinh(int []n) {
		int sum=0;
		for(int i=0;i<n.length;i++) {
			sum+=n[i];
		}
		double res=sum*1.0/n.length;
		System.out.println("Gia tri trung binh "+ res);
	}
	static void phanTuLonNhatNhoNhat(int []n) {
		int maxNum=n[0];
		int minNum=n[0];
		
		for(int i=0;i<n.length;i++) {
			if(n[i]>maxNum) {
				maxNum=n[i];
			}
			if(n[i]<minNum) {
				minNum=n[i];
			}
		}
		System.out.println("Phan tu lon nhat "+maxNum);
		System.out.println("Phan tu nho nhat "+minNum);

	}
	
	static void phanTuAmLonNhoNhat(int []n) {
		int minNeg=n[0];
		int maxNeg=n[0];
		
		for(int i=0;i<n.length;i++) {
			if(n[i]<0&&(minNeg>0||maxNeg>0)) {
				minNeg=n[i];
				maxNeg=n[i];
			}
			if(n[i]<0) {
				
				if(n[i]>maxNeg) {
					maxNeg=n[i];
				}
				if(n[i]<minNeg) {
					minNeg=n[i];
				}
			}
			
		}
		if(maxNeg>=0||minNeg>=0) {
			System.out.println("Khong co phan tu am");
		}
		else {
			System.out.println("Phan tu am lon nhat "+maxNeg);
			System.out.println("Phan tu am nho nhat "+minNeg);
		}


	}
	
	static void phanTuDuongLonNhoNhat(int []n) {
		int minNonNeg=n[0];
		int maxNonNeg=n[0];
		
		for(int i=0;i<n.length;i++) {
			if(n[i]>0&&(minNonNeg<=0||maxNonNeg<=0)) {
				minNonNeg=n[i];
				maxNonNeg=n[i];
			}
			if(n[i]>0) {
				
				if(n[i]>maxNonNeg) {
					maxNonNeg=n[i];
				}
				if(n[i]<minNonNeg) {
					minNonNeg=n[i];
				}
			}
			
		}
		if(maxNonNeg<=0||minNonNeg<=0) {
			System.out.println("Khong co phan tu duong");
		}
		else {
			System.out.println("Phan tu duong lon nhat "+maxNonNeg);
			System.out.println("Phan tu duong nho nhat "+minNonNeg);
		}


	}
	
	static void phanTuChanLe(int []n) {
		ArrayList<Integer> lstChan=new ArrayList<>();
		ArrayList<Integer> lstLe=new ArrayList<>();
		for(int i=0;i<n.length;i++) {
			if(n[i]%2==0) {
				lstChan.add(n[i]);
			}
			else {
				lstLe.add(n[i]);
			}
		}
		System.out.println("Phan tu chan");
		for(int i=0;i<lstChan.size();i++) {
			System.out.print(lstChan.get(i)+" ");
		}
		System.out.println("\nPhan tu le");
		for(int i=0;i<lstLe.size();i++) {
			System.out.print(lstLe.get(i)+" ");
		}
		System.out.println();
	}
	static void addNewElement(int[]n,int numAdd,int posAdd) {
		ArrayList<Integer> lstTemp=new ArrayList<>();
		for(int i=0;i<n.length;i++) {
			lstTemp.add(n[i]);
		}
		lstTemp.add(posAdd, numAdd);
		System.out.println("Mang moi sau khi them");
		for(int i=0;i<lstTemp.size();i++) {
			System.out.println(lstTemp.get(i)+" ");
		}
	}
	static void removePos(int[]n,int posRemove) {
		ArrayList<Integer> lstTemp=new ArrayList<>();
		for(int i=0;i<n.length;i++) {
			lstTemp.add(n[i]);
		}
		lstTemp.remove(posRemove);
		System.out.println("Mang moi sau khi xoa");
		for(int i=0;i<lstTemp.size();i++) {
			System.out.println(lstTemp.get(i)+" ");
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
		
		giaTriTrungBinh(arr);
		phanTuLonNhatNhoNhat(arr);
		phanTuAmLonNhoNhat(arr);
		phanTuDuongLonNhoNhat(arr);
		phanTuChanLe(arr);
		
		System.out.println("Nhap vi tri can them");
		int posAdd=sc.nextInt();
		System.out.println("Nhap gia tri them");
		int valueAdd=sc.nextInt();
		addNewElement(arr, valueAdd, posAdd);
		System.out.println("Nhap vi tri xoa");
		int posRemove=sc.nextInt();
		removePos(arr,posRemove);
	}

}
