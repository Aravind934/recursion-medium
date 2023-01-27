/*
question :- [1,2,3,4,5] sum-2
output : 11, 2
*/

class HelloWorld {
    public static void main(String[] args) {
        int[] arr = {
            1,
            2,
            3,
            4
        };
        Dice obj = new Dice(arr);
        obj.targetSum(4);
    }
}

class Dice {
    int[] arr;
    public Dice(int[] arr) {
        this.arr = arr;
    }
    public void targetSum(int n) {
        helper("", n);
    }
    public void helper(String str, int n) {
        if (n == 0) {
            System.out.print(str + "\n");
            return;
        }
        if (n < 0) return;
        for (int i = 0; i < arr.length; i++) {
            helper(str + arr[i], n - arr[i]);
        }
    }
}