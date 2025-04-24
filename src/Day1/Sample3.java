package Day1;

import java.util.Scanner;

public class Sample3 {
	public static void main(String[] args) {
		Scanner src=new Scanner(System.in);
		Dispalymenu();
		//System.out.println("\t1.BJP");
		//System.out.println("\t2.Congress"+"\n"+"\t3.DMK"+"\n"+"\t4.AAP"+"\n"+"\t5.BRS"+"\n");
		System.out.println("Choose vote:");
		int vote=src.nextInt();
		switch(vote) {
		case 1:
			System.out.println("BJP");
			break;
		case 2:
			System.out.println("Congress");
			break;
		case 3:
			System.out.println("DMK");
			break;
		case 4:
			System.out.println("AAP");
			break;
		case 5:
			System.out.println("BRS");
			break;
		default:
		
			System.out.println("Independent");
		}
	}

	private static void Dispalymenu() {
		// TODO Auto-generated method stub
		System.out.println("\t1.BJP");
		System.out.println("\t2.Congress"+"\n"+"\t3.DMK"+"\n"+"\t4.AAP"+"\n"+"\t5.BRS"+"\n");
		
	}

}
