import entity.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);




        Corretora corretora1 = new Corretora("XP Investimentos");
        Corretora corretora2 = new Corretora("Clear Corretora");
        Corretora corretora3 = new Corretora("Rico Investimentos");
        Corretora corretora4 = new Corretora("Banco Inter");

        System.out.println("========================================");
        System.out.println("|               Bem Vindo              |");
        System.out.println("========================================");
        Corretora.corretora();

        System.out.println("|               Cadastro:              |");
        System.out.print("|Digite o nome do investidor:            |");
        String Nome = scanner.nextLine();

        System.out.print("|Digite a idade do investidor:           |");
        int Idade = scanner.nextInt();

        System.out.print("|Digite o email do usuário:              |");
        String Email = scanner.nextLine();

        System.out.println("|Seu cadastro foi efetuado com sucesso!|");
        System.out.println("|Seus Dados são:                       |");
        //Investidor investidor1 = new Investidor(Nome,Idade,Email, get);
        System.out.println("|Dados do investidor:");
       // System.out.println(investidor1.toString());
        System.out.println("Digite o valor que deseja depositar:");
        double valorDeposito = scanner.nextDouble();
        scanner.nextLine();
        Investidor.depositar(valorDeposito);



        Ativo ativo1 = new Ativo("Ativo MagazineLuiza", "Consumo E Varejo", 2.55, "MGLU3", 50000);
        Ativo ativo2 = new Ativo("Ativo Hapvida", "Saúde", 4.44, "HAPV3", 5025);
        Ativo ativo3 = new Ativo("Ativo Petrobras", "Petroleo", 33.37, "PETR4", 100);
        Ativo ativo4 = new Ativo("Ativo Cielo", "Financeiro", 3.68, "CIEL3", 10000);

        System.out.println("Ativos Disponíveis:" + ativo1.toString());
        System.out.println("Ativos Disponíveis:" + ativo2.toString());
        System.out.println("Ativos Disponíveis:" + ativo3.toString());
        System.out.println("Ativos Disponíveis:" + ativo4.toString());

        scanner.close();









        Bolsa bolsa1 = new Bolsa("B3");
        Bolsa bolsa2 = new Bolsa("NYSE ");



        Carteira carteira1 = new Carteira("Carteira",2600.00,investidor1);




    }
}
