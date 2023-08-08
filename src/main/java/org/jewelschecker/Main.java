package org.jewelschecker;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String stones = "";
        String jewels = "Fgje";
        try {
            System.out.println(JewelsChecker.checker(jewels, stones));
        } catch (IOException e) {System.err.println("To many/much stones or jewels!");}
    }
}