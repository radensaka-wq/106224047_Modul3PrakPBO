import java.util.Scanner;

public class KioskSoundfest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        
        int stokVip = 5;
        int stokFestival = 25;
        int stokTribune = 35;
        
        int hargaVip = 1500000;
        int hargaFestival = 800000;
        int hargaTribune = 500000;

        
        while (true) {
            System.out.println("\n==== UNIVERSITAS PERTAMINA SOUNDFEST 2026 ====");
            System.out.println("Sisa Stok brader:");
            System.out.println("1. VIP (Rp 1.500.000)      - Stok: " + stokVip);
            System.out.println("2. Festival (Rp 800.000)   - Stok: " + stokFestival);
            System.out.println("3. Tribun (Rp 500.000)    - Stok: " + stokTribune);
            System.out.println("4. Matiin Mesin kusus teknisi bae");
            System.out.print("Pilih menu brader: ");
            int pilihan = input.nextInt();

            if (pilihan == 4) {
                System.out.println("Mesin dimatiin.");
                break; 
            }

            if (pilihan < 1 || pilihan > 3) {
                System.out.println("Pilihan lu ora tersedia bae.");
                continue;
            }

            System.out.print("Masukin jumlah tiket yang pengen lu beli brader: ");
            int jumlahBeli = input.nextInt();

            
            int stokSekarang = 0;
            int hargaTiket = 0;
            int syaratUsia = 0;
            String namaKategori = "";

            if (pilihan == 1) {
                stokSekarang = stokVip;
                hargaTiket = hargaVip;
                syaratUsia = 18;
                namaKategori = "VIP";
            } else if (pilihan == 2) {
                stokSekarang = stokFestival;
                hargaTiket = hargaFestival;
                syaratUsia = 15;
                namaKategori = "Festival";
            } else {
                stokSekarang = stokTribune;
                hargaTiket = hargaTribune;
                syaratUsia = 0; 
                namaKategori = "Tribun";
            }

            
            if (jumlahBeli > stokSekarang) {
                System.out.println("SOrry brader, stok gak cukup (Sisa stoknya " + namaKategori + ": " + stokSekarang + ")");
                continue; 
            }

            int tiketBerhasil = 0;
            boolean batalDarurat = false;

            
            for (int i = 1; i <= jumlahBeli; i++) {
                int usia = 0;
                
                
                while (true) {
                    System.out.print("Masukinusia buat tiket ke-" + i + " (Ketik -1 untuk Batal brader): ");
                    usia = input.nextInt();

                    if (usia == -1) {
                        batalDarurat = true;
                        break;
                    }

                    if (usia <= 0 || usia > 120) {
                        System.out.println("Usia ora logis dah. sekarang masukin lagi dah brader.");
                    } else {
                        break; 
                    }
                }

                if (batalDarurat) {
                    System.out.println("Transaksi dibatalin pengguna.");
                    break; 
                }

                
                if (usia >= syaratUsia) {
                    System.out.println("Tiket ke-" + i + " Berhasil diverifikasi.");
                    tiketBerhasil++;
                } else {
                    System.out.println("Tiket ke-" + i + " Gagal: Usia gak sesuai syarat minimal brader " + syaratUsia + " tahun.");
                }
            }

            
            if (!batalDarurat) {
                long totalTagihan = (long) tiketBerhasil * hargaTiket;
                
                
                if (pilihan == 1) stokVip -= tiketBerhasil;
                else if (pilihan == 2) stokFestival -= tiketBerhasil;
                else stokTribune -= tiketBerhasil;

                System.out.println("\n--- NOTA PEMBAYARAN ---");
                System.out.println("Kategori: " + namaKategori);
                System.out.println("Tiket Berhasil: " + tiketBerhasil);
                System.out.println("Total Tagihan : Rp " + totalTagihan);
                System.out.println("-----------------------");
            }
        }
    }
}