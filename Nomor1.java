

public class Nomor1{
    public static void main(String[] args){
        int totalPenjualan;
        double komisi;
        
        if (totalPenjualan >= 500000) {
            komisi = totalPenjualan * 0.15;
        }
        else if (totalPenjualan == 500000) {
            komisi = totalPenjualan * 0.1;
        }
        System.out.println("total penjualan salesman :" + totalPenjualan);
        System.out.println("komisi yang didapatkan :" + komisi);
    }
}
