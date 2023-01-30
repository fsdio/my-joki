import java.util.Scanner;

public class daftar{
    public static Scanner input = new Scanner (System.in);
    public static String nama,alamat,tgl,nohp;
    public static int harga,pil;
    
    public static void main(String[] args) {
        daftar();
    }

    public static void Main(){
        System.out.println("---------- Daftar Fasilitas Kamar dan Harganya ----------");
        System.out.println("[1] AC + Kamar Mandi Dalam\t Rp. 500.000,-\t perbulan");
        System.out.println("[2] AC + Kamar Mandi Luar\t Rp. 400.000,-\t perbulan");
        System.out.println("[3] Kipas + Kamar Mandi Dalam\t Rp. 300.000,-\t perbulan");
        System.out.println("[4] Kipas + Kamar Mandi Luar\t Rp. 250.000,-\t perbulan");
    }


    static void data() {
        System.out.print("---------- Masukkan Data Anda ----------");
        input.nextLine();
        System.out.println();
        try {
            System.out.print("1. Masukkan Nama Anda             : ");
            nama = input.nextLine();
            System.out.print("2. Masukkan Alamat Anda           : ");
            alamat = input.nextLine();
            System.out.print("3. Masukkan No HP Anda            : ");
            nohp = input.nextLine();
            System.out.print("4. Masukkan Tanggal Masuk         : ");
            tgl = input.nextLine();
            System.out.print("5. Masukkan Pilihan Kamar         : ");
            pil = input.nextInt();
        } catch (Exception e) {
            System.out.println(e);
        }
        
        
    }

    static void harga() {
        System.out.println("========== FASILITAS ANDA ==========");
        switch (pil){
            case 1:
                harga = 500000;
                System.out.println("Fasilitas Kamar                 : " + "AC + Kamar Mandi Dalam");
                System.out.println("Harga Kamar                     : "+harga);
                System.out.println("Pembayaran Setiap Tanggal       : "+tgl);
                break;
            case 2:
                harga = 400000;
                System.out.println("Fasilitas Kamar                 : " + "AC + Kamar Mandi Luar");
                System.out.println("Harga Kamar                     : "+harga);
                System.out.println("Pembayaran Setiap Tanggal       : "+tgl);
                break;
            case 3:
                harga = 300000;
                System.out.println("Fasilitas Kamar                 : " + "Kipas + Kamar Mandi Dalam");
                System.out.println("Harga Kamar                     : "+harga);
                System.out.println("Pembayaran Setiap Tanggal       : "+tgl);
                break;
            case 4:
                harga = 250000;
                System.out.println("Fasilitas Kamar                 : " + "Kipas + Kamar Mandi Luar");
                System.out.println("Harga Kamar                     : "+harga);
                System.out.println("Pembayaran Setiap Tanggal       : "+tgl);
                break;
            default:
                System.out.println("Tidak Ada Dalam Pilihan");
                
        }
    }

    static void output() {
        System.out.println("---------- Bukti Sewa Kamar Kost ----------");
        System.out.println("Nama Penyewa        : "+nama);
        System.out.println("Alamat Penyewa      : "+alamat);
        System.out.println("No HP Penyewa       : "+nohp);
        harga();
    }

    public static void daftar() {
        System.out.println("----------------------------------------------");
        System.out.println("            KAMAR KOST PERTIWI                ");
        System.out.println("----------------------------------------------");

        String ulangi = "Y";
        do {
            Main();
            data();
            harga();
            output();
            System.out.print("Ulangi Program (Y/N) : ");
            ulangi = input.next().toUpperCase();
        } while (ulangi.equals("Y"));
        
        System.out.println("----------------------------------------------");
        System.out.println("            TERIMA KASIH                      ");
        System.out.println("----------------------------------------------");
               
    }
}