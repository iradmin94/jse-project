package string;

import java.util.Locale;
import java.util.Scanner;

public class StringUsage {
    static String txt;

    public static void main(String[] args) {
        System.out.println("Enter your string");
        Scanner input = new Scanner(System.in);
            String txt = input.nextLine();

            //Convert phrase to uppercase
            System.out.println(txt.toUpperCase());

            //Convert phrase to lowercase
            System.out.println(txt.toLowerCase(Locale.ROOT));

            //Determine phrase length
            System.out.println("Phrase length " + txt.length());

            // count the consonants and vowels in the phrase
            int vCount = 0, cCount = 0;
            txt = txt.toLowerCase();

            for (int i = 0; i < txt.length(); i++) {
                if (txt.charAt(i) == 'a' || txt.charAt(i) == 'e' || txt.charAt(i) == 'i' || txt.charAt(i) == 'o' || txt.charAt(i) == 'u') {
                    vCount++;
                }
                else if (txt.charAt(i) >= 'a' && txt.charAt(i) <= 'z') {
                    cCount++;
                }
            }
            System.out.println("Number of vowels: " + vCount);
            System.out.println("Number of consonants: " + cCount);


            int count = 0;
            char ch[] = new char[txt.length()];
            for (int i = 0; i < txt.length(); i++) {
                ch[i] = txt.charAt(i);
                if (((i > 0) && (ch[i] != ' ') && (ch[i - 1] == ' ')) || ((ch[0] != ' ') && (i == 0)))
                    count++;
            }
            System.out.println((count) +  "words");




        }
    }



