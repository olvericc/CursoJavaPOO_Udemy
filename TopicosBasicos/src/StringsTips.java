
public class StringsTips {

	public static void main(String[] args) {
		
		String original = "abcde FGHIJ ABC abc DEFG   ";
		
		// para converter todas letras em minusculas
		String s01 = original.toLowerCase();
		// para converter todas letras em maisculas
		String s02 = original.toUpperCase();
		// elimina os espacos em branco existentes na string
		String s03 = original.trim();
		// vai recortar do 2th caractere em diante 
		String s04 = original.substring(2);
		// vai recortar do 2th caractere ate o 9th caractere
		String s05 = original.substring(2, 9);
		// substitui os caracteres por outros
		String s06 = original.replace('a', 'x');
		// substitui caracteres em outras
		String s07 = original.replace("abc", "xy");
		// buscar primeira posicao na string original
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");
		
		System.out.println("Original: " + original);
		System.out.println("ToLowerCase: " + s01);
		System.out.println("ToUpperCase: " + s02);
		System.out.println("Trim: " + s03);
		System.out.println("Substring(2): " + s04);
		System.out.println("Substring(2, 9): " + s05);
		System.out.println("Replace('a', 'x'): " + s06);
		System.out.println("Replace('abc', 'xy'): " + s07);
		System.out.println("indexOf('bc'): " + i);
		System.out.println("lastIndexOf('bc'): " + j);
		
	}

}
