package Class4;

public class AssendingDecendingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,3,5,4,7,1,6,8,9};
	
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				int temp;
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}	
		}
		System.out.println("Ascending Order");
		for(int i:arr) {
			System.out.print(i+" ");
		}

		System.out.println();
		System.out.println("Dscending Order");
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				int temp;
				if(arr[i]<arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}	
		}
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}

}
