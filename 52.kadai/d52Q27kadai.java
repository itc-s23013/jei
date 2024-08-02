// s23013 d52Q27kadai.java
// 列挙型を使用して色を出力するプログラム

enum Color {
    RED, BLUE, YELLOW
}

public class d52Q27kadai {
    public static void main(String[] args) {
        Color myColor = Color.YELLOW;
        switch (myColor) {
            case RED:
                System.out.println("赤");
                break;
            case BLUE:
                System.out.println("青");
                break;
            case YELLOW:
                System.out.println("黄");
                break;
            default:
                System.out.println("不明な色");
                break;
        }
    }
}

