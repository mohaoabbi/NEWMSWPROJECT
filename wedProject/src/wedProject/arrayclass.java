package wedProject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class arrayclass {

	public static void main(String[] args) {
		/*
		Scanner scn = new Scanner(System.in);
		int x=scn.nextInt();
		int	y=scn.nextInt();
		int z=scn.nextInt();
		
		
		int[] numbers = {x,y,z};
		
		System.out.println(numbers.length);
		
		System.out.println(Arrays.toString(numbers));
		System.out.println(Arrays.hashCode(numbers));
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));
		System.out.println("--------------------------------------------------------");
		*/
		int [][]  arr = new int[2][3];
		arr[1][0] = 5;
		System.out.println(arr);
		System.out.println(Arrays.deepToString(arr));
		System.out.println(arr[1]);
		System.out.println(Arrays.toString(arr[1]));
		System.out.println(Arrays.toString(arr[0]));
		
	ArrayList<Object> arrlist = new ArrayList<Object>();
	
	arrlist.add(9);
	arrlist.add(13);
	
	System.out.println(arrlist.size());
	System.out.println(arrlist);
	arrlist.add(100);
	arrlist.add(9);
	arrlist.add(100);
	System.out.println(arrlist);
	
	arrlist.set(3, 400);
	System.out.println(arrlist);
	}

}
