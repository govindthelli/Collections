package Day1;

import java.util.Scanner;

public class Sample2 {
public static void main(String[] args) {
	Scanner src=new Scanner(System.in);
	System.out.println("Enter Height:");
	double heigth=src.nextDouble();
	System.out.println("Enter the weigth:");
	double weigth=src.nextDouble();
	if(heigth>5.5 && heigth<=6.0) {
		if(weigth>=60 && weigth<=70) {
			System.out.println("Eligible");
		}else {
			System.out.println("NotEligible");
		}
	}else {
		System.out.println("Error");
	}
}
}
