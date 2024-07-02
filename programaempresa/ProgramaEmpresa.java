/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programaempresa;

import java.util.Scanner;

/**
 *
 * @author Computador
 */
public class ProgramaEmpresa{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
        Scanner tec = new Scanner(System.in);
        Departamento d1 = new Departamento();
        Trabalhador t1 = new Trabalhador();
        
        
        System.out.println("Entre com o nome do departamento: ");
        d1.setNome(tec.next());

        
        System.out.println("Entre com os dados do Trabalahador:");
        System.out.print("Nome: ");
        t1.setNome(tec.next());
        System.out.println("Nível: ");
        t1.setNivel(NivelTrabalhador.JUNIOR);
        System.out.println("Salário Base: ");
        t1.setSalarioBase(tec.nextDouble());
        
        System.out.println("Quantos Contrato você que cadastrar: ");
        int vquantidade;
        vquantidade = tec.nextInt();
        int[] vetor = new int[vquantidade-1];
        
        for (int i=0; i<vquantidade; i++){
            System.out.println("Entre com o Contrato #" + vquantidade+1);
            
        }
    }
    
}
