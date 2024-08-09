import java.util.Scanner;

public class d52Q6kadai {
    public static void main(String[] args) {
        // 商品の情報を保持するクラス
        class Product {
            String name;
            int price;
            
            Product(String name, int price) {
                this.name = name;
                this.price = price;
            }
        }

        // 商品リストの作成
        Product[] products = {
            new Product("Gomacola", 150),
            new Product("MrPepper", 130),
            new Product("SaltWater", 320)
        };
        
        // 商品リストの表示
        for (int i = 0; i < products.length; i++) {
            System.out.printf("〔%d〕[%s] %d円%n", i + 1, products[i].name, products[i].price);
        }

        Scanner scanner = new Scanner(System.in);

        // 商品の選択
        System.out.print("商品番号を選んでください: ");
        int choice = scanner.nextInt() - 1;

        if (choice < 0 || choice >= products.length) {
            System.out.println("無効な選択です。");
            return;
        }

        Product selectedProduct = products[choice];
        System.out.printf("[%s] %d円が排出されました%n", selectedProduct.name, selectedProduct.price);

        // お金の投入
        System.out.print("お金を投入してください (円): ");
        int money = scanner.nextInt();

        if (money < selectedProduct.price) {
            System.out.println("お金が足りません。");
            return;
        }

        // お釣りの計算
        int change = money - selectedProduct.price;
        
        if (change == 0) {
            System.out.println("お釣り なし");
        } else {
            System.out.print("お釣り ");
            int[] coins = {100, 50};
            for (int coin : coins) {
                int count = change / coin;
                if (count > 0) {
                    System.out.printf("%d円:%d枚 ", coin, count);
                }
                change %= coin;
            }
            System.out.println();
        }

        scanner.close();
    }
}

