package com.company.Basics;
import java.util.Arrays;
import java.util.List;

public class BoldOrThinVowel {

    static Character letter = 'i';
    static Character[] boldVowels = {'A', 'a', 'O', 'u', 'o', 'U', 'I', 'ı'};
    static List<Character> boldVowelsList = Arrays.asList(boldVowels);

    public static void BoldOrThin(){
        if(boldVowelsList.contains(letter)){
            System.out.println("Character is bold vowel");
        }
        else{
            System.out.println("Character is thin vowel");
        }
    }
}
