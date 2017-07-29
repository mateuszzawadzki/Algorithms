package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuickSort {
	public static void quickSort(Integer[] array) {
		sort(array, 0, array.length-1);
	}

	private static void sort(Integer[] array, int lo, int hi) {
		if (hi <= lo) {
			return;
		}
		int j = partition(array, lo, hi);
		sort(array, lo, j-1);
		sort(array, j+1, hi);

	}

	private static int partition(Integer[] array, int lo, int hi) {
		int p = lo;
		int i = lo;
		int j = hi + 1;

		while (true) {
			while (array[++i] < array[p]) {
				if(i == hi) {
					break;
				}
			}

			while (array[--j] > array[p]) {
				if(j == lo) {
					break;
				}
			}

			if (i >= j) {
				break;
			}

			swap(array, i, j);
		}

		swap(array, j, p);

		return j;
	}

	public static void swap(Integer[] array, int s1, int s2) {
		int temp = array[s1];
		array[s1] = array[s2];
		array[s2] = temp;
	}
	
	public static void main(String[] args) {
		Integer[] array = new Integer[]{1,5,0,3,2,6,9,-1,7};
		quickSort(array);
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(array));
		list.forEach(System.out::print);
	}
}
