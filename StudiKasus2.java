
import java.util.Scanner;

public class StudiKasus2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int panjangT, lebarT;
        float diameterKoling, panjangSigi, luasT, jarijari, luasSigi;
        double luasKoling, jml_luasKolam, sisa_luasT;

        System.out.print("Masukkan panjang tanah (M): ");
        panjangT = input.nextInt();

        System.out.print("Masukkan lebar tanah (M): ");
        lebarT = input.nextInt();

        System.out.print("Masukkan diameter kolam lingkaran (M): ");
        diameterKoling = input.nextFloat();

        System.out.print("Masukkan panjang sisi kolam persegi (M): ");
        panjangSigi = input.nextFloat();

        luasT = panjangT * lebarT;

        jarijari = diameterKoling / 2;

        luasKoling = Math.PI * jarijari * jarijari;

        luasSigi = panjangSigi * panjangSigi;

        jml_luasKolam = luasKoling + luasSigi;

        sisa_luasT = luasT - jml_luasKolam;

        // Output
        System.out.println("\n=== HASIL PERHITUNGAN ===");
        System.out.println("Luas tanah          : " + luasT + " m2");
        System.out.println("Luas kolam lingkaran: " + luasKoling + " m2");
        System.out.println("Luas kolam persegi  : " + luasSigi + " m2");
        System.out.println("Jumlah luas kolam   : " + jml_luasKolam + " m2");
        System.out.println("Sisa luas tanah     : " + sisa_luasT + " m2");

        input.close();
    }
}