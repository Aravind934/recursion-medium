class Main {
    public static void main(String[] args) {
        TOH obj = new TOH();
        obj.honoi(2, 'A', 'B', 'C');
    }
}

//tower of honoi
class TOH {
    public void honoi(int n, char A, char B, char C) {
        if (n == 1) {
            System.out.print("Move Disk from " + A + " to " + C + "\n");
            return;
        }
        honoi(n - 1, A, C, B);
        System.out.print("Move Disk from " + A + " to " + C + "\n");
        honoi(n - 1, B, A, C);
    }
}