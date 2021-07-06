class Decipherer {


	public static String message1 = "0@sn9sirppa@#?ia'jgtvryko1";
	public static String message2 = "q8e?wsellecif@#?sel@#?setuotpazdsy0*b9+mw@x1vj";
	public static String message3 = "aopi?sedohtém@#?sedhtmg+p9l!";
	public static String target = "@#?";

	public static String KeyNumber(String toto) {

		int key = toto.length() /2;
		String sousChaine = toto.substring(5, (key+5)).toString();
		String variablesRemplaced = sousChaine.replace(target, " " );
		String variableReversed = new StringBuilder(variablesRemplaced).reverse().toString();	
		return variableReversed;
		

	}

	public static void main(String[] args) {
		
		
		System.out.println("le nombre clé est :" + KeyNumber(message1));
		System.out.println("le nombre clé est :" + KeyNumber(message2));
		System.out.println("le nombre clé est :" + KeyNumber(message3));
	}
}