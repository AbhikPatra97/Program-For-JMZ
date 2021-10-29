package Class5;

public class For_While_ForEach_DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {0,1,5,6,2,0,1,0};
		
		System.out.println("For loop");
		for(int i=0;i<a.length;i++) {
			if(a[i]>0) {
				System.out.print(a[i]+" ");
			}
		}
		
		System.out.println();
		System.out.println("For Each loop");
		for(int i:a) {
			if(i>0) {
				System.out.print(i+" ");
			}
		}
		
		System.out.println();
		System.out.println("While loop");
		int i=0;
		while(i<a.length) {
			if(a[i]>0) {
				System.out.print(a[i]+" ");
			}
			i++;
		}
		
		System.out.println();
		System.out.println("Do While loop");
		int j=0;
		do {
			if(a[j]>0) {
				System.out.print(a[j]+" ");
			}
			j++;
		}
		while(j<a.length);

	}

}
