package string;

public class CharacterWritten {
	public static void main(String []args) {
		String s="j::a::v::a";
		String sa="";
		for(int i=0;i<=s.length()-1;i++) {
			char ch=s.charAt(i
					);
			if(Character.isAlphabetic(ch)) {
				if(Character.isUpperCase(ch)|| Character.isLowerCase(ch)) {
					sa=sa+ch;
				}
			}
		}
		System.out.println(sa);
	}

}
