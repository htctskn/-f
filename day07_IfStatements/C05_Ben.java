package day07_IfStatements;

import java.util.Scanner;

public class C05_Ben {

	public static void main(String[] args) {
		// kullanicidan gun ismi alin.
		// cuma ise muslumanlar icin kutsal gun
		// cumartesi ise yahudiler icin kutsal gun
		// pazar ise Hristiyanlar icin kutsal gun yazdirin

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen gun ismini yaziniz");
		String gun = scan.next().toLowerCase();

		if (gun.equals("Cuma")) {
			System.out.println("muslumanlar icin kutsal gun");

		}

		if (gun.equals("Cumartesi")) {
			System.out.println("yahudiler icin kutsal gun");
		}

		if (gun.equals("Pazar")) {
			System.out.println("Hristiyanlar icin kutsal gun");
		}

		if (!gun.equals("Cuma") || !gun.equals("Cumartesi") || !gun.equals("Pazara")) {
			System.out.println("lutfen gecerli bir gun giriniz");

		}

		scan.close();
	}

}
