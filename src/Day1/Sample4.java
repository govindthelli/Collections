package Day1;

import java.util.Scanner;

public class Sample4 {
	public static void main(String[] args) {
		Scanner src=new Scanner(System.in);
		System.out.println("Enter amount");
		int Amount=src.nextInt();
		System.out.println("Enter case:");
		int c=src.nextInt();
		switch(c){
		case 1:
			System.out.println("deposit");
			int deposit=src.nextInt();
			Amount=Amount+deposit;
			System.out.println("Amount:" +Amount);
			break;
		case 2:
			System.out.println("withdraw");
			int withdraw=src.nextInt();
			Amount=Amount-withdraw;
			System.out.println("Amount:" +Amount);
			break;
			default:
				System.out.println("insufficient funds");
		
		}
	}

}
