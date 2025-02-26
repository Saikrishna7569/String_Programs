//write a program to reverse a string 
package string;

public class reverseString {
	public static boolean isEmpty(String s) {
		if(s.length()==0) 
			return true;
		else 
				return false;
		}
	
public static void string(String s) {
	String srev="";
	for(int i=s.length()-1;i>=0;i--) {
		char ch=s.charAt(i);
		srev= srev+ch;
	}
	System.out.println(srev);
}
	public static void main(String args[]) {
		String s="Java programming";
//		String Srev="";
		if(isEmpty(s)) {
			System.out.println("String is empty");
		}
		else
		{
			string(s);
		}
	}
}
//  for(int i=s.length()-1;i>0;i--) {
//			char ch=s.charAt(i);
//			 Srev=Srev+ch;
//		}
//		System.out.println(Srev);
//	}




//Write a program to count no of digits and no of alphabits spresent in given string
