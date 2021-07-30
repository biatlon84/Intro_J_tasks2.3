package com.epam.training.task_8;

public class QuickSort {
	public static void sort(Array arL) {
		quickSort(arL, 0, arL.size() - 1);
	}

	private static void swap(Array ar, int i, int j) {
		Fraction bu = ar.getByIndex(i);
		ar.setDr(ar.getByIndex(j), i);
		ar.setDr(bu, j);
	}

	private static void quickSort(Array ar, int low, int high) {
		if (low >= high)
			return;
		long ref = ar.getByIndex(low + (high - low) / 2).numerator;
		int i = low, j = high;
		while (i <= j) {
			while (ar.getByIndex(i).numerator < ref) {
				i++;
			}
			while (ar.getByIndex(j).numerator > ref) {
				j--;
			}
			if ((i <= j)) {
				swap(ar, i, j);
				i++;
				j--;
			}
		}
		if (low < j)
			quickSort(ar, low, j);

		if (high > i)
			quickSort(ar, i, high);
	}
}
