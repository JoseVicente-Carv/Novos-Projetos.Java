/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package desenvolvimento_de_sistemas.exercicio1.menu_mochilas;

import java.util.Scanner;

/**
 * @Date 07/03/2025
 * @author josé Vicente Carvalho
 */
public class Exercicio13Menu_Mochilas {

    public static void main(String[] args) {
        /*3-Menu de Mochilas
        apresente um menu com três tipos de mochilas: escolar, de viagem e esportiva. 
        O programa deve exibir informações sobre a mochila escolhida e permitir que o usuário continue explorando as opções até que decida encerrar o programa.
        
            Descrições:
        Mochila Escolar: Compacta e ideal para estudantes
        Mochila de Viagem: Espaçosa, ideal para longas jornadas
        Mochila Esportiva: Leve, resistente e ergonômica */
        
        Scanner painel = new Scanner(System.in);
        
        //inicie as variaveis necessarias
        int opcao;
        Boolean interruptor = true;
        
        while (interruptor) {            
            //apresente um menu com 3 tipos de mochilas
            System.out.println("\n\tMenu 3 (Mochilas.)");
            System.out.println("1. Mochila escolar; \n2. Mochila de viagem; \n3. Mochila Esportiva; \n0. Enecerrae programa.");

            //o usuario escolhe a opção desejada
            System.out.print("\nDigite a opção desejada: ");
            opcao = painel.nextInt();
            
            System.out.println("");

            //exibir informações escolhidas
            switch (opcao) {
                case 0: // opção de encerrar o programa
                    System.out.println("Encecrrando programa...");
                    interruptor = false; //encerra o ciclo infinito
                    break;

                case 1: // exibir descrição da mochila 
                    System.out.println("Mochila Escolar: Compacta e ideal para estudantes.");
                    break;
                    
                case 2: //exibir descrição da mochila de viagem
                    System.out.println("Mochila de Viagem: Espaçosa, ideal para longas jornadas.");
                    break;
                    
                case 3: //exibir descrição da mochila esportiva
                    System.out.println("Mochila Esportiva: Leve, resistente e ergonômica.");
                    break;
                    
                default:
                    System.out.println("Opção inválida.\nTente novamente.");
            } // fim do switch-case
        } // fim do laçod e repetição WHILE
        
        painel.close();
        System.out.println("\n\tTarefa concluída!");
    }
}