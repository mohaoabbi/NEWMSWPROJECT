package wedProject;

import java.util.Arrays;

public class loops {
public static int x=3;
static int c = 3;

static int[] y = {1,2,3};
static int[]w = y ;
static int[] z = {1,2,3};

static int[] arr = {1,2,4,3,7,6};
static int[] arr1 = {1,2,4,3,7,6};
static int[] arr2 = arr1;
    

	public static void main(String[] args) {
		for (int i=0;i<100;i+=3) System.out.println(i);
		stfun(20);
		stfun(16);
		stfun(2);
		System.out.println(y);
		System.out.println(z);
		System.out.println(y==z);
		System.out.println(y==w);
		System.out.println(x==c);
		System.out.println(arr);
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.equals(arr, arr1));
		System.out.println(Arrays.equals(arr1, arr2));
		arr1[0] = 9;
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		arr2[0]=99;
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.equals(arr1, arr2));
	}
public static void  stfun(int x) {
	
	String Tot = x >18 ?    "Adult" : "Kid";
	System.out.println(Tot);
	
}


}
