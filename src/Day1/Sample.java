package Day1;

import java.util.Scanner;

public class Sample {
public static void main(String[] args) {
	System.out.println("Enter the age:");
	Scanner src=new Scanner(System.in);
	int age=src.nextInt();
	if(age>=18 && age<=120) {
		System.out.println("Eligible");
	}else {
		System.out.println("Not Eligible");
	}
}
}
