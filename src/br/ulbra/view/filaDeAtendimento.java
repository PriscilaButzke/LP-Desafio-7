package br.ulbra.view;

import br.ulbra.dao.Funcoes;
import br.ulbra.dao.Pessoa;
import java.util.Scanner;

/**
 *
 * @author Priscila Butzke
 */
public class filaDeAtendimento {

    public static void main(String[] args) {
        int op = 1;
        Scanner ler = new Scanner(System.in);
        Funcoes f = new Funcoes();

        /*     private String nome;
     private int cpf;
     private String cep;
     private String numero;
     private String rua;
     private String compl;
     private String bairro;
     private String cidade;
    
1- Inserir novo cliente na fila. --ok gravar()
2- Próximo a ser atendido (Mostra o primeiro da fila) -- ok proximoFila()
3- Mostrar a fila --ok listarFila()
4- Atender Pessoa (retirar a primeira pessoa da fila – REMOVER O PRIMEIRO) -- ok atender()
5- Buscar cliente pelo nome -- ok buscarCliente()
6- Mostrar se ela está vazia =- ok situcaoFila()
7- Verificar quantos clientes estão na fila. -- ok quant()
8- Sair
         */
        while (op != 7) {
            System.out.println("_____________________________"
                    + "\n| 1- Inserir cliente na fila |"
                    + "\n| 2- Mostrar próximo da fila |"
                    + "\n| 3- Mostrar fila            |"
                    + "\n| 4- Atender pessoa          |"
                    + "\n| 5- Buscar cliente          |"
                    + "\n| 6- Situação da fila        |"
                    + "\n| 7- Sair do menu            |"
                    + "\n_____________________________"
                    + "\n"
                    + "Opção desejada: ");
            op = ler.nextInt();

            switch (op) {
                //inserir cliente na fila
                case 1:
                    ler.nextLine();
                    Pessoa pessoa = new Pessoa();
                    System.out.println("Fila Eletrônica:");
                    System.out.println("Nome: ");
                    pessoa.setNome(ler.nextLine());

                    System.out.println("CPF: (11 digitos)");
                    pessoa.setCpf(ler.nextLine());

                    System.out.println("Cadastro de endereço " + "\nRua:");
                    pessoa.setRua(ler.nextLine());

                    System.out.println("CEP:");
                    pessoa.setCep(ler.nextLine());

                    System.out.println("Número: ");
                    pessoa.setNumero(ler.nextLine());

                    System.out.println("Complemento: ");
                    pessoa.setCompl(ler.nextLine());

                    System.out.println("Bairro: ");
                    pessoa.setBairro(ler.nextLine());

                    System.out.println("Cidade: ");
                    pessoa.setCidade(ler.nextLine());

                    f.gravar(pessoa);
                    break;

                case 2:  //mostrar proximo da fila 
                    System.out.println(f.proximoFila());
                    break;

                case 3: //proximo da fila
                    System.out.println( f.listarFila()); //fica dentro de um sout pois ele tem retorno
                    break;

                case 4: //atender pessoa
                    f.atender(); //fica fora do solte pq não tem retorno
                    break;

                case 5: //buscar cliente
                    ler.nextLine();
                    Pessoa p = new Pessoa();
                    System.out.println("Informe o nome do cliente: ");
                    p.setNome(ler.nextLine());
                    int indice = f.buscarCliente(p);
                    if (indice != -1) {
                        f.consultar(indice);
                    } else {
                        System.out.println("Cliente não consta.");
                    }
                    break;
                case 6: //situação da fila
                    f.situacaoFila();
                    break;
                case 7://sair do menu
                    System.out.println("Bye");
            }
        }
    }
}
