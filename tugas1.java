import java.util.Scanner;
public class tugas1 {
    public static void main(String[] args) {
        Scanner input06 =new Scanner(System.in);
       
        int hargaTiket = 50000;
        int totalTiketTerjual = 0;
        double totalPenjualan = 0;

        System.out.print("Masukkan jumlah transaksi hari ini: ");
        int jumlahTransaksi = input06.nextInt();

        for (int i = 1; i <= jumlahTransaksi; i++) {
            System.out.print("Transaksi " + i + " - Masukkan jumlah tiket yang dibeli: ");
            int jumlahTiket = input06.nextInt();
        if (jumlahTiket < 0) {
             System.out.println("Input tidak valid. Jumlah tiket tidak boleh negatif.");
        } else {
            double diskon = 0;
         if (jumlahTiket > 10) {
             diskon = 0.15;
        } else if (jumlahTiket > 4) {
             diskon = 0.10;
        }
    
        double hargaTotal = jumlahTiket * hargaTiket * (1 - diskon);
         totalTiketTerjual += jumlahTiket;
         totalPenjualan += hargaTotal;

         System.out.println("Total harga untuk " + jumlahTiket + " tiket adalah: Rp " + hargaTotal);
            }
        }
        
        System.out.println("\n=== Laporan Penjualan ===");
        System.out.println("Total tiket terjual: " + totalTiketTerjual);
        System.out.println("Total penjualan: Rp " + totalPenjualan);

  
    }
 }
        
    

