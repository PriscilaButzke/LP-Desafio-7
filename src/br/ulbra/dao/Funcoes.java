 package br.ulbra.dao;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Priscila Butzke
 */
public class Funcoes {
    
public ArrayList<Pessoa> fila = new ArrayList();

    /*adiona pessoa a fila
    Na view, estacia a classe pessoa, guarda todos os dados para cadastro e chama a função gravar.*/
    public void gravar(Pessoa p) {
        fila.add(p);
        System.out.println(p.getNome() + ", adicionado(a) na fila com sucesso!");
    }

    //exibe a 1° pessoa da fila
    public String proximoFila(){
        String proximo;
        if(fila.isEmpty()){
             proximo = "Fila está vazia.";
        }else{
            proximo = "O proximo a ser atendido é: " + fila.get(0).getNome();
        }            
        return proximo;
    }
    
    //listar fila de espera ou mostarr que ela se vazia se for o caso
    public String listarFila() {
        String resultado = "Fila de espera: \n";
        if (fila.isEmpty()) {
            resultado = " Fila está vazia";
        } else {
            for (int i = 0; i < fila.size(); i++) {
                resultado += "Nome: " + fila.get(i).getNome() 
                        + "\nCEP: " + fila.get(i).getCep()
                        + "\nN° " + fila.get(i).getNumero()
                        + "\nRua: " + fila.get(i).getRua()
                        + "\nComplemento: " + fila.get(i).getCompl() 
                        + "\nBairro: " + fila.get(i).getBairro()
                        + "\nCidade: " + fila.get(i).getCidade()
                        + "\n__________________";
            }
        }
        return resultado;
    }

    //busca a pessoa da fila através do nome
    public int buscarCliente(Pessoa p) {
        int aux = -1;
        for (int i = 0; i < fila.size(); i++) {
            if (fila.get(i).getNome().equals(p.getNome())) {
                aux = i; //quando encontrar guarda o indice da pessoa na variavel aux
            }
        }
        return aux;
    }
    // listar cliente
    public void consultar(int i){
        System.out.println("Consulta:"
                +"\nNome: " + fila.get(i).getNome()
                +"\nCPF: " + fila.get(i).getCpf()
                +"\nRua" + fila.get(i).getRua()
                +"\nN°: " + fila.get(i).getNumero()
                +"\nBairro: " + fila.get(i).getBairro()
                +"\nCEP: " + fila.get(i).getCep() 
                +"\nCidade: " + fila.get(i).getCidade());
    }
    
    //atender 1° pessoa da fila
    public void atender() {
        int opcao;
        Scanner ler = new Scanner(System.in);
        System.out.println("Tem certeza? (1 = Sim ou 2 = Não");
        opcao = ler.nextInt();
        if (opcao == 1) {
            fila.remove(0);
            System.out.println("Pessoa atendida com sucesso!");
        }else if(opcao == 2){
            System.out.println("Atendimento cancelado");
        }
        else {
            System.out.println("Número digitado inválido.");
        }
    }
    
    // Situação da fila- vazia ou quantas pessoas
    public void situacaoFila(){
        if(fila.isEmpty()){
            System.out.println("Fila está vazia");
        }else{
            System.out.println("A fila possui " + fila.size() + " pessoa(as)");
        } 
    } 
}