import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int mat, fizik, kimya, biyoloji , tarih, müzik ;
        Scanner input = new Scanner(System.in);
        System.out.print("Matematik notunuz : ");
        mat = input.nextInt();
        System.out.print("Fizik notunuz : ");
        fizik = input.nextInt();
        System.out.print("Kimya notunuz : ");
        kimya = input.nextInt();
        System.out.print("Biyoloji notunuz : ");
        biyoloji = input.nextInt();
        System.out.print("Tarih notunuz : ");
        tarih = input.nextInt();
        System.out.print("Müzik notunuz : ");
        müzik = input.nextInt();

        int toplam = (mat + fizik + kimya + biyoloji + tarih + müzik);
        double sonuç = toplam/6;
        System.out.print("Not ortalaması :" + sonuç);



    }
}