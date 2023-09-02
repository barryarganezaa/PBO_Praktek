/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StringOperations;

import java.util.Scanner;
/**
 *
 * @author Olympus
 */

import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        Scanner text = new Scanner(System.in);

        // Baca Input String A dan String B
        System.out.print("Masukkan String Pertama : ");
        String A = text.nextLine();
        System.out.print("Masukkan String Kedua : ");
        String B = text.nextLine();

        // Menjumlahkan panjang dari string A dan B
        System.out.println(A.length() + B.length());

        // Cek leksikografis apakah string A lebih besar dari string B
        System.out.println(A.compareTo(B) > 0 ? "Yes" : "No");

        // Kapitalisasi huruf awal kata dan memberikan spasi
        A = A.substring(0, 1).toUpperCase() + A.substring(1);
        B = B.substring(0, 1).toUpperCase() + B.substring(1);
        System.out.println(A + " " + B);
    }
}
