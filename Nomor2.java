

public class Nomor2{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int[] tarif = {0, 50000, 40000, 30000};
        double[] biayaPelayananPersentase = {0, 0.3, 0.2, 0.1};
        
        double totalPendapatan = 0;
        int jumlahTransaksi = 0;
        boolean inputLagi = true;

        while (inputLagi) {
            System.out.print("Masukan kode bungalow [1/2/3]: ");
            int kode = input.nextInt();
            System.out.print("lama menginap (malam): ");
            int malam = input.nextInt();

            double biayaMenginap = malam * tarif[kode];

            double biayaPelayanan = biayaMenginap * biayaPelayananPersentase[kode];

            double totalBiaya = biayaMenginap + biayaPelayanan;

            totalPendapatan += totalBiaya;
            jumlahTransaksi++;

            System.out.print("Input lagi (Y/N)?: ");
            String jawab = input.next();
            inputLagi = jawab.equals("Y");
        }


        System.out.println("Jumlah transaksi penyewaan bungalow = " + jumlahTransaksi);
        System.out.println("Total pendapatan = " + totalPendapatan);
        
        input.close();

    }
}

