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
public class DeverSe5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        int valor1;
            System.out.println("Digite o Valor fixado: ");
        valor1 = ler.nextInt();
        String nome1;
            System.out.println("Digite o seu nome: ");
        nome1 = ler.next();
        int venda1;
            System.out.println("Digite o valor vendido: ");
        venda1 = ler.nextInt();
        if ( valor1 > venda1)
        {
            System.out.println("O "+nome1+" não atingiu a meta");
        }else
        {
            System.out.println("O "+nome1+" atingiu a meta");
        }
    }
    
}
