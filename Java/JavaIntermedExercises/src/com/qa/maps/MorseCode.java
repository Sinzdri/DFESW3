package com.qa.maps;

public class MorseCode {
    public static void main(String[] args) {
    	String morse = ".--- .- ...- .- / .. ... / -.-. --- --- .-.. / --- -.-";
        MorseTranslator translator = new MorseTranslator();	//create the new translator object
        System.out.println(translator.translate(morse)); //use translator's translate method with string input 
        System.out.println(translator.noStreamTranslate(morse));
        System.out.println(translator.otherNoStream(morse));
    }	
}