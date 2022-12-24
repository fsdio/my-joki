package barang;

import java.util.Scanner;

public class Barang {
    
    // Limit Data
    static int maxValue = 0;
    public static Object[][] data = new Object[maxValue][2];

    public static void getdata() {

        if (data.length != 0) {
            int no = 0;
            System.out.println("|\tNO\t|\tNAMA\t\t|\tHARGA\t\t|");
            System.out.println("-----------------------------------------------------------------");
            for (int i = 0; i < data.length; i++) {
                no++;
                System.out.printf("|\t%d\t|\t%s\t\t|\tRp. %s\t\t|\n",no, data[i][0], data[i][1]);

            }
        } else {
            System.err.println("Data Masih Kosong Harap Masukan Data Terlebih Dahulu !!!\n");
        }
        
        Main();
    }

    public static void setdata(Object[][] data, int maxValue) {
        Barang.data = data;
        Barang.maxValue = maxValue;
    }

    public static void insertData(){

        Scanner InputUser = new Scanner(System.in);
        
        try {

            System.out.print("MAX DATA BARANG (>2)\t: ");
            int maxValue = InputUser.nextInt();
            String dataBaru[][] = new String[maxValue][2];

            for (int i = 0; i < maxValue; i++) {
                System.out.println("------------------------------");
                System.out.print("NAMA BARANG\t\t: ");
                InputUser.nextLine();
                String nama = InputUser.nextLine();
                System.out.print("HARGA BARANG\t\t: ");
                String harga = InputUser.next();

                dataBaru[i][0] = nama;
                dataBaru[i][1] = harga;

            }   

            setdata(dataBaru, maxValue);

        } catch (Exception e) {
            System.err.println("Data Yang Kamu Masukan Bukan Angka");
        }
        Main();
    }

    public static void Main(){
        System.out.println("\n====== BARANG PERSEDIAAN ======");
        System.out.println("1. Lihat Data Barang");
        System.out.println("2. Insert Data Barang");
        System.out.println("3. Status Barang");
        System.out.println("0. Keluar");

        Scanner InputUser = new Scanner(System.in);
        try {
            System.out.print("MASUKAN PILIHAN > ");
            String key = InputUser.next();
            int key_int = Integer.parseInt(key);

            switch (key_int) {
                case 1:
                    Barang.getdata();
                    break;
                
                case 2:
                    Barang.insertData();
                    break;

                case 3:
                    Barang.getStatus();
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
            System.out.println("|\tNO\t|\tNAMA\t\t|\tHARGA\t\t|\tSTATUS\t\t|");
            System.out.println("-----------------------------------------------------------------------------------------");
            for (int i = 0; i < data.length; i++) {
                no++;
                int harga = Integer.parseInt((String) data[i][1]);
                if ( harga <= 10000) {
                    System.out.printf("|\t%d\t|\t%s\t\t|\t%s\t\t|\tMURAH\t\t|\n",no, data[i][0], data[i][1]);
                } else {
                    System.out.printf("|\t%d\t|\t%s\t\t|\t%s\t\t|\tMAHAL\t\t|\n",no, data[i][0], data[i][1]);
                }

            }
        } else {
            System.err.println("Data Masih Kosong Harap Masukan Data Terlebih Dahulu !!!\n");
        }
        
        Main();
    }
}