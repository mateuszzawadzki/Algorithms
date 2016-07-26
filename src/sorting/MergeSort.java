package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {
	public static Integer[] mergeSort(Integer[] array){
		int n = array.length;
		if(n == 1)
			return array;
		
		
		Integer[] splitted1 = Arrays.copyOfRange(array, 0, n/2);
		Integer[] splitted2 = Arrays.copyOfRange(array, n/2, n);
		
		splitted1 = mergeSort(splitted1);
		splitted2 = mergeSort(splitted2);
		
		return merge(splitted1, splitted2);
	}
	public static Integer[] merge(Integer[] array1, Integer[] array2){
		int i = 0;
		int j = 0;
		int k = 0;
		Integer[] result = new Integer[array1.length + array2.length];
		
		while(i < array1.length && j < array2.length){
			if(array1[i] > array2[j]){
				result[k++] = array2[j++];
			}
			else{
				result[k++] = array1[i++];
			}
		}
		
		
		while(i < array1.length){
			result[k++] = array1[i++];
		}
		
		while(j < array2.length){
			result[k++] = array2[j++];
		}
		
		return result;
	}
	public static void main(String[] args) {
		Integer[] array = new Integer[]{1,5,0,3,2,6,9,-1,7};
		array = mergeSort(array);
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(array));
		list.forEach(System.out::print);
	}
}
