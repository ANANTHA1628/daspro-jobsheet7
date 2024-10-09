import java.util.Scanner;
public class tugas2 {
    public static void main(String[] args) {
        Scanner input06 =new Scanner(System.in);
        int jenisKendaraan;
        int durasi;
        double totalPembayaran;
      
        double tarifMobil = 3000; 
        double tarifMotor = 2000; 
        double tarifTetap = 12500; 
        
        while (true) {
            System.out.println("Masukkan jenis kendaraan (1 untuk Mobil, 2 untuk Motor, 0 untuk keluar): ");
            jenisKendaraan = input06.nextInt();

            if (jenisKendaraan == 0) {
                break;
            }

            System.out.println("Masukkan durasi parkir (dalam jam): ");
            durasi = input06.nextInt();
            
            if (durasi > 5) {
                totalPembayaran = tarifTetap; 
            } else {
                if (jenisKendaraan == 1) {
                    totalPembayaran = durasi * tarifMobil; 
                } else if (jenisKendaraan == 2) {
                    totalPembayaran = durasi * tarifMotor; 
                } else {
                    System.out.println("Jenis kendaraan tidak valid.");
                    continue; 
                }
            }
            
            System.out.println("Total pembayaran parkir: Rp " + totalPembayaran);
        }
        
        System.out.println("Program selesai.");
    }
}
