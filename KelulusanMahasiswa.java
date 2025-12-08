import java.util.Scanner;

public class KelulusanMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nama;
        String nim;

        double uts1;
        double uas1;
        double tugas1;
        double nilaiAkhir1;

        double uts2;
        double uas2;
        double tugas2;
        double nilaiAkhir2;

        String huruf1;
        String huruf2;

        String status1;
        String status2;

        double rataNilaiAkhir;
        String statusSemester;

        System.out.println("====== INPUT DATA MAHASISWA ======");
        System.out.print("Nama: ");
        nama = input.nextLine();

        System.out.print("NIM: ");
        nim = input.nextLine();

        System.out.println("\n--- Mata Kuliah 1: Algoritma dan Pemrograman ---");
        System.out.print("Nilai UTS: ");
        uts1 = input.nextDouble();

        System.out.print("Nilai UAS: ");
        uas1 = input.nextDouble();

        System.out.print("Nilai Tugas: ");
        tugas1 = input.nextDouble();

        nilaiAkhir1 = (uts1 * 0.3) + (uas1 * 0.4) + (tugas1 * 0.3);

        if (nilaiAkhir1 >= 80 && nilaiAkhir1 <= 100) {
            huruf1 = "A";
            status1 = "LULUS";
        } else if (nilaiAkhir1 >= 73) {
            huruf1 = "B+";
            status1 = "LULUS";
        } else if (nilaiAkhir1 >= 65) {
            huruf1 = "B";
            status1 = "LULUS";
        } else if (nilaiAkhir1 >= 60) {
            huruf1 = "C+";
            status1 = "LULUS";
        } else if (nilaiAkhir1 >= 50) {
            huruf1 = "C";
            status1 = "TIDAK LULUS";
        } else if (nilaiAkhir1 >= 39) {
            huruf1 = "D";
            status1 = "TIDAK LULUS";
        } else {
            huruf1 = "E";
            status1 = "TIDAK LULUS";
        }

        System.out.println("\n--- Mata Kuliah 2: Struktur Data ---");
        System.out.print("Nilai UTS: ");
        uts2 = input.nextDouble();

        System.out.print("Nilai UAS: ");
        uas2 = input.nextDouble();

        System.out.print("Nilai Tugas: ");
        tugas2 = input.nextDouble();

        nilaiAkhir2 = (uts2 * 0.3) + (uas2 * 0.4) + (tugas2 * 0.3);

        if (nilaiAkhir2 >= 80 && nilaiAkhir2 <= 100) {
            huruf2 = "A";
            status2 = "LULUS";
        } else if (nilaiAkhir2 >= 73) {
            huruf2 = "B+";
            status2 = "LULUS";
        } else if (nilaiAkhir2 >= 65) {
            huruf2 = "B";
            status2 = "LULUS";
        } else if (nilaiAkhir2 >= 60) {
            huruf2 = "C+";
            status2 = "LULUS";
        } else if (nilaiAkhir2 >= 50) {
            huruf2 = "C";
            status2 = "TIDAK LULUS";
        } else if (nilaiAkhir2 >= 39) {
            huruf2 = "D";
            status2 = "TIDAK LULUS";
        } else {
            huruf2 = "E";
            status2 = "TIDAK LULUS";
        }

        rataNilaiAkhir = (nilaiAkhir1 + nilaiAkhir2) / 2;

        if (status1.equals("LULUS") && status2.equals("LULUS")) {
            if (rataNilaiAkhir >= 70) {
                statusSemester = "LULUS";
            } else {
                statusSemester = "TIDAK LULUS (Rata-rata < 70)";
            }
        } else {
            statusSemester = "TIDAK LULUS";
        }

        System.out.println("\n============== HASIL PENILAIAN AKADEMIK ==============");
        System.out.println("Nama: " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("\nMata Kuliah\t\tUTS\tUAS\tTugas\tNilai Akhir\tNilai Huruf\tStatus");
        System.out.println("Algoritma Pemrograman\t" + uts1 + "\t" + uas1 + "\t" + tugas1 + "\t" + nilaiAkhir1 + "\t\t" + huruf1 + "\t\t" + status1);
        System.out.println("Struktur Data\t\t" + uts2 + "\t" + uas2 + "\t" + tugas2 + "\t" + nilaiAkhir2 + "\t\t" + huruf2 + "\t\t" + status2);
        System.out.println("\nRata-rata Nilai Akhir: " + rataNilaiAkhir);
        System.out.println("Status Semester: " + statusSemester);
    }
}
