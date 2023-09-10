/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package praktikum3;

import java.util.Scanner;

/**
 *
 * @author Olympus
 */
public class Soal2 {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] parts = line.split(" ");
            
            if (parts.length == 2) {
                String input = parts[0];
                int inputValue = Integer.parseInt(parts[1]);
                
                // Format the output
                String formatted = String.format("%-15s %03d", input, inputValue);
                System.out.println("======================");
                System.out.println(formatted);
                System.out.println("======================");
            }
        }
    }
}
