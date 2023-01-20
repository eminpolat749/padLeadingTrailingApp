package csd;

class App {
	public static void main(String [] args)
	{
		PadLeadingTrailingTest.run();
	}
}

class PadLeadingTrailingTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);		
		
		for (;;) {
			System.out.print("Bir yazı giriniz:");
			String s = kb.nextLine();			
			
			if ("quit".equals(s))
				break;
			
			System.out.print("Bir sayı giriniz:");
			int count = Integer.parseInt(kb.nextLine());
			
			System.out.printf("(%s)%n", StringUtil.padLeading(s, count, 'x'));
			System.out.printf("(%s)%n", StringUtil.padLeading(s, count));
			System.out.printf("(%s)%n", StringUtil.padTrailing(s, count, 'x'));
			System.out.printf("(%s)%n", StringUtil.padTrailing(s, count));			
		}
		
		System.out.println("Program sonu...");
	}
}

class StringUtil {
	public static String padLeading(String s, int len, char ch)
	{
		int length = s.length();
		
		return len <= length ? s : repeat(len - length, ch) + s;
	}
	
	public static String padLeading(String s, int len)
	{
		return padLeading(s, len, ' ');
	}
	
	public static String padTrailing(String s, int len, char ch)
	{
		int length = s.length();
		
		return len <= length ? s : s + repeat(len - length, ch);
	}
	
	public static String padTrailing(String s, int len)
	{
		return padTrailing(s, len, ' ');
	}
	
	public static String repeat(int cnt, String s)
	{
		String str = "";
		
		while (cnt-- > 0)
			str += s;
		
		return str;		
	}
	
	public static String repeat(int cnt, char ch)
	{
		return repeat(cnt, ch + "");
	}
}


