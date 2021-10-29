package Day1;

import java.util.Arrays;

public class RemoveDuplicateElementFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,2};
		Arrays.sort(arr);
		
		int temp[]=new int[arr.length];
		int j=0;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]!=arr[i+1]) {
				temp[j]=arr[i];
				j++;
			}
			temp[j]=arr[arr.length-1];
		}
		
		System.out.println(j);
		for(int i:temp) {
			System.out.println(i);
		}

	}

}
