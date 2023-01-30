public class daftar{
    private static String nama,alamat;
    private static int harga,nohp,pil,tgl;
    
public static void main(String[] args) {
        System.out.println("---------- Daftar Fasilitas Kamar dan Harganya ----------");
        System.out.println("1. AC + Kamar Mandi Dalam\t Rp. 500.000,-\t perbulan");
        System.out.println("2. AC + Kamar Mandi Luar\t Rp. 400.000,-\t perbulan");
        System.out.println("3. Kipas + Kamar Mandi Dalam\t Rp. 300.000,-\t perbulan");
        System.out.println("4. Kipas + Kamar Mandi Luar\t Rp. 250.000,-\t perbulan");
 
}
    static void data() {
        System.out.println("---------- Masukkan Data Anda ----------");
        System.out.println("1. Masukkan Nama Anda    : ");
        System.out.println("2. Masukkan Alamat Anda  : ");
        System.out.println("3. Masukkan No HP Anda   : ");
        System.out.println("Masukkan Tanggal Masuk  : ");
        System.out.println("Masukkan Pilihan Kamar  : ");
        
    }

    static void harga() {
        switch (pil){
            case 1:
                harga = 500000;
                System.out.println("Fasilitas Kamar     : AC + Kamar Mandi Dalam");
                System.out.println("Harga Kamar         : "+harga);
                System.out.println("Pembayaran Setiap Tanggal     : "+tgl);
                break;
            case 2:
                harga = 400000;
                System.out.println("Fasilitas Kamar     : AC + Kamar Mandi Luar ");
                System.out.println("Harga Kamar         : "+harga);
                System.out.println("Pembayaran Setiap Tanggal     : "+tgl);
                break;
            case 3:
                harga = 300000;
                System.out.println("Fasilitas Kamar     : Kipas + Kamar Mandi Dalam ");
                System.out.println("Harga Kamar         : "+harga);
                System.out.println("Pembayaran Setiap Tanggal     : "+tgl);
                break;
            case 4:
                harga = 250000;
                System.out.println("Fasilitas Kamar     : Kipas + Kamar Mandi Luar ");
                System.out.println("Harga Kamar         : "+harga);
                System.out.println("Pembayaran Setiap Tanggal     : "+tgl);
                break;
            default:
                System.out.println("Tidak Ada Dalam Pilihan");
                
        }
    }

    static void output() {
        System.out.println("---------- Bukti Sewa Kamar Kost ----------");
        System.out.println("Nama Penyewa : "+nama);
        System.out.println("Alamat Penyewa : "+alamat);
        System.out.println("No HP Penyewa : "+nohp);
        harga();
    }

    public static void daftar (String[] args) {
        System.out.println("----------------------------------------------");
        System.out.println("            KAMAR KOST PERTIWI                ");
        System.out.println("----------------------------------------------");
        data();
        harga();
        output();
        System.out.println("----------------------------------------------");
        System.out.println("            TERIMA KASIH                      ");
        System.out.println("----------------------------------------------");
               
    }
}