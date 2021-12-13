package haftalikSorular_01;

import java.util.Scanner;

public class q1_scanner {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen bir sayi girin");
		int sayi=scan.nextInt();
		
		System.out.println((sayi*sayi*sayi)/2);
	}

}
