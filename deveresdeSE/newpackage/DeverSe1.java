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
public class DeverSe1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        int n1;
            System.out.println("Digite um numero: ");
        n1 = ler.nextInt();
        int n2;
            System.out.println("Digite outro numero: ");
        n2 = ler.nextInt();
        if (n1 > n2)
        {
            System.out.println("O n1 e maior que n2");
        }else if(n2 > n1)
        {
            System.out.println("O n2 e maior que n1");
        }else if (n2 == n1)
        {
            System.out.println("Os numeros são iguais");
        }
    }
    
}
