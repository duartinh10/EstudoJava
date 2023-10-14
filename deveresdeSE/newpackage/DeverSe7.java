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
public class DeverSe7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        float n1;
            System.out.print("Digite um valor: ");
        n1 = ler.nextFloat();
        float n2;
            System.out.print("Digite outro valor: ");
        n2 = ler.nextFloat();
        float n3;
            System.out.print("Digite mais um valor: ");
        n3 = ler.nextFloat();
        if(n1 > n2 & n1 > n3 & n2 > n3)
        {
            System.out.println("Terceiro "+n3+" Segundo "+n2+" Primeiro "+n1);
        }else if(n2 > n1 & n2 > n3 & n1 > n3)
        {
            System.out.println("Terceiro "+n3+" Segundo "+n1+" Primeiro "+n2);
        }else if(n3 > n1 & n3 > n2 & n2 > n1)
        {
            System.out.println("Terceiro "+n1+" Segundo "+n2+" Primeiro "+n3);
        }else if(n2 > n1 & n2 > n3 & n3 > n1)
        {
            System.out.println("Terceiro "+n1+" Segundo "+n3+" Primeiro "+n2);
        }else if(n1 > n2 & n1 > n3 & n3 > n2)
        {
            System.out.println("Terceiro "+n2+" Segundo "+n3+" Primeiro "+n1);
        }else if(n3 > n1 & n3 > n2 & n1 > n2)
        {
            System.out.println("Terceiro "+n2+" Segundo "+n1+" Primeiro "+n3);
        }
    }
    
}
