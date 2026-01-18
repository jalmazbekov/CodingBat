package Salih;

public class Tasks {
    public static void main(String[] args) {

    }
    public String doubleChar(String str) {

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            result += str.charAt(i);
            result += str.charAt(i);
        }

        return result;
    }

    public int countHi(String str) {
        int count = 0;

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, i + 2).equals("hi")) {
                count++;
            }
        }

        return count;
    }

    public boolean catDog(String str) {
        int cat = 0;
        int dog = 0;

        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 3).equals("cat")) {
                cat++;
            }
            if (str.substring(i, i + 3).equals("dog")) {
                dog++;
            }
        }

        return cat == dog;
    }

    public int countCode(String str) {
        int count = 0;

        for (int i = 0; i < str.length() - 3; i++) {
            if (str.substring(i, i + 2).equals("co") &&
                    str.charAt(i + 3) == 'e') {
                count++;
            }
        }

        return count;

    }


    public boolean endOther(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        return a.endsWith(b) || b.endsWith(a);
    }

    public boolean xyzThere(String str) {
        if (str.startsWith("xyz")) return true;
        return str.contains("xyz") && !str.contains(".xyz");
    }

    public boolean bobThere(String str) {
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == 'b' && str.charAt(i + 2) == 'b') {
                return true;
            }
        }
        return false;
    }


    public boolean xyBalance(String str) {
        int lastX = str.lastIndexOf('x');
        int lastY = str.lastIndexOf('y');
        return lastX <= lastY;
    }

    public String mixString(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int minLen = Math.min(a.length(), b.length());

        for (int i = 0; i < minLen; i++) {
            sb.append(a.charAt(i));
            sb.append(b.charAt(i));
        }

        if (a.length() > minLen) sb.append(a.substring(minLen));
        if (b.length() > minLen) sb.append(b.substring(minLen));

        return sb.toString();
    }

    public String repeatEnd(String str, int n) {
        String lastN = str.substring(str.length() - n);
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            sb.append(lastN);
        }

        return sb.toString();
    }

    public String repeatFront(String str, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = n; i > 0; i--) {
            sb.append(str.substring(0, i));
        }
        return sb.toString();
    }

    public String repeatSeparator(String word, String sep, int count) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(word);
            if (i < count - 1) {
                sb.append(sep);
            }
        }
        return sb.toString();
    }

    public boolean prefixAgain(String str, int n) {
        String prefix = str.substring(0, n);
        return str.indexOf(prefix, n) != -1;
    }

    public boolean xyzMiddle(String str) {
        int mid = str.length() / 2;

        if (str.length() >= 3) {
            if (mid - 1 >= 0 && mid + 2 <= str.length()
                    && str.substring(mid - 1, mid + 2).equals("xyz")) {
                return true;
            }
            if (mid - 2 >= 0 && mid + 1 <= str.length()
                    && str.substring(mid - 2, mid + 1).equals("xyz")) {
                return true;
            }
        }
        return false;
    }

    public String getSandwich(String str) {
        int first = str.indexOf("bread");
        int last = str.lastIndexOf("bread");

        if (first == -1 || first == last) {
            return "";
        }

        return str.substring(first + 5, last);
    }

    public boolean sameStarChar(String str) {
        for (int i = 1; i < str.length() - 1; i++) {
            if (str.charAt(i) == '*') {
                if (str.charAt(i - 1) != str.charAt(i + 1)) {
                    return false;
                }
            }
        }
        return true;
    }

    public String oneTwo(String str) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i + 2 < str.length(); i += 3) {
            sb.append(str.charAt(i + 1));
            sb.append(str.charAt(i + 2));
            sb.append(str.charAt(i));
        }

        return sb.toString();
    }

    public String zipZap(String str) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (i + 2 < str.length()
                    && str.charAt(i) == 'z'
                    && str.charAt(i + 2) == 'p') {
                sb.append("zp");
                i += 2;
            } else {
                sb.append(str.charAt(i));
            }
        }

        return sb.toString();
    }

    public String starOut(String str) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '*') continue;
            if (i > 0 && str.charAt(i - 1) == '*') continue;
            if (i < str.length() - 1 && str.charAt(i + 1) == '*') continue;
            sb.append(str.charAt(i));
        }

        return sb.toString();
    }

    public String plusOut(String str, String word) {
        StringBuilder sb = new StringBuilder();
        int i = 0;

        while (i < str.length()) {
            if (i + word.length() <= str.length()
                    && str.substring(i, i + word.length()).equals(word)) {
                sb.append(word);
                i += word.length();
            } else {
                sb.append("+");
                i++;
            }
        }

        return sb.toString();
    }
}
