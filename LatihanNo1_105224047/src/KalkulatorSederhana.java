import java.util.Scanner;

public class KalkulatorSederhana {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukin angka pertama : ");
        double angka1 = input.nextDouble();
        
        System.out.print("Masukin operatornya (ada +, -, *, /): ");
        
        char operator = input.next().charAt(0);
        
        System.out.print("Masukin angka kedua: ");
        double angka2 = input.nextDouble();

        
        switch (operator) {
            case '+':
                System.out.println("Hasil: " + (angka1 + angka2));
                break;
            case '-':
                System.out.println("Hasil: " + (angka1 - angka2));
                break;
            case '*':
                System.out.println("Hasil: " + (angka1 * angka2));
                break;
            case '/':
                if (angka2 != 0) {
                    System.out.println("hasilnya: " + (angka1 / angka2));
                } else {
                    System.out.println("gagal: Pembagian pakai nol gak bisa.");
                }
                break;
            default:
                System.out.println("Operatornya salah bro");
        }
        
        input.close(); 
    }
}