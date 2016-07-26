package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuickSort {
	public static Integer[] quickSort(Integer[] array){
		return sort(array, 0, array.length-1);
	}
	static Integer[] sort(Integer[] array, int left, int right){
				
		if(array.length == 1 || right <= left)
			return array;
		
		int i = left - 1;
		int j = right + 1;
		int pivot = array[(left + right) / 2];
		
		while(true){
			
			while(array[++i] < pivot)
				;
			
			while(array[--j] > pivot)
				;
			
			if(i <= j){
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
			else
				break;
		}
		
		if(j > left)
			sort(array, left, j);
		if(i < right)
			sort(array, i, right);
		
		return array;
	}
	

	
	public static void main(String[] args) {
		Integer[] array = new Integer[]{1,5,0,3,2,6,9,-1,7};
		array = quickSort(array);
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(array));
		list.forEach(System.out::print);
	}
}
