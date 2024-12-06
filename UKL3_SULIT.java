/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ukl3_sulit;

import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class UKL3_SULIT {
    public static void umur(int a) {
        a = 10;
        System.out.println("nama saya fadi, umur"+ a);
}
    public static void main(String[] args) {
        // Input array
        int[] array = {5, -3, 7, 9, -1};
        

        // ArrayList untuk menyimpan elemen negatif
        ArrayList<Integer> negatifList = new ArrayList<>();

        // Memeriksa setiap elemen dalam array
        for (int elemen : array) {
            if (elemen < 0) {
                negatifList.add(elemen);
            }
        }

        // Output hasil
        if (negatifList.isEmpty()) {
            System.out.println("Array tidak mengandung elemen negatif.");
        } else {
            System.out.print("Array mengandung elemen negatif: ");
            for (int i = 0; i < negatifList.size(); i++) {
                System.out.print(negatifList.get(i));
                if (i < negatifList.size() - 1) {
                    System.out.print(", ");
                    
    
            
                    
                }
            }
        }
    }
}