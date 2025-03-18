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

        /*O que falta colocar no codigo:
        texto na pergunta da opção de equação ou sair
        exibir o resultado da equação*/
        
        Scanner painel = new Scanner(System.in);

//        iniciar variaveis necessarias.
        Boolean menu = true;
        int primeiroNumero;
        int segundoNumero;
        float resultado;
        String operacao;
        
//        inicar laço de retição infinito condicional.
        while (menu) {
            // apresentar menu com as opções.
            System.out.println("\tExercício 1.4 - Menu de Calculadora");
            System.out.println("+. Adição; \n-. Subtração; \n*. Multiplicação; \n/. Divisão;");
            System.out.println("s. Sair.");
            
            // usuario escolhe os dois numeros componentes da equação
            System.out.print("Digite o primeiro número da operação: ");
            primeiroNumero = painel.nextInt();

            System.out.print("Digite o segundo número da operação: ");
            segundoNumero = painel.nextInt();

            // usuario escolhe o tipo de operação
            operacao = painel.next();

            switch (operacao) {
                case "+":
                    resultado = (primeiroNumero + segundoNumero);
                    break;

                case "-":
                    resultado = (primeiroNumero - segundoNumero);
                    break;

                case "*":
                    resultado = (primeiroNumero * segundoNumero);
                    break;

                case "/":
                    resultado = (primeiroNumero / segundoNumero);
                    break;

                case "s":
                    menu = false;
                    break;
            
                default:
                System.out.println("Operação inválida. \nTente novamente.");
                    break;
            } // fim do switch-case
        } // fim do laço de retição infinito WHILE
        
        painel.close();
        System.out.println("\n\tTarefa concluída!");
    }
}
