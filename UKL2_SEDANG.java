/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ukl2_sedang;

/**
 *
 * @author USER
 */
public class UKL2_SEDANG {

    public static void main(String[] args) {
        // variabel
        int jumlahBulan = 12;
        int tabunganBulanPertama = 100000; // Rp100.000
        int kenaikanBulanan = 50000; // Rp50.000
        int totalTabungan = 0;

        // loop utk menghitung tabungan setiap bulan
        for (int bulan = 1; bulan <= jumlahBulan; bulan++) {
            
            int tabunganBulanIni = tabunganBulanPertama + (kenaikanBulanan * (bulan - 1));
            totalTabungan += tabunganBulanIni; // Tambahkan tabungan bulan ini ke total
            
            System.out.println("Tabungan bulan ke-" + bulan + ": Rp." + tabunganBulanIni );
        }

        // print total tabungan setelah 12 bulan
        System.out.println("Total tabungan selama 12 bulan: Rp." + totalTabungan );
    }
}
