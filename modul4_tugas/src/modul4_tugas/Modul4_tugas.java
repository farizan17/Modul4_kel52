/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul4_tugas;

import java.util.Scanner;

/**
 *
 * @author ROG
 */
public class Modul4_tugas {
    static void orang1(){
        System.out.println("David Eddy Putra P 21120119130074");
    }
    static void orang2(){
        System.out.println("Muhammad Farizan K 21120119130090");
    }
    static void batas(){
        System.out.println("=================================");
    }
    static void menu() {
        System.out.println("     WELCOME TO PB SHOP 56     ");
        System.out.println("       CASH PB RERMURAH        ");    
    }
    static void pagar(){
        System.out.println("#################################");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);{
        menuutama objek;
            objek = new menuutama();
        int proses, option;
        orang1();
        orang2();
        batas(); 
        System.out.println ("");
        menu();
        System.out.println ("");
        batas();
        pagar();
        batas();
            
        do {
            objek.menu_dahsyat();
            System.out.print("> ");
        option=sc.nextInt();
        switch(option) {
            case 1:
            System.out.println ("================================");
            System.out.println ("DATA PEMBELIAN");
            System.out.println ("VOUCHER CASH PB = Rp.100.000");
            System.out.println ("CASH DALAM GAME = 10.000 CASH PB");
            System.out.println ("================================");
            break;
            
            case 2:
            System.out.println ("================================");
            System.out.println ("DATA PEMBELIAN");
            System.out.println ("VOUCHER CASH PB = Rp.50.000");
            System.out.println ("CASH DALAM GAME = 5000 CASH PB");
            System.out.println ("================================");
            break;
            
            case 3:
            System.out.println ("================================");
            System.out.println ("DATA PEMBELIAN");
            System.out.println ("VOUCHER CASH PB = Rp.20.000");
            System.out.println ("CASH DALAM GAME = 2000 CASH PB");
            System.out.println ("================================");
            break;
            
            case 4:
            System.out.println ("================================");
            System.out.println ("DATA PEMBELIAN");
            System.out.println ("VOUCHER CASH PB = Rp.10.000");
            System.out.println ("CASH DALAM GAME = 1000 CASH PB");
            System.out.println ("================================");
            break;
            default:
                System.out.println("TERIMAKASIH MENGGUNAKAN JASA KAMI");
        }
        System.out.println ("\nTEKAN 0 UNTUK KEMBALI KE MENU");
        System.out.print ("->> ");
        proses = sc.nextInt();
        ++proses;
        }
        while ( proses <= 1);
        System.out.println("TRANSAKSI SELESAI");    
        }
        
        }
    }
    

