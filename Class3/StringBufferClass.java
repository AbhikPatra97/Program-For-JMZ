package Class3;

public class StringBufferClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hello,world,kool,ok";
		StringBuffer sb=new StringBuffer("Hello");
		sb.append("koo \n");
		sb.append("\tok");
		System.out.println(sb);
		
		String s1="Hello";
		String s2="HEllo";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
	

	}

}
