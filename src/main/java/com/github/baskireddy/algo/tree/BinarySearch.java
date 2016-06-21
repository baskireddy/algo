package com.github.baskireddy.algo.tree;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer searchElement =10;
		//Integer[] elements = new Utils().sortedRandomInts(10);
		Integer[] elements = {36, 166, 174, 201, 476, 609, 658, 733, 935, 944};
		search(elements,36);
		search(elements,944);
		search(elements,609);
		
		
	}
	
	public static void search(Integer[] array, Integer element) {
		
		int start = 0, end=array.length, mid = -1;
		int pass = 0;
		while(start< end) {
			mid= (start + end)/2;
			pass++;
			if(array[mid].equals(element)) {
				break;
			} else if(array[mid] < element) {
				start=mid+1;
			} else {
				end=mid-1;
			}
			
		}
		System.out.println("Pass ..... " + pass);
		return;
	}

}
