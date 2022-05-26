package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		String str = "Madam";
		String revStr="";
		int strLength= str.length();
		
		for(int i= strLength-1;i>=0;--i)
		{
			revStr= revStr + str.charAt(i);
		}
		if(str.toLowerCase().equals(revStr.toLowerCase())) {
			System.out.println(str + " is a palindrome");
		}
		else
		{
			System.out.println(str + " is not a palindrome");
		}
	}

}
