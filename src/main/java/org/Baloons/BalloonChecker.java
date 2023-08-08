package org.Baloons;
import java.util.HashMap;

public class BalloonChecker {
    public static int balloonChecker (String word, String text){
        char[] wordChr = word.toLowerCase().toCharArray();
        char[] textChr = text.toLowerCase().toCharArray();
        if (wordChr.length > textChr.length) return 0;
        HashMap<Character, Integer> balloon = new HashMap<>();
        for (char c : wordChr) {
            if (c == 'l' || c == 'o') continue;
            balloon.put(c, 0);
        }
        for (char c : textChr) {
            if (balloon.containsKey(c)) {
                balloon.put(c, balloon.get(c) + 1);
            }
        }
        int min = balloon.values().stream().min(Integer::compare).orElse(0);
        if (min == 0) return 0;

        int minLL = 0;
        int minOO = 0;
        for (char c : textChr) {
            if (c == 'l' && balloon.containsKey(c)) minLL++;
                else if (c == 'l' && !(balloon.containsKey(c))) {
                    balloon.put(c, 0);
                    minLL++;
            }
            if (c == 'o' && balloon.containsKey(c)) minOO++;
                else if (c == 'o' && !(balloon.containsKey(c))) {
                    balloon.put(c, 0);
                    minOO++;
            }
        }
        int counter = 0;
        if (minLL - minOO == 0 || minLL > minOO) {
            int c = minOO - 2;
            if (c < 0) return 0;
            else {
                counter = 1;
                while (c > 0){
                    c = c - 2;
                    if (c < 0) break;
                    counter++;
                }
            }
        }
        if (minLL < minOO) {
            int c = minLL - 2;
            if (c < 0) return 0;
            else {
                counter = 1;
                while (c > 0){
                    c = c - 2;
                    if (c < 0) break;
                    counter++;
                }
            }
        }
        if (min == counter || min < counter) return min;
        else return counter;
    }
}
