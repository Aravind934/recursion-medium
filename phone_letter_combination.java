/*
2 - a b c
23 - ad be cf
*/

import java.util.*;

class Main {
    public static void main(String[] args) {
        Helper obj = new Helper();
        obj.combination(239);
    }
}

class Helper {
    Map < Integer, String > map = new HashMap < > ();
    public Helper() {
        map.put(2, "abc");
        map.put(3, "def");
        map.put(4, "ghi");
        map.put(5, "jkl");
        map.put(6, "mno");
        map.put(7, "pqrs");
        map.put(8, "tuv");
        map.put(9, "wxyz");
    }
    public void helper(String pro, Integer unPro) {
        if (unPro <= 0) {
            System.out.println(pro);
            return;
        }
        int num = unPro % 10;
        String str = map.get(num);
        for (int i = 0; i < str.length(); i++) {
            helper(pro + str.charAt(i), unPro / 10);
        }
    }
    public void combination(int num) {
        helper("", num);
    }
}