public class d52Q5kadai {
    public static void main(String[] args) {
        int[] values = new int[args.length];
        
        for (int i = 0; i < args.length; i++) {
            values[i] = Integer.parseInt(args[i]);
        }

        System.out.println("        +----+----+----+----");

        for (int value : values) {
            // 割ることで、10単位のスケールにする
            int scaledValue = value / 10;

            // 出力フォーマット
            System.out.print(value + " : ");
            
            // スケールされた値に応じて*を出力
            for (int j = 0; j < scaledValue; j++) {
                System.out.print("*");
            }
            
            System.out.println();
        }

        System.out.println("~            ");
    }
}

