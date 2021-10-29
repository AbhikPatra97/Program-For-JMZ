package Class1;

public class ReverseString {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Abhik";
		String r="";
	
		for(int i=s.length()-1;i>=0;i--) {
			r=r+s.charAt(i);
			
		}
		System.out.println(r);
		
		String s1="abc";
		char[] ch=s1.toCharArray();
		char[] rch=new char[ch.length];
		for(int i=0;i<ch.length;i++) {
			rch[i]=ch[ch.length-1-i];
		}
		for(char i:rch) {
			System.out.print(i);
		}
	}

}
