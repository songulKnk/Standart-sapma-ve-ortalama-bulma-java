import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		

		Scanner girdi = new Scanner(System.in);
		System.out.print("Kaç öðrenci için istatistik hesaplanacak:");
		int ogrenci = girdi.nextInt();
		int i, toplam = 0, max, min;
		int ort = 0;
		double sapma = 0;
		int[] dizi = new int[ogrenci];
		max = dizi[0];
		min = dizi[0];

		for (i = 1; i <= dizi.length; i++) {

			System.out.print(i + ".Öðrenci :");
			int s = girdi.nextInt();

			if (s <= 0 && s >= 100) {
				System.out.print("Not 0 ile 100 arasýnda olmalýdýr");
				System.out.print(i + ".Öðrenci :");
				s = girdi.nextInt();
				dizi[i - 1] = s;

			}

			else {
				dizi[i - 1] = s;
			}

		}

		for (i = 0; i < dizi.length; i++) {

			toplam = toplam + dizi[i];

		}
		ort = toplam / ogrenci;

		System.out.println("Ortalama:" + ort);

		for (i = 0; i < dizi.length; i++) {

			dizi[i] = dizi[i] - ort;
			dizi[i] = dizi[i] * dizi[i];
			sapma = sapma + dizi[i];

		}

		sapma = sapma / (ogrenci - 1);
		System.out.println("Standart Sapma:" + Math.sqrt(sapma));
		
		

		for (i = 0; i < dizi.length; i++) {
			dizi[i] = girdi.nextInt();
		}

		for (i = 1; i < dizi.length; i++) {
			if (dizi[i] > max) {
				max = dizi[i];
			}
		}

		for (i = 1; i < dizi.length; i++) {
			if (dizi[i] < min) {
				min = dizi[i];
			}
		}

		System.out.println("Max not =" + max);
		System.out.println("Min not =" + min);

	}

}