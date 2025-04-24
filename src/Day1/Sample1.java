package Day1;

import java.util.Scanner;

public class Sample1 {
	public static void main(String[] args) {
		Scanner src=new Scanner(System.in);
		System.out.println("Enter CGPA:");
		double cgpa=src.nextDouble();
		if(cgpa>=9.0 && cgpa<=10.0) {
			System.out.println("O Grade");
		}else if(cgpa>=8.0 && cgpa<=8.99) {
			System.out.println("A Grade");
			
		}else if(cgpa>=7.0 && cgpa<=7.99) {
			System.out.println("B Grade");
		}else if(cgpa>=6.0 && cgpa<=6.99) {
			System.out.println("C Grade");
		}else if(cgpa>=5.0 && cgpa<=5.99) {
		System.out.println("D Grade");
	}else if (cgpa>=4.0 && cgpa<=4.99) {
		System.out.println("E Grade");
	}else if (cgpa<=3.99){
		System.out.println("Failed");
	}
	}
}
