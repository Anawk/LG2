import entity.*;
import util.FilaDinamica;
import util.Pilha;

import java.util.List;


public class Main {
    public static void main(String[] args) {


        Investidor investidor1 = new Investidor("Gustavo", 100.50);
        Investidor investidor2 = new Investidor("Gabriel Luna", 50.50);
        Investidor investidor3 = new Investidor("Ana Maria", 100.50);
        Investidor investidor4 = new Investidor("Brenda Giron", 50.50);

        FilaDinamica<Investidor> filaDinamica = new FilaDinamica<>();

        filaDinamica.adicionar(investidor1);
        filaDinamica.adicionar(investidor2);
        filaDinamica.adicionar(investidor3);
        filaDinamica.remover();

        Pilha<Investidor> investidorPilha = new Pilha<>();

        System.out.println(filaDinamica.toString());


        Ativo ativo1 = new Ativo("Ativo MagazineLuiza", "Consumo E Varejo", 2.55, "MGLU3", 50000);
        Ativo ativo2 = new Ativo("Ativo Hapvida", "Saúde", 4.44, "HAPV3", 5025);
        Ativo ativo3 = new Ativo("Ativo Petrobras", "Petroleo", 33.37, "PETR4", 100);
        Ativo ativo4 = new Ativo("Ativo Cielo", "Financeiro", 3.68, "CIEL3", 10000);

        Bolsa bolsa1 = new Bolsa("B3");
        Bolsa bolsa2 = new Bolsa("NYSE ");



        Carteira carteira1 = new Carteira("Carteira",2600.00,investidor1);


        Corretora corretora1 = new Corretora("XP Investimentos");
        Corretora corretora2 = new Corretora("Clear Corretora");
        Corretora corretora3 = new Corretora("Rico Investimentos");
        Corretora corretora4 = new Corretora("Banco Inter");

    }
}
