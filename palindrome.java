package string;

public class palindrome {
	public static void main(String []args) {
		String s="MALAYALAM";
		String Srev="";
		
	for(int i=s.length()-1;i>=0;i--) {
		char ch=s.charAt(i);
		Srev=Srev+ch;
	}
	if(s.equals(Srev)) 
		System.out.println("palindrome");
	else
		System.out.println("not palindrome");
	}
	
}
