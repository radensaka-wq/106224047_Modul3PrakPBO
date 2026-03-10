import java.util.Scanner;

public class CekDonorDarah {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // buat input data dari user
        System.out.print("Masukkan Usia: ");
        int usia = input.nextInt();

        System.out.print("Masukkan Berat Badan (kg): ");
        double beratBadan = input.nextDouble();

        System.out.print("Masukkan Kadar Hemoglobin: ");
        double hb = input.nextDouble();

        System.out.println("--------------------------------------------------------------");

    
        // cek Usia donor 17-65 tahun
        if (usia >= 17 && usia <= 65) {
            
            // jadi kalo usia masuk, cek berat badan minim 45 kg
            if (beratBadan >= 45.0) {
                
                // kalo beratnya masuk, cek hemogoblin biasanya 12.5 - 17.0
                if (hb >= 12.5 && hb <= 17.0) {
                    System.out.println("Hasilnya : Selamat anda bisa menjadi pendonor darah.");
                } else {
                    // gagal di tahap hb
                    System.out.println("Hasil : Tidak diterima, Kadar Hemoglobin melebihi syarat atau tidak memenuhi.");
                }

            } else {
                // gagal di tahap berat badan
                System.out.println("Hasil : Tidak diterima, Berat badan anda harus minimal harus 45 kg.");
            }

        } else {
            // gagal ditahap awal brarti di usia
            System.out.println("Hasil: Tidak diterima Usia harus di antara 17 sampai 65 tahun.");
        }

        input.close();
    }
}