package com.company;

import java.lang.reflect.Array;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    static String vowels = "ауоиэыяюеё";
    public static boolean is_vowel(String word,int i){
        for (int j = 0; j < vowels.length(); j++) {
            if(word.toLowerCase().charAt(i)==vowels.toLowerCase().charAt(j)){return true;}
        }
        return false;
    }
    public static int first_vowel_index(String word,int i){
        for (int j = 0; j < vowels.length(); j++) {
            if(word.toLowerCase().charAt(i)==vowels.toLowerCase().charAt(j)){return i;}
        }
        return -1;
    }
    public static int How_many_vowels(String word){
        boolean is_vowel = false;
        int result = 0;
        for (int i = 0; i < word.length(); i++) {
            if(is_vowel(word,i)){
                result++;
            }
        }
        return result;
    }
    public static String[] first_vowel_to_Uppercase(String[] strings){
        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < strings[i].length(); j++) {
                if(is_vowel(strings[i],j)){
                    strings[i]= strings[i].substring(0,j)+strings[i].substring(j,j+1).toUpperCase()+
                          strings[i].substring(j+1,strings[i].length());
                    break;
                }
            }
        }

        return strings;
    }

    public static String[] Bubble_string_sort(String[] strings){
        for (int i = 0; i < strings.length; i++) {
            for (int j = 1; j < (strings.length - i); j++) {

                if (How_many_vowels(strings[j - 1]) > How_many_vowels(strings[j])) {
                    String temp;
                    temp = strings[j - 1];
                    strings[j - 1] = strings[j];
                    strings[j] = temp;
                }
            }
        }
        return strings;
    }

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
    String string = scanner.nextLine();
    String[] array_of_words = string.split(" ");
    array_of_words =first_vowel_to_Uppercase( Bubble_string_sort(array_of_words));
        for (int i = array_of_words.length-1; i > -1 ; i--) {
            System.out.println(array_of_words[i]+' '+ How_many_vowels(array_of_words[i]));
        }
    }

}
