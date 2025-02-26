
	//Write a program to print summation of ASCII value of characters in a giver string

package string;

public class Ascll {
	public static boolean isEmpty(String s){
		if(s.length()==0) 
		return true;
		else
			return false;
	}
  public static void string(String s) {
			int sum=0;
			for(int i=0;i<=s.length()-1;i++) {
				char ch=s.charAt(i);
			if(Character.isAlphabetic(ch)) 
				sum=sum+ch;
			}
			System.out.println(sum);
		
		}
	
		public static void main(String args[]) {
			String s="ABCD";
			if(isEmpty(s)) {
				System.out.println("String is empty");
			}
			else {
				string(s);
			}
		}
}


//			int sum=0;
//			for(int i=0;i<=s.length()-1;i++) {
//				char ch=s.charAt(i);
//				if(ch>=65 && ch<=90 ||ch>=97 && ch<=122) {
//					sum=sum+ch;
//					
//				}
//			}
//			System.out.println(sum);


		
	


