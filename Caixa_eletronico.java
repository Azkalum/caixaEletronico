package caixa_eletronico;

import java.util.Scanner;

public class Caixa_eletronico {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        //Váriaveis
        String cpfcerto = "123.456.789-00";
        String cpfdigitado;
        String senhadigitada;
        String senhacorreta = "123456";
        double saldo = 1000;
        int numero = 1;
        double deposito = 0;
        double saque, saquer = 0;
        int senhaincorreta = 0;

        //Início
        do {
        System.out.println("================================================");
        System.out.println("////////////////// Bem Vindo! //////////////////");
        System.out.println("/////////// Caixa Eletrônico Marciola! /////////");
        System.out.println("================================================");

        //Colher Informações do CPF
        System.out.println("Informe seu CPF com pontos e traços para continuar: ");
        cpfdigitado = ler.next();
        
        //Verificação CPF 
            if (cpfdigitado.equals(cpfcerto)) {
                senhaincorreta++;

                System.out.println("Digite sua senha! ");

                //Colher informações da SENHA
                senhadigitada = ler.next();

                //Verificar SENHA
                if (senhadigitada.equals(senhacorreta)) {
                    senhaincorreta++;
                    
                    //Menu
                    while (numero != 4) {
                        System.out.println("===============================================");
                        System.out.println("Escolha à informação Desejada! ");
                        System.out.println("1 – Saldo ");
                        System.out.println("2 – Depósito ");
                        System.out.println("3 – Saque ");
                        System.out.println("0 – Sair  ");
                        System.out.println("===============================================");

                        //Leitura de dados do Menu e contas
                        numero = ler.nextInt();

                        //Opções do Menu
                        switch (numero) {
                            case 1:
                                System.out.println("O seu saldo é de: " + "R$" + saldo);
                                break;
                            case 2:
                                System.out.println("Informe o valor que deseja depositar: ");
                                deposito = ler.nextDouble();
                                deposito = deposito + saldo;
                                saldo = deposito;
                                System.out.println("O valor do depósito somado ao saldo atual é: " + "R$ " + saldo);
                                break;
                            case 3:
                                System.out.println("Informe o valor que deseja sacar! ");
                                saque = ler.nextDouble();
                                saquer = saque - saldo;
                                saldo = saquer;
                                System.out.println("O valor sacado foi de: " + "R$ " + saque);
                                break;
                            case 0:
                                System.out.println("Você selecionou sair! Até à próxima! :D ");
                                break;
                            default:
                                System.out.println("Digite um número de 1 à 3, ou 0 para sair! ");
                        }
                    
                    }
                    
                } else {
                    System.out.println("Senha errada! Tente de novo! ");
                    senhaincorreta++;
                }

            } else {
                senhaincorreta++;
                
            }

        } while (senhaincorreta < 3 && cpfdigitado != cpfcerto);
        System.out.println("Usuário bloqueado! ");
    }

}
