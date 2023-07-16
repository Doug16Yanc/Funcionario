//Programa em Java que realiza cadastro de funcionários de uma empresa que faz uma catalogação de//
//seus funcionários por quatro tipos: fixo, diarista, horista e comissionado; a fim de customizar, foi//
//utilizado uma superclasse abstrata "Empregado" que tem comportamento hereditário em se tratando de atributos//
//e métodos com as subclasses concretas. A classe auxiliar "Cadastro" possui relação de composição com a superclasse//
//e, consequentemente, aponta suas ações implementadas para todas as subclasses. A realização de cadastro do funcionário//
//respeita todos os atributos e métodos das subclasses e utiliza a função ArrayList do Java com especificador de acesso//
//estático.//

import java.util.Scanner;
import java.util.ArrayList;

public class Main
{

    static Scanner scan = new Scanner(System.in);

    static ArrayList<Cadastro>cadastroFixos;
    static ArrayList<Cadastro>cadastroDiaristas;
    static ArrayList<Cadastro>cadastroHoristas;
    static ArrayList<Cadastro>cadastroComissionados;

    public static void main(String[] args)
    {
        cadastroFixos = new ArrayList<>();
        cadastroDiaristas = new ArrayList<>();
        cadastroHoristas = new ArrayList<>();
        cadastroComissionados = new ArrayList<>();
        menu();
    }
    static void menu()
    {

        System.out.println("========Bem-vindo(a) ao nosso sistema empresarial============\n");
        System.out.println("========Selecione uma opção que desejas=======================\n");
        System.out.println("===============================================================\n");
        System.out.println("    | Alternativa 1 : Realizar cadastro de funcionário  |\n");
        System.out.println("    | Alternativa 2 : Gerar lista de funcionários cadastrados  |\n");
        System.out.println("    | Alternativa 3 : Encerrar aplicação   |\n");

        int opcao = scan.nextInt();

        switch(opcao)
        {
            case 1:
                criarCadastro();
                break;
            case 2:
                gerarLista();
            case 3:
                System.out.println("Doug agradece a interação com esse sistema, Até logo!");
                System.exit(0);
            default:
                System.out.println("Alternativa inexistente!");
                break;
        }
    }


    private static void criarCadastro()
    {
        System.out.println("Você escolheu realizar o cadastro de funcionário...\n");
        System.out.println("===================================================\n");
        System.out.println("Escolha que tipo de funcionário quer cadastrar:\n");
        System.out.println("Observação (em caso de nome duplo, utilize a notação ' _ '.\n");
        System.out.println("===================================================\n");
        System.out.println("  |         Tipos de funcionarios         |\n  ");
        System.out.println("  |         1 : Fixo                      |\n");
        System.out.println("  |         2 : Diarista                  |\n");
        System.out.println("  |         3 : Horista                   |\n");
        System.out.println("  |         4 : Comissionado              |\n");
        System.out.println("============================================\n");

        int alternativa = scan.nextInt();

        switch(alternativa)
        {
            case 1:
                cadastrarFixo();
                break;
            case 2:
                cadastrarDiarista();
                break;
            case 3:
                cadastrarHorista();
                break;
            case 4:
                cadastrarComissionado();
            default:
                System.out.println("Não há essa alternativa.");
        }

    }
    private static void cadastrarFixo()
    {
        System.out.println("Realizando cadastro de funcionário fixo:\n");

        System.out.printf("nome:");
        String nome = scan.next();

        System.out.printf("id: ");
        int id = scan.nextInt();

        System.out.printf("Salário fixo mensal (R$) : ");
        double salarioFixo = scan.nextDouble();

        EmpregadoFixo empregadoFixo = new EmpregadoFixo(nome, id, salarioFixo);

        Cadastro cadastro = new Cadastro(empregadoFixo);

        cadastro.toString();

        cadastroFixos.add(cadastro);

        System.out.println("Cadastro de funcionário realizado com sucesso.\n");

        menu();
    }
    private static void cadastrarDiarista()
    {
        System.out.println("Realizando cadastro de funcionário diarista:\n");

        System.out.printf("nome:");
        String nome = scan.next();

        System.out.printf("id: ");
        int id = scan.nextInt();

        System.out.printf("quantidade de dias de serviços prestados: ");
        int quantidadeDias = scan.nextInt();

        System.out.printf("pagamento diário (R$) : ");
        double salarioPorDia= scan.nextDouble();

        EmpregadoDiarista empregadoDiarista = new EmpregadoDiarista(nome, id, quantidadeDias, salarioPorDia);

        Cadastro cadastro1 = new Cadastro(empregadoDiarista);


        cadastroDiaristas.add(cadastro1);

        System.out.println("Cadastro de funcionário realizado com sucesso.\n");

        menu();
    }
    private static void cadastrarHorista()
    {
        System.out.println("Realizando cadastro de funcionário horista:\n");

        System.out.printf("nome:");
        String nome = scan.next();

        System.out.printf("id: ");
        int id = scan.nextInt();

        System.out.printf("quantidade de horas de serviços prestados: ");
        double quantidadeHoras = scan.nextDouble();

        System.out.printf("pagamento por hora (R$) : ");
        double salarioHora = scan.nextDouble();

        EmpregadoHorista empregadoHorista = new EmpregadoHorista(nome, id, quantidadeHoras, salarioHora);

        Cadastro cadastro2 = new Cadastro(empregadoHorista);

        cadastro2.toString();

        cadastroHoristas.add(cadastro2);

        System.out.println("Cadastro de funcionário realizado com sucesso.\n");

        menu();
    }
    private static void cadastrarComissionado()
    {
        System.out.println("Realizando cadastro de funcionário comissionado:\n");

        System.out.printf("nome:");
        String nome = scan.next();

        System.out.printf("id: ");
        int id = scan.nextInt();

        System.out.printf("valor da comissão desse funcionário (R$): ");
        double valorComissao = scan.nextDouble();

        System.out.printf("valor das vendas efetuadas por esse funcionário (R$) : ");
        double valorVendas = scan.nextDouble();

        EmpregadoComissionado empregadoComissionado = new EmpregadoComissionado(nome, id, valorComissao, valorVendas);

        Cadastro cadastro3 = new Cadastro(empregadoComissionado);

        cadastro3.toString();

        cadastroComissionados.add(cadastro3);

        System.out.println("Cadastro de funcionário realizado com sucesso.\n");

        menu();
    }

