import java.util.Scanner;

public class BankNoAbsen {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double gajiPokok = 3000000;
        int jumlahAnak = 3;
        double tunjanganAnakPerBulan = 150000;
        double potonganPensiunPersen = 0.05;
        double tunjanganAnak = jumlahAnak * tunjanganAnakPerBulan;
        double potonganPensiun = gajiPokok * potonganPensiunPersen;
        double gajiBersih = gajiPokok + tunjanganAnak - potonganPensiun;
        System.out.println("--- Perhitungan Gaji Bersih Bu Jesi ---");
        System.out.println("Gaji pokok: Rp " + gajiPokok);
        System.out.println("Tunjangan anak: Rp" + tunjanganAnak);
        System.out.println("Potongan pensiun: Rp " + potonganPensiun);
        System.out.println("Gaji bersih per bulan: Rp " + gajiBersih);
        input.close();

    }
}