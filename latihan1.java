import java.util.Scanner;

public class latihan1 {
    static int masaKerja;

    public static int hitungGaji() {
        if (masaKerja < 5) {
            return 5000000;
        } else if (masaKerja >= 5 && masaKerja <= 10) {
            return 7500000;
        } else {
            return 10000000;
        }
    }

    public static int hitungUangLembur(int jumlahJamLembur) {
        int honorPerJam;
        if (masaKerja < 5) {
            honorPerJam = 40000;
        } else if (masaKerja >= 5 && masaKerja <= 10) {
            honorPerJam = 50000;
        } else {
            honorPerJam = 75000;
        }
        return honorPerJam * jumlahJamLembur;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input data
        masaKerja = scanner.nextInt(); //5
        int jumlahJamLembur = scanner.nextInt(); //5

        // Hitung gaji dan uang lembur
        int gaji = hitungGaji();
        int uangLembur = hitungUangLembur(jumlahJamLembur);

        System.out.println("Total Gaji Anda Adalah : \n" + gaji + uangLembur);
    }
}
