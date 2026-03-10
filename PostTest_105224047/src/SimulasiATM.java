import java.util.Scanner;

public class SimulasiATM {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int menuPilihan;
        int saldoSaatIni = 500000; 
        int nominalTransaksi;

        do {
            
            System.out.println("\n==== ATM SEDERHANA ====");
            System.out.println("1. Lihat Saldo");
            System.out.println("2. Tabung Uang (Setor)");
            System.out.println("3. Ambil Uang (Tarik)");
            System.out.println("4. Selesai / Keluar");
            System.out.print(" pilih bro dari menu nya 1 sampai 4 : ");
            
            menuPilihan = input.nextInt();

            
            switch (menuPilihan) {

                case 1:
                    
                    System.out.println("menginfokan bro : Saldo lu sekarang sekian Rp " + saldoSaatIni);
                    break;

                case 2:
                    
                    System.out.print("Masukin jumlah uang yang pengen lu ditabung bro : Rp ");
                    nominalTransaksi = input.nextInt();
                    
                    
                    saldoSaatIni = saldoSaatIni + nominalTransaksi; 
                    System.out.println("sukses bro  saldo lu udah tambah.");
                    break;

                case 3:
                    
                    System.out.print("Masukin jumlah uang yang pengen diambil bro : Rp ");
                    nominalTransaksi = input.nextInt();

                    
                    if (saldoSaatIni - nominalTransaksi >= 50000) {
                        saldoSaatIni = saldoSaatIni - nominalTransaksi; 
                        System.out.println("sukses bro sekarang ambil uang lu bro.");
                    } else {
                        
                        System.out.println("sorry bro : saldo lu gak cukup, lu harus sisain minimal Rp 50.000 bro");
                    }
                    break;

                case 4:
                    
                    System.out.println("thanks bro :) jangan lupa ambil kartu ATM lu bro jangan buru buru bae.");
                    break;

                default:
                    
                    System.out.println("warning nih : menu yang lu pilih gak ada coba lagi dah dan menu yang bisa dipilih cuman ada 4 bro inget.");
            }

        } while (menuPilihan != 4); 

        input.close();
    }
}