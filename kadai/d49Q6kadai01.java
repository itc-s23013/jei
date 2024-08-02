// 学生番号: s23013
// 課題概要: StringBuilderクラスを使って与えられた引数を連結し、表示する

public class d49Q6kadai01 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        for (String arg : args) {
            sb.append(arg);
        }

        System.out.println(sb.toString());
    }
}

