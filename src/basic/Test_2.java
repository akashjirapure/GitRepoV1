package basic;

public class Test_2 {
	
public static void main(String[] args) {
		
		String a="123";
		String rev="";
		
		for(int i=a.length()-1;i>=0;i--) {
			
			rev = rev + a.charAt(i);
			}
		
		
		if(a.equals(rev)) {
			System.out.println(rev + ": This no is palindrom");
		}
		else {
			System.out.println(rev + ": This no is not palindrom");
		}
		
		
	}


}
