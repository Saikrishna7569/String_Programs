package string;
public class WordCount {
	public static void string (String s) {
		String s1[]=s.split(" ");
		for(int i=0;i<=s1.length-1;i++) {
			if(i%2!=0) 
				System.out.println(s1[i]);
			}
		}
	public static void main(String [] args) {
		String s="I am a Indian";
			string(s);
		}

	}


