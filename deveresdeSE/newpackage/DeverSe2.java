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
public class DeverSe2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        String nome1;
                System.out.println("Digite o seu nome: ");
        nome1 = ler.next();
        int peso1;
                System.out.println("Digite o seu peso: ");
        peso1 = ler.nextInt();
        String nome2;
                System.out.println("Digite o seu nome: ");
        nome2 = ler.next();
        int peso2;
                System.out.println("Digite o seu peso: ");
        peso2 = ler.nextInt();
        if (peso1 > peso2)
        {
            System.out.println("Logo á: " + nome1 + " e a mais pesada e o seu peso é: " + peso1);
        }else{
            System.out.println("Logo á: " + nome2 + " e a mais pesada e o seu peso é: " + peso2);
        }
    }
    
}
