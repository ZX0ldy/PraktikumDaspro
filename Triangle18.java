import java.util.Scanner;

public class Triangle18 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        int alas, tinggi;
        float luas;
        System.out.println("Masukan Alas:" );
        alas  = sc.nextInt();
        System.out.println("Masukan Tinggi:" );
        tinggi  = sc.nextInt();

        luas = alas * tinggi /2;

        System.out.println("Luas segitiga\t : " + luas);
    }
}
