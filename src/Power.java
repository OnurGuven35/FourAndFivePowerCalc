import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int n;
        System.out.print("Sinir Degerini Giriniz : ");
        n = inp.nextInt();

        if (n < 0) {
            System.out.print("Lutfen Tam Sayi Giriniz ! ");
        } else {
            System.out.print("4'un Usleri : ");
            for (int i = 1; i <= n; i *= 4) {
                System.out.print(i + ",");
            }

            System.out.println();
            System.out.print("5'in Usleri : ");

            for (int i = 1; i <= n; i *= 5) {
                System.out.print(i + ",");
            }
        }
    }
}