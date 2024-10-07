import java.util.Scanner;
public class KafeDoWhile06 {
    public static void main(String[] args) {
        Scanner input06 =new Scanner(System.in);
        int kopi,teh,roti,totalHarga;
        String namaPelanggan; 

        int hargaKopi = 12000;
        int hargaTeh = 7000;
        int hargaRoti = 20000;
        
        do { 
            System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
            namaPelanggan=input06.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan.");
                break;
            }
            System.out.print("jumlah kopi: ");
            kopi = input06.nextInt();
            System.out.print("jumlah teh: ");
            teh = input06.nextInt();
            System.out.print("jumlah roti: ");
            roti = input06.nextInt();
            totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.println("Total yang harus dibayar: Rp " + totalHarga);
            input06.nextLine();
        } while (true);
        System.out.println("semua transaksi selesai.");
    }   
}
