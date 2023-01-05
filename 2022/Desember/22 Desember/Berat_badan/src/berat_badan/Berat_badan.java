package berat_badan;

import java.util.Scanner;

public class Berat_badan {
    
    // Limit Data
    public static int maxValue = 0;
    public static Object[][] data = new Object[maxValue][2];

    public static void main(String[] args) {
        Berat_badan.Main();
    }

    public static void getdata() {

        if (data.length != 0) {
            int no = 0;
            System.out.println("|\tNO\t|\tNAMA\t\t\t|\tBerat Badan\t|");
            System.out.println("-----------------------------------------------------------------");
            for (int i = 0; i < data.length; i++) {
                no++;
                System.out.printf("|\t%d\t|\t%s\t\t\t|\t%s\t\t|\n",no, data[i][0], data[i][1]);

            }
        } else {
            System.err.println("Data Masih Kosong Harap Masukan Data Terlebih Dahulu !!!\n");
        }
        
        Main();
    }

    public static void setdata(Object[][] data, int maxValue) {
        Berat_badan.data = data;
        Berat_badan.maxValue = maxValue;
    }

    public static void insertData(){

        Scanner InputUser = new Scanner(System.in);
        
        try {

            System.out.print("MAX DATA BERAT BADAN (>2)\t: ");
            int maxValue = InputUser.nextInt();
            String dataBaru[][] = new String[maxValue][maxValue];

            for (int i = 0; i < maxValue; i++) {
                System.out.println("------------------------------");
                System.out.print("NAMA\t\t\t: ");
                InputUser.nextLine();
                String nama = InputUser.nextLine();
                System.out.print("BERAT BADAN\t\t\t: ");
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
        System.out.println("\n====== BERAT BADAN ======");
        System.out.println("1. Lihat Data Berat Badan");
        System.out.println("2. Insert Data Berat Badan");
        System.out.println("3. Status Berat Badan");
        System.out.println("0. Keluar");

        Scanner InputUser = new Scanner(System.in);
        try {
            System.out.print("MASUKAN PILIHAN > ");
            String key = InputUser.next();
            int key_int = Integer.parseInt(key);

            switch (key_int) {
                case 1 -> Berat_badan.getdata();
                
                case 2 -> Berat_badan.insertData();

                case 3 -> Berat_badan.getStatus();

                default -> {
                }
                }
        } catch (NumberFormatException e) {
            System.err.println("Data Yang Kamu Masukan Bukan Angka\n");
        }
        
    }

    public static void getStatus(){
        if (data.length != 0) {
            int no = 0;
            System.out.println("|\tNO\t|\tNAMA\t\t\t|\tBERAT BADAN\t|\tSTATUS\t\t|");
            System.out.println("-----------------------------------------------------------------------------------------");
            for (Object[] data1 : data) {
                no++;
                int berat_badan = Integer.parseInt((String) data1[1]);
                if (berat_badan >= 60) {
                } else if (berat_badan >= 40) {
                    System.out.printf("|\t%d\t|\t%s\t\t\t|\t%s\t\t|\tIDEAL\t|\n", no, data1[0], data1[1]);
                } else if (berat_badan >= 20) {
                    System.out.printf("|\t%d\t|\t%s\t\t\t|\t%s\t\t|\tKURUS\t\t|\n", no, data1[0], data1[1]);
                } else {
                    System.out.printf("|\t%d\t|\t%s\t\t\t|\t%s\t\t|\tOVERWEIGHT\t|\n", no, data1[0], data1[1]);
                }
            }
        } else {
            System.err.println("Data Masih Kosong Harap Masukan Data Terlebih Dahulu !!!\n");
        }
        
        Main();
    }
}