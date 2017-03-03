package tgm_kurs_5;

import java.util.Arrays;

public class TepebasiDay5_3 {

	public static void main (String[] args) {

		// Bir methodun içerisine dizi gönderdiğimiz
		// zaman o diziye bir değişiklik yaparsak
		// diziyi nerde okursak okuyalım her yerde değişir

		int[] array = {4, 5, 6, 7};
		System.out.println("Main " + array[array.length - 1]);
		arrayMethod(array);
		System.out.println("Main " + array[array.length - 1]);
		System.out.println("Search " + Arrays.binarySearch(array, 120));
	}

	public static void arrayMethod (int[] array) {
		for (int i : array)
			System.out.print(i + " ");
		array[3] = 55;
		System.out.println("Method " + array[3]);
	}

}
