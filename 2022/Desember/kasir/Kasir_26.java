import java.util.Scanner;

public class Kasir_26{
    static Scanner rb = new Scanner(System.in);
        
    static void menu(){
        
        System.out.println(" _______________________________________");
        System.out.println("|                                       |");
        System.out.println("|              Menu Utama               |");
        System.out.println("|_______________________________________|");
        System.out.println("| (1) Transaksi                         |");
        System.out.println("| (2) Cetak Nota Transaksi              |");
        System.out.println("| (3) Pembayaran                        |");
        System.out.println("| (4) Laporan Penjualan                 |");
        System.out.println("| (5) Cari                              |");
        System.out.println("|_______________________________________|");
        System.out.println();
    }
    
    static void transaksi(){
        int pil;
        System.out.println(" ______________________________________");
        System.out.println("|                                      |");
        System.out.println("|             Pilih Paket              |");
        System.out.println("|______________________________________|");
        System.out.println("|                                      |");
        System.out.println("| (1) Paket Menu Praktis               |");
        System.out.println("| (2) Menu Goceng                      |");
        System.out.println("| (3) Menu Ala Carte                   |");
        System.out.println("| (4) Menu Minuman                     |");
        System.out.println("| (5) Menu Paket Kenyang               |");
        System.out.println("|______________________________________|");
        System.out.print("PILIH PAKET   : ");
        pil = rb.nextInt();
        
        if (pil == 1){
            System.out.println(" ________________________________________");
            System.out.println("|                      |                 |");
            System.out.println("|  Paket Menu Praktis  |      Harga      |");
            System.out.println("|______________________|_________________|");
            System.out.println("|                      |                 |");
            System.out.println("|  [1] Chick'n Fillet  |    Rp 14.500    |");
            System.out.println("|  [2] Fish Fillet     |    Rp 19.000    |");
            System.out.println("|  [3] OR Burger       |    Rp 19.000    |");
            System.out.println("|  [4] Oriental Bento  |    Rp 20.000    |");
            System.out.println("|  [5] Twisty          |    Rp 19.000    |");
            System.out.println("|______________________|_________________|");

        }else if (pil == 2){
            System.out.println(" _______________________________________");
            System.out.println("|                     |                 |");
            System.out.println("|  Menu Paket Goceng  |      Harga      |");
            System.out.println("|_____________________|_________________|");
            System.out.println("|                     |                 |");
            System.out.println("|  [1] Ceam Soup      |     Rp 5.000    |");
            System.out.println("|  [2] KFC Soup       |     Rp 5.000    |");
            System.out.println("|  [3] KFC Puding     |     Rp 5.000    |");
            System.out.println("|  [4] Perkedel       |     Rp 5.000    |");
            System.out.println("|_____________________|_________________|");
        }else if (pil == 3){
            System.out.println(" ______________________________________________________________");
            System.out.println("|                                           |                  |");
            System.out.println("|           Menu Ala Carte                  |       Harga      |");
            System.out.println("|___________________________________________|__________________");
            System.out.println("|                                           |                  |");
            System.out.println("|  [1]  1 Pc Chicken Crispy                 |    Rp  15.500    |");
            System.out.println("|  [2]  1 Pc Chicken Original               |    Rp  16.500    |");
            System.out.println("|  [3]  2 Pc Chicken Crispy                 |    Rp  29.500    |");
            System.out.println("|  [4]  2 Pc Chicken Original               |    Rp  31.500    |");
            System.out.println("|  [5]  Crispy Strip                        |    Rp  19.000    |");
            System.out.println("|  [6]  French Fries                        |    Rp  15.000    |");
            System.out.println("|  [7]  French Fries Large                  |    Rp  23.000    |");
            System.out.println("|  [8]  KFC Rice                            |    Rp   9.500    |");
            System.out.println("|  [9]  Whole CHicken Cryspy (KFC Bucket)   |    Rp 103.000    |");
            System.out.println("|  [10] Whole CHicken Original (KFC Bucket) |    Rp 110.000    |");
            System.out.println("|  [11] Wing Bucket Crispy (KFC Bucket)     |    Rp  84.000    |");
            System.out.println("|  [12] Wing Bucket Original (KFC Bucket)   |    Rp  84.000    |");
            System.out.println("|  [13] Yakiniku                            |    Rp  23.000    |");
            System.out.println("|___________________________________________|__________________");
        }else if (pil == 4){
            System.out.println(" _______________________________________________");
            System.out.println("|                               |               |");
            System.out.println("|       Menu Minuman            |     Harga     |");
            System.out.println("|_______________________________|_______________|");
            System.out.println("|                               |               |");
            System.out.println("|  [1]  Aqua                    |   Rp 5.000    |");
            System.out.println("|  [2]  Frestea                 |   Rp 8.000    |");
            System.out.println("|  [3]  Coca-Cola               |   Rp 9.000    |");
            System.out.println("|  [4]  Tropicana Twister       |   Rp 5.000    |");
            System.out.println("|  [5]  Hot Brulee Coffee       |   Rp 10.000   |"); 
            System.out.println("|  [6]  Hot Capuccino Brulee    |   Rp 19.000   |");
            System.out.println("|  [7]  Ice Latte Brulee        |   Rp 23.500   |");
            System.out.println("|  [8]  Hot Espresso Singe      |   Rp 8.000    |");
            System.out.println("|  [9]  Hot Espresso Double     |   Rp 15.500   |");
            System.out.println("|  [10] Capuccino               |   Rp 16.500   |");
            System.out.println("|  [11] Cafe Latte              |   Rp 17.000   |");
            System.out.println("|  [12] Mocca Latte             |   Rp 21.000   |");
            System.out.println("|  [13] Caramel Macchito        |   Rp 21.000   |");
            System.out.println("|  [14] Iced Latte              |   Rp 20.000   |");
            System.out.println("|  [15] Hot Chocolate           |   Rp 20.000   |");
            System.out.println("|  [16] Fresh Brewed Coffe      |   Rp 14.500   |");
            System.out.println("|  [17] Hazelnut Coffe          |   Rp 10.500   |");
            System.out.println("|_______________________________|_______________|");
        }else{
            System.out.println(" _______________________________");
            System.out.println("|                               |");
            System.out.println("|         Paket Kenyang 1       |");
            System.out.println("|_______________________________|");
            System.out.println("|                               |");
            System.out.println("|       2 Krispy Burger         |");
            System.out.println("|       2 Coca-Cola             |");
            System.out.println("|       1 French Fries          |");
            System.out.println("|_______________________________|");
            System.out.println("|                               |");    
            System.out.println("|       Harga Rp. 57.000        |");    
            System.out.println("|_______________________________|");
            System.out.println();

            System.out.println(" _______________________________");
            System.out.println("|                               |");
            System.out.println("|         Paket Kenyang 2       |");
            System.out.println("|_______________________________|");
            System.out.println("|                               |");
            System.out.println("|       2 Original Burger       |");
            System.out.println("|       2 Coca-Cola             |");
            System.out.println("|       1 French Fries          |");
            System.out.println("|_______________________________|");
            System.out.println("|                               |");    
            System.out.println("|       Harga Rp. 50.000        |");    
            System.out.println("|_______________________________|");
            System.out.println();

            System.out.println(" _______________________________");
            System.out.println("|                               |");
            System.out.println("|         Paket Kenyang 3       |");
            System.out.println("|_______________________________|");
            System.out.println("|                               |");
            System.out.println("|       2 Krunchy Burger        |");
            System.out.println("|       2 Coca-Cola             |");
            System.out.println("|       1 French Fries          |");
            System.out.println("|_______________________________|");
            System.out.println("|                               |");    
            System.out.println("|       Harga Rp. 41.500        |");    
            System.out.println("|_______________________________|");
            System.out.println();

            System.out.println(" _______________________________");
            System.out.println("|                               |");
            System.out.println("|         Paket Kenyang 4       |");
            System.out.println("|_______________________________|");
            System.out.println("|                               |");
            System.out.println("|       1 Red Hot Bento         |");
            System.out.println("|       2 Chicken Strips        |");   
            System.out.println("|_______________________________|");
            System.out.println("|                               |");    
            System.out.println("|       Harga Rp. 26.000        |");    
            System.out.println("|_______________________________|");
            System.out.println();

            System.out.println(" _______________________________");
            System.out.println("|                               |");
            System.out.println("|         Paket Kenyang 5       |");
            System.out.println("|_______________________________|");
            System.out.println("|                               |");
            System.out.println("|       2 Fish Fillet           |");
            System.out.println("|       2 Coca-Cola             |");
            System.out.println("|       1 French Fries          |");
            System.out.println("|_______________________________|");
            System.out.println("|                               |");    
            System.out.println("|       Harga Rp. 54.500        |");    
            System.out.println("|_______________________________|");
            System.out.println();

            System.out.print("PILIH PAKET KENYANG  : ");
            pil = rb.nextInt();
        
        }
    }
    static void paket1(){
        System.out.println("-----PAKET KENYANG 1-----");
        System.out.println("2 Krispy Burger");
        System.out.println("2 Coca-Cola");
        System.out.println("1 French Fries");
        System.out.println("Harga Rp. 57.273");
        System.out.println();
        }
    static void paket2(){
        System.out.println("-----PAKET KENYANG 2-----");
        System.out.println("2 Original Burger");
        System.out.println("2 Coca-Cola");
        System.out.println("1 French Fries");
        System.out.println("Harga Rp. 50.000");
        System.out.println();
    }
    static void paket3(){
        System.out.println("-----PAKET KENYANG 3-----");
        System.out.println("2 Krunchy Burger");
        System.out.println("2 Coca-Cola");
        System.out.println("1 French Fries");
        System.out.println("Harga Rp. 41.354");
        System.out.println();
    }
    static void paket4(){
        System.out.println("-----PAKET KENYANG 4-----");
        System.out.println("1 Red Hot Bento");
        System.out.println("2 Chicken Strips");
        System.out.println("Harga Rp. 25.909");
        System.out.println();
    }
    static void paket5(){

        System.out.println("-----PAKET KENYANG 5-----");
        System.out.println("2 Fish Fillet");
        System.out.println("2 Coca-Cola");
        System.out.println("1 French Fries");
        System.out.println("Harga Rp. 54.545");
        System.out.println();
    }

    static void cetaknota(){
        System.out.println("Cetak Nota Transaksi");
    }
    static void pembayaran(){
        System.out.println("Pembayaran");
    }
    static void laporan(){
        System.out.println("Laporan Penjualan");
    }
    static void cari(){
        System.out.println("Masukkan Daftar Yang Anda Cari");
    }
    
    public static void main(String[] args) {
        menu();
        System.out.print("PILIH MENU    : ");
        int pilihan;
        pilihan = rb.nextInt();
        switch (pilihan) {
            case 1:
            transaksi();
                
                break;
            case 2:
            cetaknota();
                break;
            case 3:
            pembayaran();
                break;
            case 4:
            laporan();
                break;
            case 5:
            cari();
                break;         
        }
    }
}
