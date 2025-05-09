package string;

public class CountString {
	public static void main (String []args) {
	String s="Java123";
	int numcount=0;
	int alphacount=0; 
	for(int i=0;i<=s.length()-1;i++) {
		char ch=s.charAt(i);
		if(ch>='A' && ch<='Z' ||ch>='a' &&ch<='z') 
			alphacount++;
		else if(ch>='0' && ch<='9') 
			numcount++;
	}
	System.out.println(numcount);
	System.out.println(alphacount);

}
}
