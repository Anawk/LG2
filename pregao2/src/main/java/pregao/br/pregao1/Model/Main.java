package pregao.br.pregao1.Model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import static pregao.br.pregao1.Model.Corretora.*;
import static pregao.br.pregao1.Model.Investidor.*;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        List<Corretora> corretoras = new ArrayList<>();
        List<Acao> acoes = new ArrayList<>(); // Lista geral de todas as ações
        List<Acao> acoesDisponiveis = new ArrayList<>(); // Lista de ações disponíveis para transação

        List<Investidor> investidores = new ArrayList<>();
        List<Transacao> transacoes = new ArrayList<>();

        acoes.add(new Acao("Cemig", "CMIG4", "0.984f", 105, 52.5f));
        acoes.add(new Acao("Cielo", "CIEL3", "0.332f", 85, 42.5f));
        acoes.add(new Acao("Cogna", "COGN3", "0.194f", 75, 37.5f));
        acoes.add(new Acao("Copel", "CPLE6", "0.687f", 90, 45.0f));
        acoes.add(new Acao("Cosan", "CSAN3", "0.942f", 80, 40.0f));
        acoes.add(new Acao("CPFL Energia", "CPFE3", "0.322f", 100, 50.0f));
        acoes.add(new Acao("CSN Mineração", "CMIN3", "0.277f", 115, 57.5f));
        acoes.add(new Acao("CVC", "CVCB3", "0.042f", 130, 65.0f));
        acoes.add(new Acao("Cyrela", "CYRE3", "0.228f", 75, 37.5f));
        acoes.add(new Acao("Dexco", "DXCO3", "0.093f", 105, 52.5f));
        acoes.add(new Acao("Eletrobras", "ELET3", "3.735f", 95, 47.5f));
        acoes.add(new Acao("Eletrobras", "ELET6", "0.554f", 115, 57.5f));
        acoes.add(new Acao("Embraer", "EMBR3", "0.769f", 110, 55.0f));
        acoes.add(new Acao("Energias do Brasil", "ENBR3", "0.309f", 80, 40.0f));
        acoes.add(new Acao("Energisa", "ENGI11", "0.591f", 120, 60.0f));
        acoes.add(new Acao("Eneva", "ENEV3", "0.987f", 100, 50.0f));
        acoes.add(new Acao("Engie", "EGIE3", "0.594f", 85, 42.5f));
        acoes.add(new Acao("Equatorial", "EQTL3", "1.658f", 130, 65.0f));
        acoes.add(new Acao("Eztec", "EZTC3", "0.075f", 75, 37.5f));
        acoes.add(new Acao("Fleury", "FLRY3", "0.325f", 110, 55.0f));
        acoes.add(new Acao("Gerdau", "GGBR4", "1.508f", 105, 52.5f));
        acoes.add(new Acao("Metalúrgica Gerdau", "GOAU4", "0.424f", 95, 47.5f));
        acoes.add(new Acao("Gol", "GOLL4", "0.084f", 115, 57.5f));
        acoes.add(new Acao("Natura & Co.", "NTCO3", "0.509f", 75, 37.5f));
        acoes.add(new Acao("Grupo Soma", "SOMA3", "0.221f", 85, 42.5f));
        acoes.add(new Acao("Hapvida", "HAPV3", "0.669f", 105, 52.5f));
        acoes.add(new Acao("Hypera", "HYPE3", "0.819f", 120, 60.0f));
        acoes.add(new Acao("Iguatemi", "IGTI11", "0.246f", 100, 50.0f));

        acoesDisponiveis.addAll(acoes); // Inicialmente, todas as ações estão disponíveis

        int escolha;
        do {
            System.out.println("----- Menu -----");
            System.out.println("1. Cadastrar Investidor");
            System.out.println("2. Cadastrar Corretora");
            System.out.println("3. Cadastrar Ação");
            System.out.println("4. Realizar Transação");
            System.out.println("5. Exibir Histórico de Transações de um Investidor");
            System.out.println("6. Exibir Estado Atual das Ações");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    cadastrarInvestidor(investidores, scanner);
                    break;
                case 2:
                    cadastrarCorretora(corretoras, scanner);
                    break;
                case 3:
                    cadastrarAcoes(acoes, scanner);
                    break;
                case 4:
                    realizarTransacao(investidores, corretoras, acoes, transacoes, acoesDisponiveis, scanner);
                    break;
                case 5:
                    if (!investidores.isEmpty()) {
                        System.out.println("Escolha um investidor para exibir o histórico:");
                        listarInvestidores(investidores);
                        int indiceInvestidor = scanner.nextInt();

                        if (indiceInvestidor >= 0 && indiceInvestidor < investidores.size()) {
                            Investidor investidorEscolhido = investidores.get(indiceInvestidor);
                            exibirHistoricoTransacoes(investidores, transacoes, scanner);
                        } else {
                            System.out.println("Índice de investidor inválido.");
                        }
                    } else {
                        System.out.println("Não há investidores cadastrados.");
                    }
                    break;
// No seu switch, mantenha a case 6 como está
                case 6:
                    exibirEstadoAtualAcoes(acoes);
                    break;
                case 0:
                    System.out.println("Saindo do programa. Até logo!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (escolha != 0);

        scanner.close();
    }


    private static void cadastrarInvestidor(List<Investidor> investidores, Scanner scanner) {
        System.out.println("----- Cadastrar Investidor -----");

        System.out.print("ID do investidor: ");
        int id = scanner.nextInt();

        // Solicitar dados do investidor ao usuário
        System.out.print("Nome do investidor: ");
        String nome = scanner.next();

        scanner.nextLine();

        System.out.print("Data de nascimento (dd/MM/yyyy): ");
        String dataNascimentoStr = scanner.next();
        Date dataNascimento = converterStringParaData(dataNascimentoStr);

        System.out.print("CPF: ");
        String cpf = scanner.next();

        System.out.print("CEP: ");
        String cep = scanner.next();

        System.out.print("E-mail: ");
        String email = scanner.next();

        System.out.print("Bairro: ");
        String bairro = scanner.next();

        System.out.print("Logradouro: ");
        String logradouro = scanner.next();

        System.out.print("Senha: ");
        String senha = scanner.next();

        System.out.print("Nome de usuário: ");
        String usuario = scanner.next();

        // Criar uma instância de Investidor
        Investidor investidor = new Investidor( nome, dataNascimento, cpf, cep, email, bairro, logradouro, senha, usuario);

        // Adicionar o investidor à lista de investidores
        investidores.add(investidor);

        System.out.println("Investidor cadastrado com sucesso!");
    }


    private static Date converterStringParaData(String dataStr) {
        try {
            return new SimpleDateFormat("dd/MM/yyyy").parse(dataStr);
        } catch (ParseException e) {
            System.out.println("Erro ao converter a data. Formato incorreto.");
            return null;
        }
    }

    private static void cadastrarCorretora(List<Corretora> corretoras, Scanner scanner) {
        System.out.println("----- Cadastrar Corretora -----");

        System.out.print("Razão Social: ");
        String razaoSocial = scanner.next();

        System.out.print("CNPJ: ");
        long cnpj = scanner.nextLong();

        System.out.print("Nome Fantasia: ");
        String nomeFantasia = scanner.next();

        System.out.print("E-mail: ");
        String email = scanner.next();

        System.out.print("Logradouro: ");
        String logradouro = scanner.next();

        System.out.print("CEP: ");
        String cep = scanner.next();

        System.out.print("Bairro: ");
        String bairro = scanner.next();

        System.out.print("Senha: ");
        String senha = scanner.next();

        System.out.print("Nome de usuário: ");
        String usuario = scanner.next();

        // Crie uma instância de Corretora
        Corretora corretora = new Corretora(razaoSocial, cnpj, nomeFantasia, email, logradouro, cep, bairro, senha, usuario);

        // Agora, vamos lidar com os telefones
        System.out.print("Quantos telefones a corretora possui? ");
        int numTelefones = scanner.nextInt();

        for (int i = 0; i < numTelefones; i++) {
            System.out.println("Telefone #" + (i + 1));

            System.out.print("DDD: ");
            int ddd = scanner.nextInt();

            System.out.print("Número: ");
            int numero = scanner.nextInt();


            // Adicione o telefone à lista de telefones da corretora
            Corretora_Telefone.adicionarTelefone(corretora.getTelefones(), ddd, numero);


        }
        System.out.println("Corretora cadastrada com sucesso!");
    }

    private static void cadastrarAcoes(List<Acao> acoes, Scanner scanner) {
        System.out.println("----- Cadastrar Ações -----");

        char continuarCadastro;
        do {
            Acao acao = cadastrarAcao(acoes, scanner);

            if (acao != null) {
                // Adicione a ação à lista de ações
                acoes.add(acao);
                System.out.println("Ação cadastrada com sucesso!");
            } else {
                System.out.println("Erro ao cadastrar ação. Tente novamente.");
            }

            System.out.print("Deseja cadastrar outra ação? (S/N): ");
            continuarCadastro = scanner.next().charAt(0);

        } while (Character.toUpperCase(continuarCadastro) == 'S');
    }

    private static Acao cadastrarAcao(List<Acao> acoes, Scanner scanner) {
        try {
            System.out.print("Nome: ");
            String nome = scanner.next();

            System.out.print("Sigla: ");
            String sigla = scanner.next();

            System.out.print("Variação: ");
            String variacao = scanner.next();

            System.out.print("Quantidade de Movimentação: ");
            int qtdMovimentacao = scanner.nextInt();

            System.out.print("Valor da Ação: ");
            float valorAcao = scanner.nextFloat();

            // Crie uma instância de Acao
            return new Acao(nome, sigla, variacao, qtdMovimentacao, valorAcao);
        } catch (InputMismatchException e) {
            System.out.println("Erro: Insira valores válidos para a Ação.");
            scanner.next(); // Limpar o buffer do scanner
            return null;
        }
    }



    private static Acao escolherAcao(List<Acao> acoesDisponiveis, Scanner scanner) {
        System.out.println("----- Escolher Ação -----");

        if (acoesDisponiveis.isEmpty()) {
            System.out.println("Não há ações disponíveis.");
            return null;
        }

        listarAcoes(acoesDisponiveis);

        Acao acaoEscolhida;

        do {
            System.out.print("Escolha a sigla da ação: ");
            String siglaEscolhida = scanner.next();

            // Verificar se a sigla existe na lista de ações disponíveis
            acaoEscolhida = acoesDisponiveis.stream()
                    .filter(acao -> acao.getSigla().equalsIgnoreCase(siglaEscolhida))
                    .findFirst()
                    .orElse(null);

            if (acaoEscolhida == null) {
                System.out.println("Sigla inválida. Tente novamente.");
            }
        } while (acaoEscolhida == null);

        acoesDisponiveis.remove(acaoEscolhida);

        return acaoEscolhida;
    }


    private static void realizarTransacao(List<Investidor> investidores, List<Corretora> corretoras, List<Acao> acoes, List<Transacao> transacoes, List<Acao> acoesDisponiveis, Scanner scanner) {
        System.out.println("----- Realizar Transação -----");

        // Obter detalhes da transação
        System.out.print("Nome fantasia da Corretora Vendedora: ");
        String nomeCorretoraVendedora = scanner.next();

        scanner.nextLine();

        System.out.print("Data e Hora (dd/MM/yyyy HH:mm): ");
        String dataHoraString = scanner.nextLine(); // Usando nextLine() para ler a linha completa
        Date dataHora = converterStringParaDate(dataHoraString);

        System.out.print("ID Investidor Comprador: ");
        int id = scanner.nextInt();
        Investidor investidorComprador = encontrarInvestidorPorID(investidores, id);
        if (investidorComprador != null) {
            this.idInvestidorComprador = investidorComprador.getId();
        } else {
            System.out.println("Investidor Comprador não encontrado. Transação cancelada.");
            // Você pode optar por lançar uma exceção aqui ou tratar de outra forma, dependendo da lógica do seu programa.
        }


        System.out.print("Valor da Negociação: ");
        float valorNegociacao = scanner.nextFloat();

        System.out.print("Tipo (Compra/Venda): ");
        String tipo = scanner.next();

        System.out.print("Status: ");
        String status = scanner.next();

        System.out.print("Quantidade de Ações: ");
        int qtdAcoes = scanner.nextInt();

        System.out.print("Comissão: ");
        float comissao = scanner.nextFloat();

        Acao acao = escolherAcao(acoesDisponiveis, scanner);

        Transacao transacao = new Transacao(nomeCorretoraVendedora, dataHora, id, valorNegociacao, tipo, status, qtdAcoes, comissao, acao
        );

        // Adicionar a transação à lista de transações
        transacoes.add(transacao);

        System.out.println("Transação realizada com sucesso!");
    }



    // Função auxiliar para encontrar um investidor por ID
    static Investidor encontrarInvestidorPorID(List<Investidor> investidores, int id) {
        for (Investidor investidor : investidores) {
            if (investidor.getId() == id) {
                return investidor;
            }
        }
        return null;
    }


    private static Date converterStringParaDate(String dataString) {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        try {
            return formato.parse(dataString);
        } catch (ParseException e) {
            System.out.println("Formato de data inválido. Tente novamente.");
            return null;
        }
    }

    private static Acao escolherOuCadastrarAcao(List<Acao> acoes, Scanner scanner) {
        System.out.print("Deseja escolher uma ação existente (S/N)? ");
        String opcao = scanner.next();

        if (opcao.equalsIgnoreCase("N")) {
            // Criar uma nova ação
            return cadastrarAcao(acoes, scanner);
        }

        // Listar e escolher uma ação existente
        listarAcoes(acoes);
        System.out.print("Escolha o número da ação: ");
        int indice = scanner.nextInt();

        if (indice >= 0 && indice < acoes.size()) {
            return acoes.get(indice);
        } else {
            System.out.println("Índice inválido. Criando uma nova ação...");
            return cadastrarAcao(acoes, scanner);
        }
    }

            private static void listarAcoes (List < Acao > acoes) {
                System.out.println("----- Lista de Ações -----");
                for (Acao acao : acoes) {
                    System.out.println("Sigla: " + acao.getSigla() + " - Preço: " + acao.getValorAcao());
                }
                System.out.println("");
            }


            private static void exibirHistoricoTransacoes(List < Investidor > investidores, List < Transacao > transacoes, Scanner scanner){
                System.out.println("----- Exibir Histórico de Transações de um Investidor -----");

                // Solicitar ID do investidor ao usuário
                System.out.print("ID do investidor: ");
                int idInvestidor = scanner.nextInt();

                // Encontrar o investidor na lista
                Investidor investidor = encontrarInvestidorPorID(investidores, idInvestidor);

                if (investidor != null) {
                    // Exibir o histórico de transações do investidor
                    List<Transacao> historico = investidor.getHistoricoTransacoes();
                    for (Transacao transacao : historico) {
                        System.out.println(transacao); // Supondo que você tenha um método toString em Transacao
                    }
                } else {
                    System.out.println("Investidor não encontrado.");
                }
            }







        private static void exibirEstadoAtualAcoes (List < Acao > acoes) {
            System.out.println("----- Estado Atual das Ações -----");
            if (acoes.isEmpty()) {
                System.out.println("Não há ações cadastradas.");
            } else {
                for (Acao acao : acoes) {
                    System.out.println("Nome: " + acao.getNome());
                    System.out.println("Sigla: " + acao.getSigla());
                    System.out.println("Variação: " + acao.getVariacao());
                    System.out.println("Quantidade de Movimentação: " + acao.getQtdMovimentacao());
                    System.out.println("Valor da Ação: " + acao.getValorAcao());
                    System.out.println("------------------------------");
                }
            }
        }

   private static Corretora encontrarCorretoraPorNome(List<Corretora> corretoras, String nome) {
        for (Corretora corretora : corretoras) {
            if (corretora.getNomeFantasia().equalsIgnoreCase(nome)) {
                return corretora;
            }
        }
        return null; // Retorna null se a corretora não for encontrada
    }


    }
