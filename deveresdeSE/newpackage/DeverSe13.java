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
public class DeverSe13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner ler = new Scanner(System.in);
    int nota;
        System.out.println("Digite a sua nota: ");
            nota = ler.nextInt();
    if(nota > 0 & nota <=49)
    {
        System.out.println("Irregular");
    }else if(nota >= 50 & nota <= 64)
    {
        System.out.println("Regular");
    }else if(nota >= 65 & nota <=84)
    {
        System.out.println("Bom");
    }else
    {
        System.out.println("Otimo");
    }
    }
    
}
