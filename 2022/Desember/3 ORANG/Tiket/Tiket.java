package Tiket;

import java.util.Scanner;

public class Tiket {
    
    // Limit Data
    static int maxValue = 0;
    public static Object[][] data = new Object[maxValue][2];

    public static void main(String[] args) {
        Tiket.Main();
    }

    public static void getdata() {

        if (data.length != 0) { 
            int no = 0;
            System.out.println("|\tNO\t|\tNAMA\t\t\t|\tHARGA\t\t|");
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
        Tiket.data = data;
        Tiket.maxValue = maxValue;
    }

    public static void insertData(){

        Scanner InputUser = new Scanner(System.in);
        
        try {

            System.out.print("MAX DATA TIKET (>2)\t: ");
            int maxValue = InputUser.nextInt();
            String dataBaru[][] = new String[maxValue][2];

            for (int i = 0; i < maxValue; i++) {
                System.out.println("------------------------------");
                System.out.print("NAMA TIKET\t\t: ");
                InputUser.nextLine();
                String nama = InputUser.nextLine();
                System.out.print("HARGA TIKET\t\t: ");
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
        System.out.println("\n====== PERSEDIAAN TIKET PESAWAT ======");
        System.out.println("1. Lihat Data Tiket");
        System.out.println("2. Insert Data Tiket");
        System.out.println("3. Status Tiket");
        System.out.println("0. Keluar");

        Scanner InputUser = new Scanner(System.in);
        try {
            System.out.print("MASUKAN PILIHAN > ");
            String key = InputUser.next();
            int key_int = Integer.parseInt(key);

            switch (key_int) {
                case 1:
                    Tiket.getdata();
                    break;
                
                case 2:
                    Tiket.insertData();
                    break;

                case 3:
                    Tiket.getStatus();
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
            System.out.println("|\tNO\t|\tNAMA\t\t\t|\tHARGA\t\t\t|\tSTATUS\t\t|");
            System.out.println("-----------------------------------------------------------------------------------------");
            for (int i = 0; i < data.length; i++) {
                no++;
                int harga = Integer.parseInt((String) data[i][1]);
                if ( harga <= 500000) {
                    System.out.printf("|\t%d\t|\t%s\t\t|\t%s\t\t\t|\tEKONOMI\t\t\t|\n",no, data[i][0], data[i][1]);
                } else {
                    System.out.printf("|\t%d\t|\t%s\t\t|\t%s\t\t\t|\tFIRST CLASS\t\t|\n",no, data[i][0], data[i][1]);
                }

            }
        } else {
            System.err.println("Data Masih Kosong Harap Masukan Data Terlebih Dahulu !!!\n");
        }
        
        Main();
    }
}