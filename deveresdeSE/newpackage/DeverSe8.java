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
public class DeverSe8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        String nome1;
            System.out.println("Digite o nome do primeiro candidato: ");
                nome1 = ler.next();
        int mat1;
            System.out.println("Nota em matematica: ");
                mat1 = ler.nextInt();
        int geo1;
            System.out.println("Nota em geografia: ");
                geo1 = ler.nextInt();
        int cg1;
            System.out.println("Nota em conhecimentos Gerais: ");
                cg1 = ler.nextInt();
        float media1;
            media1 = (mat1 + geo1 + cg1)/3;
                System.out.print("A media do Primeiro Candidato é: ");
                    System.out.println(+media1);
        if (media1 >= 7)
        {
            System.out.println("O "+nome1+" Foi aprovado");
        }else
        {
            System.out.println("O "+nome1+" Foi reprovado");
        }
        String nome2;
            System.out.println("Digite o nome do segundo candidato: ");
                nome2 = ler.next();
        int mat2;
            System.out.println("Nota em matematica: ");
                mat2 = ler.nextInt();
        int geo2;
            System.out.println("Nota em geografia: ");
                geo2 = ler.nextInt();
        int cg2;
            System.out.println("Nota em conhecimentos Gerais: ");
                cg2 = ler.nextInt();
        float media2;
            media2 = (mat2 + geo2 + cg2)/3;
                System.out.print("A media do segundo Candidato é: ");
                    System.out.println(+media2);
        if (media2 >= 7)
        {
            System.out.println("O "+nome2+" Foi aprovado");
        }else
        {
            System.out.println("O "+nome2+" Foi reprovado");
        }
        String nome3;
            System.out.println("Digite o nome do terceiro candidato: ");
                nome3 = ler.next();
        int mat3;
            System.out.println("Nota em matematica: ");
                mat3 = ler.nextInt();
        int geo3;
            System.out.println("Nota em geografia: ");
                geo3 = ler.nextInt();
        int cg3;
            System.out.println("Nota em conhecimentos Gerais: ");
                cg3 = ler.nextInt();
        float media3;
            media3 = (mat3 + geo3 + cg3)/3;
                System.out.print("A media do terceiro Candidato é: ");
                    System.out.println(+media3);
        if (media3 >= 7)
        {
            System.out.println("O "+nome3+" Foi aprovado");
        }else
        {
            System.out.println("O "+nome3+" Foi reprovado");
        }
    }
    
}
