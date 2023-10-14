/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package deveresdeSE.newpackage;
import java.util.Scanner;
/**
 *
 * @author mathe
 */
public class DeverSe12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner ler = new Scanner(System.in);
    int diaria;
        System.out.println("A diaria: ");
            diaria = ler.nextInt();
    if(diaria > 15)
    {
        float valor16;
                valor16 = (float) ((float) 60 + (5.50 * diaria));
                    System.out.println("O total a pagar é: "+valor16);
    }else if(diaria == 15)
    {
        int valor15;
            valor15 = (int) ((int) 60 + (6 * diaria));
                System.out.println("O total a pagar é: "+valor15);
    }else if(diaria < 15)
    {
        int valor14;
            valor14 = (int) ((int) 60 + (8 * diaria));
                System.out.println("O total a pagar é: "+valor14);
    }
    }
    
}
