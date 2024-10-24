

public class Nomor1{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan total penjualan salesman: ");
        double totalPenjualan = scanner.nextDouble();
        
        double komisi;

        if (totalPenjualan <= 500000) {
            komisi = totalPenjualan * 0.10; 
        } else {
            double komisiPertama = 500000 * 0.10; 
            double sisaPenjualan = totalPenjualan - 500000;
            double komisiSisa = sisaPenjualan * 0.15; 
            komisi = komisiPertama + komisiSisa;
        }
        
        // Output
        System.out.printf("Total penjualan salesman: %.0f\n", totalPenjualan);
        System.out.printf("Komisi yang didapatkan = %.1f\n", komisi);
        
        scanner.close();
    }
}
