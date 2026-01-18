package Joma;

public class String1Part1 {
    public static void main(String[] args) {

        System.out.println(helloName("Joma💗"));
        System.out.println(helloName("Hazim💗"));

        System.out.println(makeOutWord("<<>>", "Yay"));
        System.out.println(makeOutWord("<<>>", "WooHoo"));
        System.out.println(makeOutWord("[[]]", "word"));

        System.out.println(firstHalf("WooHoo"));
        System.out.println(firstHalf("HelloThere"));
        System.out.println(firstHalf("abcdef"));

        System.out.println(nonStart("Hello", "There"));
        System.out.println(nonStart("java", "code"));
        System.out.println(nonStart("shotl", "java"));

        System.out.println(theEnd("Hello", true));
        System.out.println(theEnd("Hello", false));
        System.out.println(theEnd("oh", true));

        System.out.println(endsLy("oddly"));
        System.out.println(endsLy("y"));
        System.out.println(endsLy("oddy"));

        System.out.println(middleThree("Candy"));
        System.out.println(middleThree("and"));
        System.out.println(middleThree("solving"));

        System.out.println(lastChars("last", "chars")); // ls
        System.out.println(lastChars("yo", "java"));    // ya
        System.out.println(lastChars("hi", ""));        // h@


        System.out.println(seeColor("redxx"));      // red
        System.out.println(seeColor("xxred"));      // ""
        System.out.println(seeColor("blueTimes"));  // blue


        System.out.println(extraFront("Hello")); // HeHeHe
        System.out.println(extraFront("ab"));    // ababab
        System.out.println(extraFront("H"));     // HHH

        System.out.println(startWord("hippo", "hi")); // hi
        System.out.println(startWord("hippo", "xip")); // hip
        System.out.println(startWord("hippo", "i")); // h

        System.out.println(makeAbba("Hi", "Bye"));   // HiByeByeHi
        System.out.println(makeAbba("Yo", "Alice")); // YoAliceAliceYo
        System.out.println(makeAbba("What", "Up"));  // WhatUpUpWhat

        System.out.println(extraEnd("Hello")); // lololo
        System.out.println(extraEnd("ab"));    // ababab
        System.out.println(extraEnd("Hi"));    // HiHiHi


        System.out.println(withoutEnd("Hello"));  // ell
        System.out.println(withoutEnd("java"));   // av
        System.out.println(withoutEnd("coding")); // odin


        System.out.println(left2("Hello")); // lloHe
        System.out.println(left2("java"));  // vaja
        System.out.println(left2("Hi"));    // Hi

        System.out.println(withouEnd2("Hello")); // ell
        System.out.println(withouEnd2("abc"));   // b
        System.out.println(withouEnd2("ab"));    // ""

        System.out.println(nTwice("Hello", 2));      // Helo
        System.out.println(nTwice("Chocolate", 3));  // Choate
        System.out.println(nTwice("Chocolate", 1));  // Ce

        System.out.println(hasBad("badxx"));   // true
        System.out.println(hasBad("xbadxx"));  // true
        System.out.println(hasBad("xxbadxx")); // false

        System.out.println(conCat("abc", "cat")); // abcat
        System.out.println(conCat("dog", "cat")); // dogcat
        System.out.println(conCat("abc", ""));    // abc

        System.out.println(frontAgain("edited")); // true
        System.out.println(frontAgain("edit"));   // false
        System.out.println(frontAgain("ed"));     // true










    }

    // 1
    public static String helloName(String name) {
        return "ПРИВЕТ " + name + "!";
    }

    // 2
    public static String makeOutWord(String out, String word) {
        return out.substring(0, 2) + word + out.substring(2);
    }

    // 3
    public static String firstHalf(String str) {
        return str.substring(0, str.length() / 2);
    }

    // 4
    public static String nonStart(String a, String b) {
        return a.substring(1) + b.substring(1);
    }

    // 5
    public static String theEnd(String str, boolean front) {
        return front ? str.substring(0, 1) : str.substring(str.length() - 1);
    }

    // 6
    public static boolean endsLy(String str) {
        return str.length() >= 2 && str.substring(str.length() - 2).equals("ly");
    }

    // 7
    public static String middleThree(String str) {
        int mid = str.length() / 2;
        return str.substring(mid - 1, mid + 2);
    }

    // Задача 8: lastChars

    public static String lastChars(String a, String b) {
        char first = a.length() > 0 ? a.charAt(0) : '@';
        char last = b.length() > 0 ? b.charAt(b.length() - 1) : '@';
        return "" + first + last;
    }

    // задача 9  seeColor
    public static String seeColor(String str) {
        if (str.startsWith("red")) {
            return "red";
        }
        if (str.startsWith("blue")) {
            return "blue";
        }
        return "";
    }

    // задача 10 extraFront
    public static String extraFront(String str) {
        String first = str.length() >= 2 ? str.substring(0, 2) : str;
        return first + first + first;
    }


    // задача 11 startWord
    public static String startWord(String str, String word) {
        int len = word.length();
        if (str.length() < len) return "";

        if (str.substring(1, len).equals(word.substring(1))) {
            return str.substring(0, len);
        }
        return "";
    }

    // задача 12 makeAbba
    public static String makeAbba(String a, String b) {
        return a + b + b + a;
    }

    //задача 13
    public static String extraEnd(String str) {
        String last2 = str.substring(str.length() - 2);
        return last2 + last2 + last2;
    }

    // задача 14
    public static String withoutEnd(String str) {
        return str.substring(1, str.length() - 1);
    }


    // задача 15 left2
    public static String left2(String str) {
        return str.substring(2) + str.substring(0, 2);
    }

    // задача 16  withouEnd2
    public static String withouEnd2(String str) {
        if (str.length() <= 2) return "";
        return str.substring(1, str.length() - 1);
    }

    // задача 17 nTwice
    public static String nTwice(String str, int n) {
        String first = str.substring(0, n);
        String last  = str.substring(str.length() - n);
        return first + last;
    }
    // задача 18
    public static boolean hasBad(String str) {
        if (str.length() >= 3 && str.substring(0, 3).equals("bad")) {
            return true;
        }
        if (str.length() >= 4 && str.substring(1, 4).equals("bad")) {
            return true;
        }
        return false;
    }

    //Задача 19: conCat
    public static String conCat(String a, String b) {
        if (!a.isEmpty() && !b.isEmpty() && a.charAt(a.length() - 1) == b.charAt(0)) {
            return a + b.substring(1);
        }
        return a + b;
    }


    // Задача 20: frontAgain
    public static boolean frontAgain(String str) {
        if (str.length() < 2) return false;
        String first2 = str.substring(0, 2);
        String last2  = str.substring(str.length() - 2);
        return first2.equals(last2);

    }

}
