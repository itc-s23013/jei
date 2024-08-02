// s23013 d51Q6kadai.java
// 商品コードを解析して大分類名、小分類名、詳細コードを出力するプログラム

public class d51Q6kadai {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java d51Q6kadai <product code>");
            return;
        }

        String productCode = args[0];

        if (productCode.length() != 10) {
            System.out.println("Invalid product code. It should be 10 characters long.");
            return;
        }

        String categoryCode = productCode.substring(0, 3);
        String detailCode = productCode.substring(3);

        String majorCategory = "";
        String minorCategory = "";

        switch (categoryCode) {
            case "BBB":
                majorCategory = "肉類";
                minorCategory = "加工肉";
                break;
            // 追加のコードがある場合はここに書く
            default:
                majorCategory = "不明";
                minorCategory = "不明";
                break;
        }

        System.out.println("商品コード：" + productCode);
        System.out.println("大分類名：" + majorCategory);
        System.out.println("小分類名：" + minorCategory);
        System.out.println("詳細コード：" + detailCode);
    }
}

