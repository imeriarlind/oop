package session2;

public class VariableDeclaration
{
	public static void main(String[] args)
	{
		byte b = 12; // -128 .. 127
		System.out.println("b = " + b);

		short sh = 12899;
		System.out.println("sh = " + sh);

		int i = 1234567899;
		System.out.println("i = " + i);

		long l = 1234567899112121343L;
		System.out.println("l = "+l);
		
		float f = 5.75f;
		System.out.println("f = " + f);
		
		double d = 758.897;
		System.out.println("d = " + d);
		
		char c = 'A';
		System.out.println("c = " + c);
		
		char ch = '\'';
		System.out.println("ch = " + ch);

		boolean bl = false; //true
		System.out.println("bl = " + bl);

		final byte NUMRI_I_SHKRONJAVE = 36;
		System.out.println(NUMRI_I_SHKRONJAVE);
		System.out.println("Ne kemi "+NUMRI_I_SHKRONJAVE+" shkronja te alfabetit");
	}
}
