// s23013 d51Q5kadai.java
// ガス代を計算するプログラム

public class d51Q5kadai {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java d51Q5kadai <gas usage>");
            return;
        }

        double gasUsage = Double.parseDouble(args[0]);

        // 値上げ後の基本使用料と従量単価
        int baseFee = 1000 + 100; // 基本使用料 100円値上げ
        double unitPrice = 25.0 + 1; // 従量単価 1円値上げ

        // 今月のガス代を計算
        int totalCost = (int)(baseFee + (unitPrice * gasUsage));

        System.out.println("今月のガス代は" + totalCost + "円");
    }
}

