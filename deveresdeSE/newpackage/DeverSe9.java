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
public class DeverSe9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        String nome1;
            System.out.println("Digite o seu nome: ");
                nome1 = ler.next();
        int venda1;
            System.out.println("Quantidade vendida: ");
                venda1 = ler.nextInt();
        float com1;
            com1 = (float) (venda1 * 0.12);
        float com2;
            com2 = (float) (venda1 * 0.095);
        float com3;
            com3 = (float) (venda1 * 0.007);
        if (venda1 >= 50000)
        {
             System.out.println("A comissão do vendedor é: "+com1);       
        }else if (venda1 >= 30000 & venda1 < 50000)
        {
            System.out.println("A comissão do vendedor é: "+com2);
        }else if (venda1 < 30000)
        {
            System.out.println("A comissão do vendedor é: "+com3);
        }
        String nome2;
            System.out.println("Digite o seu nome: ");
                nome2 = ler.next();
        int venda2;
            System.out.println("Quantidade vendida: ");
                venda2 = ler.nextInt();
        float com4;
            com4 = (float) (venda2 * 0.12);
        float com5;
            com5 = (float) (venda2 * 0.095);
        float com6;
            com6 = (float) (venda2 * 0.007);
        if (venda2 >= 50000)
        {
             System.out.println("A comissão do vendedor é: "+com4);       
        }else if (venda2 >= 30000 & venda2 < 50000)
        {
            System.out.println("A comissão do vendedor é: "+com5);
        }else if (venda2 < 30000)
        {
            System.out.println("A comissão do vendedor é: "+com6);
        }
        String nome3;
            System.out.println("Digite o seu nome: ");
                nome3 = ler.next();
        int venda3;
            System.out.println("Quantidade vendida: ");
                venda3 = ler.nextInt();
        float com7;
            com7 = (float) (venda3 * 0.12);
        float com8;
            com8 = (float) (venda3 * 0.095);
        float com9;
            com9 = (float) (venda3 * 0.007);
        if (venda1 >= 50000)
        {
             System.out.println("A comissão do vendedor é: "+com7);       
        }else if (venda3 >= 30000 & venda3 < 50000)
        {
            System.out.println("A comissão do vendedor é: "+com8);
        }else if (venda3 < 30000)
        {
            System.out.println("A comissão do vendedor é: "+com9);
        }
        int totalvenda;
            totalvenda = venda1+ venda2+ venda3;
                System.out.println("O total de vendas foi: "+totalvenda);
    }
    
}
