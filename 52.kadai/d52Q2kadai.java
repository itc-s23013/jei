// s23013 d52Q2kadai.java
// Temperクラスを使用して温度を出力するプログラム

class Temper {
    private double degree;

    public Temper(double degree) {
        this.degree = degree;
    }

    public double getDegree() {
        return degree;
    }
}

public class d52Q2kadai {
    public static void main(String[] args) {
        Temper temp = new Temper(17.2);
        System.out.println(temp.getDegree());
    }
}

