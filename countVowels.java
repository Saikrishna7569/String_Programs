package string;
public class countVowels {
  public static boolean isEmpty(String s) {
	if(s.length()==0){
		return true;
		
	}
	else {
		return false;
	}
}
public static void Countvowels(String s) {
	int count=0;
	int num=0;
	for(int i=0;i<=s.length()-1;i++ ) {
		char ch=s.charAt(i);
		if(Character.isAlphabetic(ch)) {
		if((ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') ||(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')) {
			count++;
		}

	}
		else if(Character.isDigit(ch)) {
			num++;
		}



}
	System.out.println("count of num : "+num);
	System.out.println("count of vowels : "+count);

}

	public static void main(String []args) {
		String s="java123";
		if(isEmpty (s)) {
			System.out.println("String is empty");
		}
		else {
		Countvowels(s);
		}
		
	}
}