    private static void gerarLista()
    {
        System.out.println("Você selecionou a opção de gerar a lista de empregados cadastrados:\n");
        System.out.println("==============Selecione uma das opções=============================\n");
        System.out.println("    | 1 - Gerar lista geral                                  |\n");
        System.out.println("    | 2 - Gerar lista somente dos  funcionários fixos        |\n");
        System.out.println("    | 3 - Gerar lista somente dos funcionários diaristas     |\n");
        System.out.println("    | 4 - Gerar lista somente dos funcionários horistas      |\n");
        System.out.println("    | 5 - Gerar lista somente dos funcionários comissionados |\n");
        System.out.println("    | 6 - Voltar para o menu inicial                         |\n");

        int alter = scan.nextInt();

        switch (alter)
        {
            case 1:
                gerarListaGeral();
                break;
            case 2:
                gerarListaFixo();
                break;
            case 3:
                gerarListaDiarista();
                break;
            case 4:
                gerarListaHorista();
                break;
            case 5:
                gerarListaComissionado();
                break;
            case 6:
                menu();
            default:
                System.out.println("Opção inexistente!");
        }

    }
    private static void gerarListaGeral()
    {
        System.out.println("Providenciando lista de funcionários cadastrados.\n");

        System.out.println("Empregados fixos:\n");

        if (cadastroFixos.size() > 0)
        {

            for (Cadastro cadastro : cadastroFixos)
            {
                System.out.println(cadastro.toString());
            }
        }
        else
        {
            System.out.println("\nNão há cadastros realizados.\n...");

        }
        System.out.println("Empregados diaristas:\n");

        if (cadastroDiaristas.size() > 0)
        {
            for (Cadastro cadastro1 : cadastroDiaristas)
            {
                System.out.println(cadastro1.toString());
            }
        }
        else
        {
            System.out.println("Não há cadastros realizados\n.");

        }
        System.out.println("Empregados horistas:\n");

        if (cadastroHoristas.size() > 0)
        {
            for (Cadastro cadastro2 : cadastroHoristas)
            {
                System.out.println(cadastro2.toString());
            }
        }
        else
        {
            System.out.println("Não há cadastros realizados.\n...");

        }
        System.out.println("Empregados comissionados:\n");

        if (cadastroComissionados.size() > 0)
        {

            for (Cadastro cadastro3 : cadastroComissionados) {
                System.out.println(cadastro3.toString());
            }
        }
        else
        {
            System.out.println("\nNão há cadastros realizados.\n...");
        }

        menu();
    }
    private static void gerarListaFixo()
    {
        System.out.println("Empregados fixos:\n");

        if (cadastroFixos.size() > 0)
        {
            for (Cadastro cadastro : cadastroFixos)
            {
                System.out.println(cadastro.toString());
            }
        }
        else
        {
            System.out.println("Não há cadastros realizados.\n...");

        }
        menu();
    }
    private static void gerarListaDiarista()
    {
        System.out.println("Empregados diaristas:\n");

        if (cadastroDiaristas.size() > 0)
        {
            for (Cadastro cadastro1 : cadastroDiaristas) {
                System.out.println(cadastro1.toString());
            }
        }
        else
        {
            System.out.println("Não há cadastros realizados.\n...");

        }
        menu();

    }
    private static void gerarListaHorista()
    {
        System.out.println("Empregados horistas:\n");

        if (cadastroHoristas.size() > 0)
        {


            for (Cadastro cadastro2 : cadastroHoristas)
            {
                System.out.println(cadastro2.toString());
            }
        }
        else
        {
            System.out.println("Não há cadastros realizados.\n...");

        }
        menu();
    }
    private static void gerarListaComissionado()
    {
        System.out.println("Empregados comissionados:\n");

        if (cadastroComissionados.size() > 0)
        {

            for (Cadastro cadastro3 : cadastroComissionados) {
                System.out.println(cadastro3.toString());
            }
        }
        else
        {
            System.out.println("Não há cadastros realizados.\n...");
        }
        menu();
    }
}