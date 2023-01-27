import java.util.*;

class Main {
    public static void main(String[] args) {
        Permutation obj = new Permutation("abc");
        System.out.println(obj.print());
    }
}


class Permutation {
    String str;
    Permutation(String str) {
        this.str = str;
    }
    //up - un processed , p - processed
    private List < String > helper(String p, String up) {
        List < String > list = new ArrayList < > ();
        if (up.isEmpty()) {
            list.add(p);
            return list;
        }
        for (int i = 0; i <= p.length(); i++) {
            char ch = up.charAt(0);
            String temp = p.substring(0, i) + ch + p.substring(i, p.length());
            list.addAll(helper(temp, up.substring(1)));
        }
        return list;
    }
    public List < String > print() {
        return this.helper("", this.str);
    }
}