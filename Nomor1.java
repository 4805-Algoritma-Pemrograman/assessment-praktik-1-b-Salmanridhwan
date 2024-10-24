

import java.util.Scanner;

public class Nomor1{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan total penjualan salesman: ");
        double totalPenjualan = input.nextDouble();
        
        double komisi;

        if (totalPenjualan <= 500000) {
            komisi = totalPenjualan * 0.10; 
        } else {
            double komisiPertama = 500000 * 0.10; 
            double sisaPenjualan = totalPenjualan - 500000;
            double komisiSisa = sisaPenjualan * 0.15; 
            komisi = komisiPertama + komisiSisa;
        }
        
        System.out.println("Total penjualan salesman" + totalPenjualan);
        System.out.println("Komisi yang didapatkan:"+ komisi);
        
        input.close();

    
