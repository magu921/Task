public class Main {
    public static void main(String[] args) {

        System.out.println("[メニュー]");
        System.out.println("1:検索");
        System.out.println("2:登録");
        System.out.println("3:変更");
        System.out.println("4:削除");
        System.out.println("0:終了");
        System.out.print(">>>モード");

        String mode = new java.util.Scanner(System.in).nextLine();

//		String mode = "1";
//		println(mode + ":検索");


        if (mode.equals("1")) {
            println("検索します");
            System.exit(0);
        }

        else if (mode.equals("2")) {
            println("登録します");
            System.exit(0);
        }

        else if (mode.equals("3")) {
            println("変更します");
            System.exit(0);
        }

        else if (mode.equals("4")) {
            println("削除します");
            System.exit(0);
        }

        else if (mode.equals("0")) {
            println("プログラムを終了します");
            System.exit(0);
        }

        else {
            System.out.println("メニュー番号が間違っています。正しい値を入力してください");
        }

    }

    private static void println(Object object) {
        System.out.println(object);
    }
}
