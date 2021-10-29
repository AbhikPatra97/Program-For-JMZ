package Class4;

import java.util.Arrays;

public class ArraysSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[] arr= {2,3,5,4,7,1,6,8,9};
			
			Arrays.sort(arr);
			
			System.out.println("Ascending Array");
			for(int i:arr) {
				System.out.print(i+" ");
			}
			
			System.out.println();
			System.out.println("Dscending Array");
			for(int i=arr.length-1;i>=0;i--) {
				System.out.print(arr[i]+" ");
			}
		}

	}
