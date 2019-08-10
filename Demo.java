public class DemoJava {

	public static reverseString(String S){
		char ch[] = S.toCharArray();
		int len = S.length();
		char reverse[] = char[len];
		StringBuilder sb = new StringBuilder();
		StrinBuffer sf = new StringBuffer();
		for (int i=0, j=len-1;j>=0; i++, j--)
		{
			//reverse[i] = ch[j];
			
			// Reverse using charAt string method
			//reverse[i] = S.charAt(j);
	
			//Reverse usign String builder
			// sb = sb.append(S.charAt(j));
		
			//Reverse using String buffer
			 sf = sf.append(S.charAt(j));
		
		}
		//String reversedString = new String (reverse);
		//System.out.println("Reversed string is " + reversedString);
		System.out.println("Reversed string is " + sb);
		System.out.println("Reversed string is " + sf);
	
	}
	
	public static void main(String[] args) {
		System.out.println("Testing Java");
		String s = "I am Great";
		reverseString(S);
	}
}
