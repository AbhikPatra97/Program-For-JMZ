package Day1;

import java.util.Arrays;

public class AccendingDescendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int[] arr = {2,3,5,8,4,7,6,9,1};
	    int temp;
	    System.out.println("Ascending order of Array");
	    for(int i = 0; i<arr.length; i++) {
	    	for (int j = i+1; j<arr.length; j++) {
	    		if(arr[i]>(arr[j])) {
	    			temp = arr[i];
	    			arr[i] = arr[j];
	    			arr[j] = temp;
	    			}
	    		}
	    	}
	    for(int i:arr) {
	    	System.out.print(i+" ");
	    	}
	    
	    System.out.println();
	    
	    System.out.println("Dscending order of Array");
	    for(int i = 0; i<arr.length; i++) {
	    	for (int j = i+1; j<arr.length; j++) {
	    		if(arr[i]<(arr[j])) {
	    			temp = arr[i];
	    			arr[i] = arr[j];
	    			arr[j] = temp;
	    			}
	    		}
	    	}
	    for(int i:arr) {
	    	System.out.print(i+" ");
	    	}
	    }
	}