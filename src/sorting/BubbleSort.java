package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BubbleSort {
	public static Integer[] bubbleSort(Integer[] array){
		int temp = 0;
		boolean swapped = false;
		for(int i = 0; i < array.length-1; i++){
			swapped = false;
			for(int j = 0; j < array.length-1; j++){
				if(array[j] > array[j+1]){
					swapped = true;
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
			if(!swapped)
				break;
		}
		return array;
	}
	public static void main(String[] args) {
		Integer[] array = new Integer[]{1,5,-1,3,2,5,7,8};
		bubbleSort(array);
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(array));
		list.forEach(System.out::print);
	}
}
