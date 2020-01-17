package mdefiers;

import java.util.Arrays;

public class arrClass {

	public static void main(String[] args) {
		String s = "abdelkader";
		
		String s1 = new String("abdelkader");
		
		System.out.println(s.indexOf("d"));
		System.out.println(s.toUpperCase());
		System.out.println(s.replace('d', '$'));
		
		int[]  arr= new int[4];
		arr[0]=5;
		arr[1]=15;
		arr[2]=25;
		arr[3]=115;
		
		int[] arr1 = {5,15,25,115};
		
		
	
		System.out.println(arr);
		System.out.println(arr1);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr1));
		
		System.out.println(arr == arr1);
		

		
	}

}
