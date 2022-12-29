package agen;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
import java.util.*;
import java.lang.Math;

public class getMakanan {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        getMakanan();
    }
    
    public static void getBeli(int harga) {
        int total, qty;
        
        System.out.print("MASUKAN QTY : ");
        qty = input.nextInt();
        total = harga * qty;
        System.out.println("TOTAL JUMLAH PEMBAYARAN : Rp. " + total);
    }
    
    public static void getMakanan() {
        String[] nama = new String[3];
        
        nama[0] = "SEBLAK";
        nama[1] = "BASO";
        nama[2] = "JUS";
        int[] harga = new int[3];
        
        harga[0] = 20000;
        harga[1] = 34000;
        harga[2] = 20000;
        String kondisi;
        
        kondisi = "Y";
        do {
            getTampil(nama, harga);
            System.out.println("MASUKAN PILIHAN MENU ?");
            int var_input;
            
            var_input = input.nextInt();
            if (var_input == 1) {
                getBeli(harga[0]);
            } else {
                if (var_input == 2) {
                    getBeli(harga[1]);
                } else {
                    if (var_input == 3) {
                        getBeli(harga[2]);
                    }
                }
            }
            System.out.print("LANJUT ( Y/T ) :");
            kondisi = input.nextLine();
        }
        while (kondisi.equals("Y") || kondisi.equals("y"));
    }
    
    public static void getTampil(String[] nama, int[] harga) {
        System.out.println("===== LIST MENU MAKANAN =====");
        System.out.println("[1] " + nama[0] + " = Rp. " + harga[0]);
        System.out.println("[2] " + nama[1] + " = Rp. " + harga[1]);
        System.out.println("[3] " + nama[2] + " = Rp. " + harga[2]);
    }
}
