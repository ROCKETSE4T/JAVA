package modules.module1.flowControl;

import java.util.Random;

public class FlowControl {
    private static int attempts = 0;
    public static void main(String[] args) {
        // ===============================
        // Controladores de fluxo
        // ===============================

        int idade = 17;
        String medida = "M";

        // If & else
        if (idade >= 18) {
            System.out.println("Maior idade");
        }else if (idade >= 15 && idade < 18) {
            System.out.println("Adolescente");
        }else{
            System.out.println("Criança");
        }

        //Atribuição ternária
        String resposta = idade >= 18 ? "Maior idade" : idade >= 15 && idade < 18 ? "Adolescente" : "Criança";
        System.out.println(resposta);


        //Switch case - Bom para comparar o valor de uma váriavel com diferentes possibilidades
        //OBS - O Java possui o comportamento fall-through (queda contínua).
        switch (medida) {
            case "P":{
                System.out.println("Pequeno");
                break;
            }
            case "M": {
                System.out.println("Médio");
                break;

            }
            case "G":{
                System.out.println("Grande");
                break;

            }
            default: {
                System.out.println("Nenhuma medida");
            }

        }


        // For - Para contador menor que 10, continue printando o meu valor

        int maximo = 10;

        for (int i = 0; i < maximo; i++) {
            System.out.println(i);
        }

        int numero = 0;

        // While - Enquanto meu numero nao for 10, incremente 1
        while (numero <= 10){
            System.out.println(numero);
            numero++;
        }

        // Do While - Ele sempre vai executar ao menos uma vez o primeiro bloco de codigo
        int attempts = 0;
        do{
            System.out.println("Trim trim...");
        }while (tocando());




//        //Palavras de intervenção do fluxo
//        // Break - Interrompe o fluxo como um todo
//        // continue - Interrompe apenas a iteração atual
//
//        String[] nomes = {"Ana", "Bruno", "Carlos", "Diana"};
//
//        for (String nome : nomes){
//            if (nome.equals("Bruno")){
//                continue;
//            }
//            System.out.println(nome);
//        }







    }


    private static boolean tocando(){
        boolean isRinging = new Random().nextInt(10) != 1;
        if (isRinging && attempts <= 10){
            System.out.println("Ainda não atendeu");
            attempts++;

        }

        if(attempts > 10){
            System.out.println("Não Atendeu");
            return false;
        }

        if(!isRinging){
            System.out.println("Atendeu");

        }



        return isRinging;
    }
}
