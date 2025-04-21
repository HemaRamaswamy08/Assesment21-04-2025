package assesment1;

public class Pattern {
public static void main(String[] args) {
	for(int i= 1; i<10; i+=2) {
		String pattern =" ";
		for(int j=1; j<=i; j++) {
			pattern+="*";
		}
		System.out.println(pattern);
		
	}
}
}
