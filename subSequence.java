import java.util.*;

class Main {
    public static void main(String[] args) {
        SubSequence obj = new SubSequence("acc");
        System.out.print(obj.print());
    }
}

class SubSequence{
    String str;
    public SubSequence(String str){
        this.str = str;
    }
    public Set<String> helper(String pro,String unPro){
        Set<String> set = new HashSet<>();
        if(unPro.isEmpty()){
         set.add(pro);
         return set;
        } 
        char ch = unPro.charAt(0);
        unPro =unPro.substring(1);
         Set<String> left = helper(pro+ch,unPro);
         Set<String> right = helper(pro,unPro);
         set.addAll(left);
         set.addAll(right);
         return set;
    }
    public Set<String> print(){
        return this.helper("",this.str);
    }
}