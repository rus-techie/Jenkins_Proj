public class DemoJava {

	public static reverseString(String S){
		char ch[] = S.toCharArray();
		int len = S.length();
		char reverse[] = char[len];
		for (int i=0, j=len-1;j>=0; i++, j--)
		{
			//reverse[i] = ch[j];
			
			// Reverse using charAt string method
			//reverse[i] = S.charAt(j);
	
			//Reverse usign String builder
			StringBuilder sb = new StringBuilder();
			 sb = sb.append(S.charAt(j));
			
		}
		//String reversedString = new String (reverse);
		//System.out.println("Reversed string is " + reversedString);
		System.out.println("Reversed string is " + sb);
	}
	
	public static void main(String[] args) {
		System.out.println("Testing Java");
		String s = "I am Great";
		reverseString(S);
	}
}
