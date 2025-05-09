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
	 string(s);
		}
}



