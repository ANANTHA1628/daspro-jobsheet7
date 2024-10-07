import java.util.Scanner;
public class SiakadFor06 {
    public static void main(String[] args) {
        Scanner input06 =new Scanner(System.in);

        double nilai , tertinggi = 0 , terendah = 100;
        for (int i = 1; i <=10; i++){
            System.out.print("masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = input06.nextDouble();
           if (nilai > tertinggi){
            tertinggi = nilai;
           }
           if (nilai < terendah){
            terendah = nilai;
           }
        }
   System.out.println("nilai tertinggi: " + tertinggi);
   System.out.println("nilai terdendah: " + terendah);
    }
    
}


