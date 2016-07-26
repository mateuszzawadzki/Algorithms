package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SelectionSort {

	public static Integer[] selectionSort(Integer[] array) {

		int min;
		int temp;
		
		for(int i = 0; i < array.length; i++){
			
			min = i;
			
			for(int j = i+1; j < array.length; j++){
				if(array[j] < array[min])
					min = j;
			}
			
			if(min != i){
				temp = array[i];
				array[i] = array[min];
				array[min] = temp;
			}
		}
		return array;
	}
	
	public static void main(String[] args) {
		Integer[] array = new Integer[]{1,5,0,3,2,6,9,-1,7};
		array = selectionSort(array);
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(array));
		list.forEach(System.out::print);
	}
}
