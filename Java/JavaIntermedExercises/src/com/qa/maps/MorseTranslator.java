package com.qa.maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class MorseTranslator {
		//define attribute (only attribute map)
		private HashMap<String, String> translator;
		
//		public static HashMap<String, String> this = new HashMap<String, String>();
	    //create translator object
		public MorseTranslator() {
		this.translator = new HashMap<>();
		this.translator.put(".-", "a");
		this.translator.put("-...", "b");
        this.translator.put("-.-.", "c");
        this.translator.put("-..", "d");
        this.translator.put(".", "e");
        this.translator.put("..-.", "f");
        this.translator.put("--.", "g");
        this.translator.put("....", "h");
        this.translator.put("..", "i");
        this.translator.put(".---", "j");
        this.translator.put("-.-", "k");
        this.translator.put(".-..", "l");
        this.translator.put("--", "m");
        this.translator.put("-.", "n");
        this.translator.put("---", "o" );
        this.translator.put(".--.","p" );
        this.translator.put("--.-", "q");
        this.translator.put(".-.", "r");
        this.translator.put("...", "s" );
        this.translator.put("-", "t");
        this.translator.put("..-","u" );
        this.translator.put("...-","v");
        this.translator.put(".--","w" );
        this.translator.put("-..-","x");
        this.translator.put("-.--","y");
        this.translator.put("--..","z");
        this.translator.put(".----","1");
        this.translator.put("..---","2");
        this.translator.put("...--", "3");
        this.translator.put("....-", "4");
        this.translator.put(".....", "5");
        this.translator.put("-....", "6");
        this.translator.put("--...", "7");
        this.translator.put("---..", "8");
        this.translator.put("----.", "9");
        this.translator.put("-----", "0");
        this.translator.put("/", " "); 
	}
		//translate method, split input up at spaces, map these new strings onto the hashmap, collect and join these new strings into sentence.
	public String translate(String input) {
		return Arrays.stream(input.split(" ")).map(i -> this.translator.get(i)).collect(Collectors.joining());
	}
	public String noStreamTranslate(String input) {
        String[] inputList = input.split(" ");
        String transString = "";
        for (String i : inputList) {
        transString += this.translator.get(i);
        }
        return transString;
    }
	public String otherNoStream(String input) {
		String[] arrInput = input.split(" ");
		List<String> storage = new ArrayList<String>();
		
		StringBuilder sb = new StringBuilder();
		for (String e : arrInput) {
//			System.out.println(e);
//			System.out.println(translator.get(e));
//			storage.add(translator.get(e));
			sb.append(translator.get(e));
		}
		
		return sb.toString();
		
	}
}
