/*
1 - ()
2- (()) , ()()
*/

class Main {
    public static void main(String[] args) {
        Generate obj = new Generate();
        obj.generate(3);
    }
}

class Generate {
    public void generate(int n) {
        helper("", n, n);
    }
    public void helper(String str, int open, int close) {
        if (open == 0 && close == 0) {
            System.out.print(str + "\n");
            return;
        }
        if (open > 0) {
            helper(str + '(', open - 1, close);
        }
        if (close > 0 && open < close) {
            helper(str + ')', open, close - 1);
        }
    }
}