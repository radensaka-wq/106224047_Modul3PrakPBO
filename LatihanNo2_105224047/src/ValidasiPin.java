import java.util.Scanner;

public class ValidasiPin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String pinBenar = "123456";
        int percobaan = 0;
        boolean sukses = false;

        while (percobaan < 3) {
            System.out.print("Masukkan PIN bro: ");
            String inputPin = input.next();
            percobaan++;

            if (inputPin.equals(pinBenar)) {
                System.out.println("login bisa bro");
                sukses = true;
                break; 
            } else {
                System.out.println("PIN Salah bro jadi Sisa percobaan lu : " + (3 - percobaan));
            }
        }

        if (!sukses) {
            System.out.println("akun lu diblokir bro sorry yak.");
        }
    }
}