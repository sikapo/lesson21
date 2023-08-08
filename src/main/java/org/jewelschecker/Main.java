package org.jewelschecker;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String stones = "";
        String jewels = "Fgje";
        JewelsChecker jewelsChecker = new JewelsChecker();
        try {
            System.out.println(jewelsChecker.checker(stones, jewels));
        } catch (IOException e) {System.err.println("To many/much stones or jewels!");};
    }
}