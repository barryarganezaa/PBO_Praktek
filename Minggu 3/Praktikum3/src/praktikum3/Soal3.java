/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3;

import java.util.Scanner;
/**
 *
 * @author Olympus
 */
public class Soal3 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan operasi : ");
        double A = input.nextDouble();
        String operator = input.next();
        double B = input.nextDouble();
        double hasil = 0;
        
        switch (operator)
        {
            case "+" :
                hasil = A + B;
                break;
            case "-" :
                hasil = A - B;
                break;
            case "*" :
                hasil = A * B;
                break;
            case "/" :
                if (B != 0)
                {
                    hasil = A / B;
                }
                else
                {
                    System.out.println("Error : pembagian oleh nol");
                    System.exit(1);
                }
                break;
            case "%" :
                if (B != 0)
                {
                    hasil = A % B;
                }
                else
                {
                    System.out.println("Error : modulo oleh nol");
                    System.exit(1);
                }
                break;
            default :
                System.out.println("Error : Operator tidak valid");
                System.exit(1);
        }
        System.out.println("Hasil : " + hasil);
    }
}
