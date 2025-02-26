/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package desenvolvimentodesistemas.exercicio1.menu_csnetas;

import java.util.Scanner;

/**
 * @Date 26/02/2025
 * @author aluno.den
 */
public class Exercicio1Menu_Canetas {

    public static void main(String[] args) {
        /*2 - Menu de Canetas
        Implemente um programa em Java que exiba um menu com três tipos de canetas: esferográfica, gel e tinteiro.
        Ao escolher uma opção, o programa deve apresentar uma descrição sobre a caneta selecionada. 
        O menu deve continuar sendo exibido até que o usuário escolha sair.

        Descrições: 
            Caneta Esferográfica: Econômica e de longa duração
            Caneta Gel: Tinta mais pigmentada e escrita suave
            Caneta Tinteiro: Clássica e elegante, usada para caligrafia*/
        
//        Abrir entrada para o usuario digitar
        Scanner painel = new Scanner(System.in);
        // iniciar variavel necessaria pro laço de repe3tição
        int opcao = 0;
        
        // inicar laço de repetição infinito
        while (opcao != 4) {            
            //exibir menu de opção ao usuario
            System.out.println("\n\tMenu de canetas");
            System.out.println("1. canetas esferográfica; \n2. Caneta gel; \n3. Caneta tinteiro;");
            System.out.println("4. Sair do menu.");
            
            System.out.print("\nDigite o número da opção desejada: ");
            opcao = painel.nextInt();
            System.out.println("");
            
            // inicar switch-case para a opcao digitada
            switch (opcao) {
                case 1:
                    System.out.println("Opção 1 selecionada.");
                    System.out.println("Caneta Esferográfica: Econômica e de longa duração.");
                    break;
                    
                case 2:
                    System.out.println("Opção 2 selecionada");
                    System.out.println("Caneta Gel: Tinta mais pigmentada e escrita suave.");
                    break;
                
                case 3:
                    System.out.println("Opção 3 selecionada");
                    System.out.println("Caneta Tinteiro: Clássica e elegante, usada para caligrafia.");
                    break;

                case 4:
                    System.out.println("Saindo do menu...");
                    break;
                    
                default:
                    System.out.println("Opção inválida.\nTente novamente.");
                    break;
            } // fim do switch-case
        } //fim do lçao de repetição infinito
        
        System.out.println("\n\tTarefa concluída!");
        
        painel.close(); // fechar acesso ao teclado
    }
}
