package Day1;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5,6,7,8,9};
		int[] raar=new int[arr.length];
		
		for(int i=0;i<arr.length;i++) {
			raar[i]=arr[arr.length-1-i];
		}
		
		for(int i=0;i<raar.length;i++) {
			System.out.print(raar[i]+" ");
		}

	}

}
