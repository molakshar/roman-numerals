package org.ea;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Roman {
    static Map<Integer, String> roman = new HashMap<>();
    static List<Integer> romanNum = new ArrayList<>();

    static {
        roman.put(1000, "M");
        roman.put(900, "CM");
        roman.put(500, "D");
        roman.put(400, "CD");
        roman.put(100, "C");
        roman.put(90, "XC");
        roman.put(50, "L");
        roman.put(40, "XL");
        roman.put(10, "X");
        roman.put(9, "IX");
        roman.put(5, "V");
        roman.put(4, "IV");
        roman.put(1, "I");

        romanNum.add(1000);
        romanNum.add(900);
        romanNum.add(500);
        romanNum.add(400);
        romanNum.add(100);
        romanNum.add(90);
        romanNum.add(50);
        romanNum.add(40);
        romanNum.add(10);
        romanNum.add(9);
        romanNum.add(5);
        romanNum.add(4);
        romanNum.add(1);
    }


    public static String numToRoman(int number) {
        if (number < 0) {
            return null;
        }
        if (number > 3999) {
            return null;
        }

        String retRoman = "";
        for (Integer num : romanNum) {
            do {
                if (number > 0 && ((double) number / (double) num) >= 1d) {
                    number -= num;
                    retRoman = retRoman + roman.get(num);
                }
            } while(number >= num );
        }
        return retRoman;
    }
}
