package haftalikSorular_01;

import java.util.Scanner;

public class q2_scannner {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen bir kenar uzunlugu girin");
		int kenar=scan.nextInt();
		
		System.out.println("alan:"+kenar*kenar+"\n"+" cevre:"+kenar*4);

	}

}
