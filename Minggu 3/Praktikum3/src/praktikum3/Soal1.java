/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3;

import java.util.Scanner;
import java.util.regex.*;

/**
 *
 * @author Olympus
 */
public class Soal1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String regex = "[A-Za-z]+";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        int jumlah = 0;
        
        while (matcher.find()) {
            String token = matcher.group();
            System.out.println(token);
            jumlah++;
        }
        System.out.println(jumlah);
    }
}