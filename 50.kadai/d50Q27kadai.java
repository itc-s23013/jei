// s23013 d50Q27kadai.java
// コマンドライン引数で制御するプログラム

public class d50Q27kadai {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java d50Q27kadai <1|2|3>");
            return;
        }

        int control = Integer.parseInt(args[0]);
        
        switch (control) {
            case 1:
                System.out.println("Warm");
                break;
            case 2:
                System.out.println("Cool");
                break;
            case 3:
                System.out.println("Wind");
                break;
            default:
                System.out.println("Invalid input. Please enter 1, 2, or 3.");
        }
    }
}

