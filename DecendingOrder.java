package string;

import java.util.Scanner;

public class DecendingOrder {

	public static void num(int num) {
		int sum=0;
		for(int i=9;i>=0;i--) {
			int temp=num;
			while(temp>0) {
			int ld=temp%10;
			if(i==ld)
			sum=sum*10+ld;
			temp=temp/10;
		}
		}
			System.out.println(sum);
	}
	
	public static void main(String [] args) {
	Scanner sc=new Scanner(System.in) ;
		System.out.println("Enter ab num:");
		int num=sc.nextInt();
			num(num);
	}
}
