/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package desenvolvimento_de_sistemas.exercicio1._menu;

//Importe as bibliotecas necessarias.
import java.util.Scanner;

/**
 * @Date 12/02/2024
 * @author josé vicente carvalho
 */
public class Exercicio11_Menu {

    public static void main(String[] args) {
        /*1. Menu de Embalagens
        Crie um programa em Java que apresente um menu interativo sobre diferentes tipos de embalagens. 
        O usuário poderá escolher entre três opções: caixa de papelão, sacola plástica e embalagem de vidro. 
        O programa deve exibir uma breve descrição da embalagem escolhida. 
        O menu deve se repetir até que o usuário selecione a opção de sair.
        
        Caixa de papelão: Ideal para transporte e armazenamento
        Sacola plástica: Leve e prática, mas pouco sustentável
        Embalagem de vidro: Resistente e reutilizável*/
        
        Scanner painel = new Scanner(System.in);
        
        int opicao = 4;
        
        while (opicao != 0) {
            
    //        Apresente o menu de opçoes ao usuario
            System.out.println("\n\tMenu de Embalagens.");
            System.out.println("1. Caixa de Papelão: Ideal para transporte e armazenamento.");
            System.out.println("2. Sacola plástica: Leve e prática, mas pouco sustentável.");
            System.out.println("3. Embalagem de vidro: Resistente e reutilizável.");
            System.out.println("0. Encerrar programa.");

            System.out.print("\nDigite o número da opção desejada: ");
            opicao = painel.nextInt();
            System.out.println("");

            switch (opicao) {
                case 1:
                    System.out.println("Opção 1 selecionada.\nCaixa de papelão: Ideal para transporte e armazenamento.");
                    break;

                case 2:
                    System.out.println("Opção 2 selecionada.\nSacola plástica: Leve e prática, mas pouco sustentável.");
                    break;

                case 3:
                    System.out.println("Opção 3 selecionada.\nEmbalagem de vidro: Resistente e reutilizável.");
                    break;
                    
                case 0:
                    System.out.println("Encerrando Programa...");
                    break;

                default:
                    System.out.println("Opção inválida, tente novamente.");
                    break;
            }

        }
        painel.close();
    }
}