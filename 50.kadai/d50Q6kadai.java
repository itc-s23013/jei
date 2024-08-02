// s23013 d50Q6kadai.java
// 指定された範囲内の素数を数え、その数を出力するプログラム

public class d50Q6kadai {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java d50Q6kadai <start> <end>");
            return;
        }

        int start = Integer.parseInt(args[0]);
        int end = Integer.parseInt(args[1]);
        int primeCount = 0;

        StringBuilder primes = new StringBuilder();

        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                primes.append(i).append(", ");
                primeCount++;
            }
        }

        if (primeCount > 0) {
            // Remove the last comma and space
            primes.setLength(primes.length() - 2);
            primes.append("\n");
        }

        System.out.println(primes.toString());
        System.out.println(start + "から" + end + "までの素数の数は" + primeCount + "個です");
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

