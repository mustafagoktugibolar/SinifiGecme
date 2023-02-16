import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double fizik, mat, turkce, kimya, muzik, ders = 0;
        double total, avarage = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Matematik notunuzu giriniz...");
        mat = sc.nextInt();
        if (mat >= 0 && mat <= 100) {
            total += mat;
            ders++;
        }
        System.out.println("Türkçe notunuzu giriniz...");
        turkce = sc.nextInt();
        if (turkce >= 0 && turkce <= 100) {
            total += turkce;
            ders++;
        }
        System.out.println("Fizik notunuzu giriniz...");
        fizik = sc.nextInt();
        if (fizik >= 0 && fizik <= 100) {
            total += fizik;
            ders++;
        }
        System.out.println("Kimya notunuzu giriniz...");
        kimya = sc.nextInt();
        if (kimya >= 0) {
            total += kimya;
            ders++;
        }
        System.out.println("Müzik notunuzu giriniz...");
        muzik = sc.nextInt();
        if (muzik >= 0 && muzik <= 100) {
            total += muzik;
            ders++;
        }
        avarage = total / ders;
        if (avarage >= 55) {
            System.out.println("Ortalaman = " + avarage + "\nTebrikler! Sınıfı geçtin.");
        } else {
            System.out.println("Ortalaman = " + avarage + "\nSınıfta kaldın");
        }
    }
}
