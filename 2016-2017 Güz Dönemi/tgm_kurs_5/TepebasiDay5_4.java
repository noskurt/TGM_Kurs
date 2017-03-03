package tgm_kurs_5;

import java.util.Arrays;

public class TepebasiDay5_4 {

	public static void main (String[] args) {

		int[] array = {4, 10, 2, 1, 150};
		int[] newSortedArray = new int[array.length];

		for (int i : array)
			System.out.print(i + " ");

		System.out.println();

		// Arrays sınıfının sort methodunu
		// kulanarak sıralama işlemi yaptırdık
		Arrays.sort(array);

		for (int i : array)
			System.out.print(i + " ");

		System.out.println();
		
		// Bu döngüde oluşturduğumuz yeni diziyi
		// yeni bir diziye aktarma işlemi yaptık
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.print(array[i] + " ");
			newSortedArray[i] = array[array.length - 1 - i];
		}

		System.out.println();

		for (int i : newSortedArray)
			System.out.print(i + " ");

	}

}
