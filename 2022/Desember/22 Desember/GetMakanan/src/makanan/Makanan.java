package makanan;

import java.time.LocalDate;
import java.util.Scanner;

public class Makanan {
    
    // Limit Data
    static int maxValue = 0;
    public static Object[][] data = new Object[maxValue][2];

    public static void getdata() {

        if (data.length != 0) {
            int no = 0;
            System.out.println("|\tNO\t|\tNAMA MAKANAN\t|\tTANGGAL PRODUKSI\t|");
            System.out.println("-------------------------------------------------------------------------");
            for (int i = 0; i < data.length; i++) {
                no++;
                System.out.printf("|\t%d\t|\t%s\t\t|\t%s\t\t|\n",no, data[i][0], data[i][1]);

            }
        } else {
            System.err.println("Data Masih Kosong Harap Masukan Data Terlebih Dahulu !!!\n");
        }
        
        Main();
    }

    public static void setdata(Object[][] data, int maxValue) {
        Makanan.data = data;
        Makanan.maxValue = maxValue;
    }

    public static void insertData(){

        Scanner InputUser = new Scanner(System.in);
        
        try {

            System.out.print("MAX DATA MAKANAN (>2)\t: ");
            int maxValue = InputUser.nextInt();
            String dataBaru[][] = new String[maxValue][maxValue];

            for (int i = 0; i < maxValue; i++) {
                System.out.println("------------------------------");
                System.out.print("NAMA MAKANAN\t\t\t: ");
                InputUser.nextLine();
                String nama = InputUser.nextLine();
                System.out.print("TANGGAL KADALUARSA 'YYYY-MM-DD'\t: ");
                String nilai = InputUser.next();

                dataBaru[i][0] = nama;
                dataBaru[i][1] = nilai;

            }   

            setdata(dataBaru, maxValue);

        } catch (Exception e) {
            System.err.println("Data Yang Kamu Masukan Bukan Angka");
        }
        Main();
    }

    public static void Main(){
        System.out.println("\n====== KELAYAKAN MAKANAN ======");
        System.out.println("1. Lihat Data Makanan");
        System.out.println("2. Insert Data Makanan");
        System.out.println("3. Status Kelayakan");
        System.out.println("0. Keluar");

        Scanner InputUser = new Scanner(System.in);
        try {
            System.out.print("MASUKAN PILIHAN > ");
            String key = InputUser.next();
            int key_int = Integer.parseInt(key);

            switch (key_int) {
                case 1:
                    Makanan.getdata();
                    break;
                
                case 2:
                    Makanan.insertData();
                    break;

                case 3:
                    Makanan.getStatus();
                    break;

                default:
                    break;
                }
        } catch (Exception e) {
            System.err.println("Data Yang Kamu Masukan Bukan Angka\n");
        }
        
    }

    public static void getStatus(){
        if (data.length != 0) {
            int no = 0;
            System.out.println("|\tNO\t|\tNAMA MAKANAN\t|\tTANGGAL KADALUARSA\t|\tSTATUS\t\t|");
            System.out.println("-------------------------------------------------------------------------------------------------");
            for (int i = 0; i < data.length; i++) {
                no++;
                LocalDate nilai = LocalDate.parse((String) data[i][1]);

                if (nilai.isAfter(LocalDate.now())) {
                    System.out.printf("|\t%d\t|\t%s\t\t|\t%s\t\t|\tLAYAK DIMAKAN\t|\n",no, data[i][0], data[i][1]);
                } else {
                    System.out.printf("|\t%d\t|\t%s\t\t|\t%s\t\t|\tKADALUARSA\t|\n",no, data[i][0], data[i][1]);
                }

            }
        } else {
            System.err.println("Data Masih Kosong Harap Masukan Data Terlebih Dahulu !!!\n");
        }
        
        Main();
    }
}