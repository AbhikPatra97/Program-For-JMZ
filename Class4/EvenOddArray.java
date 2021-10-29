package Class4;

public class EvenOddArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,3,2,6,4,7,8};
		int[] eaar=new int[arr.length];
		int[] oaar=new int[arr.length];
		int j=0;
		int k=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				eaar[j]=arr[i];
				j++;
			}
			else {
				oaar[k]=arr[i];
				k++;
			}
		}
		
		System.out.println("Even Array");
		for(int i:eaar) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		System.out.println("Odd Array");
		for(int i:oaar) {
			System.out.print(i+" ");
		}
		
	}

}
