//package string;
//
//public class stringUpper {
//
//	public static void main(String [] args) {
//		String s="IndiA";
//		for(int i=0;i<=s.length()-1;i++) {
//			 char ch=s.charAt(i);
////			 if(ch>65 && ch<90) 
//			 //or
//				 if(ch>='A' && ch<='Z'){
//				 System.out.println(ch);
//			 }
//		}
//	}
//}


////Write a program to print the char which are present in even indexes
package string;

public class stringUpper 
{
	public static boolean isEmpty(String s) {
		if(s.length()==0)
			  return true;
		else 
				return false;
	}
	public static void string(String s) {
		for(int i=1;i<=s.length()-1;i++) {
			char ch=s.charAt(i);
			if(i%2!=0) {
				System.out.println(ch);
			}
		}
	}
public static void main(String[] args) {
	String s="Iamanindian";
//	for (int i=0;i<=s.length()-1;i++) {
//		if(i!=0 && i%2==0) {
//			char ind=s.charAt(i);
//
//			System.out.println(ind);
	 string(s);
	 

		}
	

}



