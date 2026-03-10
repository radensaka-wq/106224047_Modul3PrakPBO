public class DeretTerfilter {
    public static void main(String[] args) {
        System.out.println("deret angka :"); //kelipatan 3 atau 5
        
        for (int i = 1; i <= 50; i++) {
            
            if (i % 3 == 0 || i % 5 == 0) {
                continue; 
            }
            System.out.print(i + " ");
        }
    }
}