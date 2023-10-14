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
public class DeverSe3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        String nome1;
                System.out.println("Digite o seu nome: ");
        nome1 = ler.next();
        int ano1;
                System.out.println("Digite o ano que vc nasceu: ");
        ano1 = ler.nextInt();
        int idade1;
            idade1 = 2023 - ano1;
                System.out.println("A idade da "+nome1+" é: "+idade1);
        String nome2;
                System.out.println("Digite o seu nome: ");
        nome2 = ler.next();
        int ano2;
                System.out.println("Digite o ano que vc nasceu: ");
        ano2 = ler.nextInt();
        int idade2;
            idade2 = 2023 - ano2;
                System.out.println("A idade da "+nome2+" é: "+idade2);
        if (idade1 > idade2)
        {
            System.out.println("A "+nome2+" e mais nova que "+nome1);
        }else
        {
            System.out.println("A "+nome1+" e mais nova que "+nome2);
        }
    }
    
}
