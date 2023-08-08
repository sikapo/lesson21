package org.Baloons;
import java.util.HashMap;

public class BalloonChecker {
    public static int balloonChecker (String text) {
        char[] wordChr = "balloon".toLowerCase().toCharArray();
        char[] textChr = text.toLowerCase().toCharArray();
        if (wordChr.length > textChr.length) return 0;
        HashMap<Character, Integer> balloon = new HashMap<>();
        for (char c : wordChr) {
            balloon.put(c, 0);
        }
        for (char c : textChr) {
            if (balloon.containsKey(c)) {
                balloon.put(c, balloon.get(c) + 1);
            }
        }
        balloon.put('l', balloon.get('l')/2);
        balloon.put('o', balloon.get('o')/2);

        return balloon.values().stream().min(Integer::compare).orElse(0);
    }
}
