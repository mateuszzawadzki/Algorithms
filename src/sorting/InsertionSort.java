package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class InsertionSort {
	public static Integer[] insertionSort(Integer[] array){
			for(int i=1; i<array.length; ++i){
				Integer key = array[i];
				int j=i-1;
				while(j>-1 && array[j]>key){
					array[j+1]=array[j];
					j=j-1;
				}
				array[j+1]=key;
			}
		return array;
	}
	public static void main(String[] args){
		Integer[] array = new Integer[]{1,5,78,3,2,5,7,8};
		insertionSort(array);
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(array));
		list.forEach(System.out::print);
		
	}
	
}
