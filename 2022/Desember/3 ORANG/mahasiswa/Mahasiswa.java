package mahasiswa;

import java.util.Scanner;

public class Mahasiswa {
    
    // Limit Data
    static int maxValue = 0;
    public static Object[][] data = new Object[maxValue][2];

    public static void getdata() {

        if (data.length != 0) {
            int no = 0;
            System.out.println("|\tNO\t|\tNAMA\t\t|\tNILAI\t\t|");
            System.out.println("-----------------------------------------------------------------");
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
        Mahasiswa.data = data;
        Mahasiswa.maxValue = maxValue;
    }

    public static void insertData(){

        Scanner InputUser = new Scanner(System.in);
        
        try {

            System.out.print("MAX DATA MAHASISWA (>2)\t: ");
            int maxValue = InputUser.nextInt();
            String dataBaru[][] = new String[maxValue][maxValue];

            for (int i = 0; i < maxValue; i++) {
                System.out.println("------------------------------");
                System.out.print("NAMA\t\t\t: ");
                InputUser.nextLine();
                String nama = InputUser.nextLine();
                System.out.print("NILAI\t\t\t: ");
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
        System.out.println("\n====== NILAI MAHASISWA ======");
        System.out.println("1. Lihat Data Mahasiswa");
        System.out.println("2. Insert Data Mahasiswa");
        System.out.println("3. Status Kelulusan");
        System.out.println("0. Keluar");

        Scanner InputUser = new Scanner(System.in);
        try {
            System.out.print("MASUKAN PILIHAN > ");
            String key = InputUser.next();
            int key_int = Integer.parseInt(key);

            switch (key_int) {
                case 1:
                    Mahasiswa.getdata();
                    break;
                
                case 2:
                    Mahasiswa.insertData();
                    break;

                case 3:
                    Mahasiswa.getStatus();
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
            System.out.println("|\tNO\t|\tNAMA\t\t|\tNILAI\t\t|\tSTATUS\t\t|");
            System.out.println("-----------------------------------------------------------------------------------------");
            for (int i = 0; i < data.length; i++) {
                no++;
                int nilai = Integer.parseInt((String) data[i][1]);
                if ( nilai >= 75) {
                    System.out.printf("|\t%d\t|\t%s\t\t|\t%s\t\t|\tLULUS\t\t|\n",no, data[i][0], data[i][1]);
                } else {
                    System.out.printf("|\t%d\t|\t%s\t\t|\t%s\t\t|\tTIDAK LULUS\t|\n",no, data[i][0], data[i][1]);
                }

            }
        } else {
            System.err.println("Data Masih Kosong Harap Masukan Data Terlebih Dahulu !!!\n");
        }
        
        Main();
    }
}