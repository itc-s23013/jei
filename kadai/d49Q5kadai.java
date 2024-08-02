public class d49Q5kadai {
    public static void main(String[] args) {
        int limit = Integer.parseInt(args[0]);
        int base1 = Integer.parseInt(args[1]);
        int base2 = Integer.parseInt(args[2]);

        for (int i = 1; i <= limit; i++) {
            boolean divisibleByBase1 = (i % base1 == 0);
            boolean divisibleByBase2 = (i % base2 == 0);

            if (divisibleByBase1 && divisibleByBase2) {
                System.out.println(i + ": base1, base2");
            } else if (divisibleByBase1) {
                System.out.println(i + ": base1");
            } else if (divisibleByBase2) {
                System.out.println(i + ": base2");
            } else {
                System.out.println(i);
            }
        }
    }
}

