package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {

	private static Integer[] auxiliary;

	public static void mergeSort(Integer[] array){
		auxiliary = new Integer[array.length];
		sort(array, auxiliary, 0, array.length-1);
	}

	private static void sort(Integer[] array, Integer[] auxiliary, int lo, int hi){
		if (hi <= lo) {
			return;
		}

		int mid = lo + (hi - lo) / 2;
		sort(array, auxiliary, lo, mid);
		sort(array, auxiliary, mid+1, hi);
		merge(array, auxiliary, lo, mid, hi);
	}

	private static void merge(Integer[] array, Integer[] auxiliary, int lo, int mid, int hi){
		for (int k = lo; k <= hi; k++) {
			auxiliary[k] = array[k];
		}

		int i = lo;
		int j = mid + 1;

		for (int k = lo; k<= hi; k++) {
			if (i > mid ) {
				array[k] = auxiliary[j++];
			} else if (j > hi) {
				array[k] = auxiliary[i++];
			} else if (auxiliary[j] < auxiliary[i]) {
				array[k] = auxiliary[j++];
			} else if (auxiliary[j] > auxiliary[i]) {
				array[k] = auxiliary[i++];
			}
		}
	}

	public static void main(String[] args) {
		Integer[] array = new Integer[]{1,5,0,3,2,6,9,-1,7};
		mergeSort(array);
		List<Integer> list = new ArrayList<>(Arrays.asList(array));
		list.forEach(System.out::print);
	}
}
