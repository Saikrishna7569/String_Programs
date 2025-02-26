package string;

public class Repeated {
	
	public static void string(String s) {
		String s2="";
		for(int i=0;i<=s.length()-1;i++) {
			char ch=s.charAt(i);
			if(s2.indexOf(ch)==-1) {
				s2=s2+ch;
			}
		}
		System.out.println(s2);

	}
	public static void main(String [] args) {
	String s="java";
//	String s2="";
//	for(int i=0;i<=s.length()-1;i++) {
//		char ch=s.charAt(i);
//		if(s2.indexOf(ch)==-1) {
	
	
         string(s);
	
	}
}
