import java.util.ArrayList;
import java.util.Scanner;

public class latihan2 {
    
    static ArrayList<Integer> nilaiList = new ArrayList<>();

    //method hitung rata rata
    static double hitungRataRata() {
        int total = 0;
        for (int nilai : nilaiList) {
            total += nilai;
        }
        return (double) total / nilaiList.size();
    }

    //method nyari nilai minimal
    static int hitungNilaiMinimal() {
        int nilaiMin = nilaiList.get(0); //manggil index ke 0
        for (int nilai : nilaiList) {
            if (nilai < nilaiMin) { //bandingin nilai per index
                nilaiMin = nilai;
            }
        }
        return nilaiMin;
    }

    //method nyari nilai maksimal
    static int hitungNilaiMaksimal() {
        int nilaiMax = nilaiList.get(0); //manggil index ke 0
        for (int nilai : nilaiList) { 
            if (nilai > nilaiMax) { //bandingin nilai per index
                nilaiMax = nilai; 
            }
        }
        return nilaiMax; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        int nilai;

        while (true) {
            System.out.print("Masukkan nilai (atau pilih 'T' untuk selesai): ");
            input = scanner.nextLine();

            if (input.equalsIgnoreCase("T")) {
                break;
            } else {
                // Mengecek apakah input adalah angka
                if (isNumeric(input)) {
                    nilai = Integer.parseInt(input);
                    nilaiList.add(nilai); //masukin nilai yang diinput user ke dalam arraylist
                } else {
                    System.out.println("Input tidak valid, coba lagi.");
                }
            }
        }

        if (nilaiList.size() > 0) {
            System.out.println("Nilai minimal: " + hitungNilaiMinimal());
            System.out.println("Nilai maksimal: " + hitungNilaiMaksimal());
            System.out.println("Nilai rata-rata: " + hitungRataRata());
        } else {
            System.out.println("Tidak ada nilai yang dimasukkan.");
        }

        scanner.close();
    }

    public static boolean isNumeric(String str) {
        try {
            Integer.parseInt(str); // Coba mengonversi string ke integer
            return true;  // Jika berhasil, berarti ini angka
        } catch (NumberFormatException e) {
            return false;  // Kalau gagal, berarti bukan angka
        }
    }
}
