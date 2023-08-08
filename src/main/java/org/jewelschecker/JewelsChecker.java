package org.jewelschecker;

import java.io.IOException;

public class JewelsChecker {

    public static int checker (String stones, String jewels) throws IOException{

        char[] stonesArr = (stones.toCharArray());
        char[] jewelsArr = (jewels.toCharArray());
        if (stonesArr.length == 0 || stonesArr.length > 50) {
            throw new IOException();
        } else if (stonesArr[0] == ' ') {
            throw new IOException();
        }

        int counter = 0;
        for (int i = 0; i < stonesArr.length; i++) {
            for (int j = 0; j < jewelsArr.length; j++) {
                if (stonesArr[i] == jewelsArr[j]){
                    counter++;
                }
            }
        }
        return counter;
    }
}
