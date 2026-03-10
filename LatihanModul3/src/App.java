import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan Usia : ");
        
        int usia = input.nextInt();

        if (usia > 17){
            System.out.println( "Oke boleh");
            System.out.println("Masukan Berat");
            float bb = input.nextFloat();
            if (bb > 45);{
                System.out.println("Boleh lanjut");
                System.out.println("Masukan Hemo : ");
                float h = input.nextFloat();

                if (h > 12.5);
                System.out.println("Mantap boleh");
             
             }
        }
    }
}
