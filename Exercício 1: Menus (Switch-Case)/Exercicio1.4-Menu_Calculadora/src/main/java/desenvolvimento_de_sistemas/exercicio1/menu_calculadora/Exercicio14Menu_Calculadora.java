/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package desenvolvimento_de_sistemas.exercicio1.menu_calculadora;

import java.util.Scanner;

/**
 * @Date 14/03/2025
 * @author aluno.den
 */

public class Exercicio14Menu_Calculadora {

    public static void main(String[] args) {
        /*4-Calculadora
        apresente um menu com as operações básicas (soma, subtração, multiplicação e divisão). 
        O usuário deve informar dois números e escolher a operação desejada. 
        O programa deve continuar rodando até que o usuário escolha sair. */
        
        Scanner painel = new Scanner(System.in);
        
//        Iniciar variaveis necessarias;
        Boolean menu = true;
        float primeiroNumero;
        float segundoNumero;
        float resultado;
        String operacao;
        
        // iniciar laço de reptição iinfinito condicional.
        while(menu){
            //apresentar menu de opções ao usuario.
            System.out.println("\n\tExercício 1.4 - Menu de Calculadora");
            System.out.println("+. Adição; \n-. Subtração; \n*. Multiplicação; \n/. Divisão;");
            System.out.println("s. Sair.");
            
            // deixe o usuario selecionar a opção desejada.
            System.out.print("\nDigite o código da opção desejada: ");
            operacao = painel.next();
            
            System.out.print("\nDigite o primeiro número da equação: ");
            primeiroNumero = painel.nextFloat();

            System.out.print("Digite o segundo número da equação: ");
            segundoNumero = painel.nextFloat();
            
            System.out.println("");
                
            // Inicar Estrutura Condicional de multipla escolha para a opção selecionada pelo usuario.
            switch (operacao) {
                case "+":
                    resultado = (primeiroNumero + segundoNumero);
                    System.out.println("Resultado da operação: " + resultado);
                    break;
                    
                case "-":
                    resultado = (primeiroNumero - segundoNumero);
                    System.out.println("Resultado da operação: " + resultado);
                    break;
                
                case "*":
                    resultado = (primeiroNumero * segundoNumero);
                    System.out.println("Resultado da operação: " + resultado);
                    break;
                
                case "/":
                    resultado = (primeiroNumero / segundoNumero);
                    System.out.println("Resultado da operação: " + resultado);
                    break;
                    
                case "s":
                    menu = false;
                    System.out.println("Encerrando programa...");
                    break;
                    
                default:
                    System.out.println("Opção inválida. \nTente novamente.");
                    break;
            } // fim da Estrutura Condicional_SWITCH-CASE
            
        } // fim do laço de repetição infinito_WHILE
        
        painel.close();
        System.out.println("\t\nTarefa conluída!");
    }
}